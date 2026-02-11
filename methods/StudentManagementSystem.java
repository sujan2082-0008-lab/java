package oop.methods;

import java.util.*;
import java.util.stream.Collectors;
import java.util.function.Supplier;

// Interface for common student behaviors
interface StudentActions {
    void displayInfo();
    double calculatePercentage();
    String getPerformanceGrade();
}

// Abstract class for common student properties
abstract class Person {
    protected String name;
    protected long phone;

    public Person(String name, long phone) {
        this.name = name;
        this.phone = phone;
    }

    public abstract String getContactInfo();

    // Template method pattern
    public final void displayContact() {
        System.out.println("Contact: " + getContactInfo());
    }
}

// Exception for invalid student data
class InvalidStudentDataException extends RuntimeException {
    public InvalidStudentDataException(String message) {
        super(message);
    }
}

// Immutable record for marks details (Java 14+ feature)
record MarksDetail(int marks, int maxMarks) {
    public MarksDetail {
        if (marks < 0 || marks > maxMarks) {
            throw new IllegalArgumentException("Marks must be between 0 and " + maxMarks);
        }
    }

    public double percentage() {
        return ((double) marks / maxMarks) * 100;
    }
}

// Enum for grade classification
enum GradeLevel {
    A_PLUS("A+", 90, 100),
    A("A", 80, 89),
    B_PLUS("B+", 70, 79),
    B("B", 60, 69),
    C("C", 50, 59),
    F("F", 0, 49);

    private final String symbol;
    private final int minScore;
    private final int maxScore;

    GradeLevel(String symbol, int minScore, int maxScore) {
        this.symbol = symbol;
        this.minScore = minScore;
        this.maxScore = maxScore;
    }

    public static GradeLevel fromScore(int score) {
        for (GradeLevel grade : values()) {
            if (score >= grade.minScore && score <= grade.maxScore) {
                return grade;
            }
        }
        return F;
    }

    public String getSymbol() {
        return symbol;
    }
}

// Final StudentRecord class with encapsulation
final class StudentRecord extends Person implements StudentActions, Comparable<StudentRecord> {
    private final int rollNumber;
    private final int gradeLevel;
    private final MarksDetail marksDetail;
    private static int studentCount = 0;

    // Factory method pattern
    public static StudentRecord createStudent(int rollNumber, String name, int gradeLevel,
                                              int marks, long phone) {
        return new StudentRecord(rollNumber, name, gradeLevel, marks, phone);
    }

    // Builder pattern
    public static class Builder {
        private int rollNumber;
        private String name;
        private int gradeLevel;
        private int marks;
        private long phone;

        public Builder rollNumber(int rollNumber) {
            this.rollNumber = rollNumber;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder gradeLevel(int gradeLevel) {
            this.gradeLevel = gradeLevel;
            return this;
        }

        public Builder marks(int marks) {
            this.marks = marks;
            return this;
        }

        public Builder phone(long phone) {
            this.phone = phone;
            return this;
        }

        public StudentRecord build() {
            return new StudentRecord(rollNumber, name, gradeLevel, marks, phone);
        }
    }

    private StudentRecord(int rollNumber, String name, int gradeLevel, int marks, long phone) {
        super(name, phone);
        validateInput(rollNumber, name, gradeLevel, marks, phone);
        this.rollNumber = rollNumber;
        this.gradeLevel = gradeLevel;
        this.marksDetail = new MarksDetail(marks, 100); // Assuming max marks is 100
        studentCount++;
    }

    private void validateInput(int rollNumber, String name, int gradeLevel, int marks, long phone) {
        if (rollNumber <= 0) {
            throw new InvalidStudentDataException("Roll number must be positive");
        }
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidStudentDataException("Name cannot be empty");
        }
        if (gradeLevel < 1 || gradeLevel > 12) {
            throw new InvalidStudentDataException("Grade must be between 1 and 12");
        }
        if (phone < 1000000000L || phone > 9999999999L) {
            throw new InvalidStudentDataException("Phone number must be 10 digits");
        }
    }

    // Getters with defensive copying where needed
    public int getRollNumber() { return rollNumber; }
    public String getName() { return name; }
    public int getGradeLevel() { return gradeLevel; }
    public int getMarks() { return marksDetail.marks(); }
    public long getPhone() { return phone; }

    public static int getStudentCount() {
        return studentCount;
    }

    @Override
    public void displayInfo() {
        System.out.println(this);
    }

    @Override
    public double calculatePercentage() {
        return marksDetail.percentage();
    }

    @Override
    public String getPerformanceGrade() {
        return GradeLevel.fromScore(marksDetail.marks()).getSymbol();
    }

    @Override
    public String getContactInfo() {
        return String.format("Phone: %d", phone);
    }

    @Override
    public String toString() {
        return String.format("""
            Student Record:
            ----------------
            Roll No: %d
            Name: %s
            Grade: %d
            Marks: %d/100
            Percentage: %.2f%%
            Grade: %s
            Phone: %d
            """,
                rollNumber, name, gradeLevel, marksDetail.marks(),
                calculatePercentage(), getPerformanceGrade(), phone);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentRecord)) return false;
        StudentRecord that = (StudentRecord) o;
        return rollNumber == that.rollNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNumber);
    }

    @Override
    public int compareTo(StudentRecord other) {
        return Integer.compare(this.rollNumber, other.rollNumber);
    }
}

// Repository pattern for student data management
interface StudentRepository {
    void addStudent(StudentRecord student);
    Optional<StudentRecord> findById(int rollNumber);
    List<StudentRecord> findAll();
    List<StudentRecord> findByGrade(int grade);
    void deleteStudent(int rollNumber);
    double getClassAverage();
    Map<String, Long> getGradeDistribution();
}

class InMemoryStudentRepository implements StudentRepository {
    private final Map<Integer, StudentRecord> students = new TreeMap<>();

    @Override
    public void addStudent(StudentRecord student) {
        students.put(student.getRollNumber(), student);
    }

    @Override
    public Optional<StudentRecord> findById(int rollNumber) {
        return Optional.ofNullable(students.get(rollNumber));
    }

    @Override
    public List<StudentRecord> findAll() {
        return new ArrayList<>(students.values());
    }

    @Override
    public List<StudentRecord> findByGrade(int grade) {
        return students.values().stream()
                .filter(s -> s.getGradeLevel() == grade)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteStudent(int rollNumber) {
        students.remove(rollNumber);
    }

    @Override
    public double getClassAverage() {
        return students.values().stream()
                .mapToDouble(StudentRecord::calculatePercentage)
                .average()
                .orElse(0.0);
    }

    @Override
    public Map<String, Long> getGradeDistribution() {
        return students.values().stream()
                .collect(Collectors.groupingBy(
                        StudentRecord::getPerformanceGrade,
                        Collectors.counting()
                ));
    }
}

// Service class with business logic
class StudentService {
    private final StudentRepository repository;
    private final Scanner scanner;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
        this.scanner = new Scanner(System.in);
    }

    public void addNewStudent() {
        try {
            System.out.println("\n=== Add New Student ===");

            System.out.print("Roll Number: ");
            int rollNumber = getValidInput(() -> {
                int input = scanner.nextInt();
                if (repository.findById(input).isPresent()) {
                    throw new InvalidStudentDataException("Roll number already exists");
                }
                return input;
            });

            scanner.nextLine(); // Clear buffer

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Grade (1-12): ");
            int grade = getValidInput(() -> {
                int input = scanner.nextInt();
                if (input < 1 || input > 12) {
                    throw new IllegalArgumentException("Grade must be between 1 and 12");
                }
                return input;
            });

            System.out.print("Marks (0-100): ");
            int marks = getValidInput(() -> {
                int input = scanner.nextInt();
                if (input < 0 || input > 100) {
                    throw new IllegalArgumentException("Marks must be between 0 and 100");
                }
                return input;
            });

            System.out.print("Phone (10 digits): ");
            long phone = getValidInput(() -> {
                long input = scanner.nextLong();
                if (String.valueOf(input).length() != 10) {
                    throw new IllegalArgumentException("Phone must be 10 digits");
                }
                return input;
            });

            // Using builder pattern
            StudentRecord student = new StudentRecord.Builder()
                    .rollNumber(rollNumber)
                    .name(name)
                    .gradeLevel(grade)
                    .marks(marks)
                    .phone(phone)
                    .build();

            repository.addStudent(student);
            System.out.println("Student added successfully!");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private <T> T getValidInput(Supplier<T> supplier) {
        while (true) {
            try {
                return supplier.get();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input type. Please try again.");
                scanner.next(); // Clear invalid input
            } catch (IllegalArgumentException | InvalidStudentDataException e) {
                System.out.println(e.getMessage() + " Please try again.");
            }
        }
    }

    public void displayAllStudents() {
        List<StudentRecord> students = repository.findAll();
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        System.out.println("\n=== All Students ===");
        students.forEach(StudentRecord::displayInfo);

        System.out.printf("Class Average: %.2f%%\n", repository.getClassAverage());
        System.out.println("Grade Distribution: " + repository.getGradeDistribution());
    }

    public void searchStudent() {
        System.out.print("\nEnter roll number to search: ");
        int rollNumber = scanner.nextInt();

        repository.findById(rollNumber)
                .ifPresentOrElse(
                        student -> {
                            System.out.println("\nStudent Found:");
                            student.displayInfo();
                        },
                        () -> System.out.println("Student not found with roll number: " + rollNumber)
                );
    }

    public void close() {
        scanner.close();
    }
}

// Main application class
public class StudentManagementSystem {
    public static void main(String[] args) {
        StudentRepository repository = new InMemoryStudentRepository();
        StudentService service = new StudentService(repository);

        try (Scanner mainScanner = new Scanner(System.in)) {
            while (true) {
                displayMenu();
                int choice = getMenuChoice(mainScanner);

                switch (choice) {
                    case 1 -> service.addNewStudent();
                    case 2 -> service.displayAllStudents();
                    case 3 -> service.searchStudent();
                    case 4 -> {
                        System.out.println("\nTotal Students: " + StudentRecord.getStudentCount());
                        System.out.println("Thank you for using Student Management System!");
                        return;
                    }
                    default -> System.out.println("Invalid choice. Please try again.");
                }
            }
        } finally {
            service.close();
        }
    }

    private static void displayMenu() {
        System.out.println("\n=== STUDENT MANAGEMENT SYSTEM ===");
        System.out.println("1. Add New Student");
        System.out.println("2. View All Students");
        System.out.println("3. Search Student");
        System.out.println("4. Exit");
        System.out.print("Enter your choice (1-4): ");
    }

    private static int getMenuChoice(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number (1-4): ");
                scanner.next(); // Clear invalid input
            }
        }
    }
}