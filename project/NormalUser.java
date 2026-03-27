//import java.util.ArrayList;
//
///**
// * NormalUser - Subclass of User representing a student on campus.
// * Member 2: User Experience Developer
// * Demonstrates: Inheritance, Method Overriding, Encapsulation
// */
//public class NormalUser extends User {
//
//    // Private field - Encapsulation
//    private ArrayList<GreenActivity> myActivities;
//
//    // Constructor - calls superclass constructor via super()
//    public NormalUser(String id, String name, String email, String password) {
//        super(id, name, email, "Student", password);
//        this.myActivities = new ArrayList<>();
//    }
//
//    // Method Overriding - overrides abstract method from User
//    @Override
//    public void displayRole() {
//        System.out.println("==========================================");
//        System.out.println(" Access Level : Student");
//        System.out.println(" Name         : " + getName());
//        System.out.println(" You can log and view your green activities.");
//        System.out.println("==========================================");
//    }
//
//    /**
//     * Logs a new eco-friendly activity for this user.
//     * @param activityType The type of green activity performed.
//     */
//    public void logActivity(String activityType) {
//        if (activityType == null || activityType.trim().isEmpty()) {
//            System.out.println("[ERROR] Activity type cannot be empty.");
//            return;
//        }
//        GreenActivity activity = new GreenActivity(activityType.trim());
//        myActivities.add(activity);
//        System.out.println("[SUCCESS] Activity logged: \"" + activity.getActivityType()
//                + "\" | Points earned: " + activity.getPoints());
//    }
//
//    /**
//     * Displays a summary of all activities logged by this user.
//     */
//    public void viewMyActivities() {
//        System.out.println("\n--- Your Green Activity Log ---");
//        if (myActivities.isEmpty()) {
//            System.out.println("No activities recorded yet. Start logging!");
//            return;
//        }
//        int totalPoints = 0;
//        for (int i = 0; i < myActivities.size(); i++) {
//            GreenActivity a = myActivities.get(i);
//            System.out.println((i + 1) + ". " + a.getActivityType()
//                    + " [" + a.getDate() + "] - " + a.getPoints() + " pts");
//            totalPoints += a.getPoints();
//        }
//        System.out.println("Total Activities : " + myActivities.size());
//        System.out.println("Total Points     : " + totalPoints);
//        System.out.println("-------------------------------");
//    }
//
//    /**
//     * Returns the list of activities (used by Admin for reporting).
//     */
//    public ArrayList<GreenActivity> getMyActivities() {
//        return myActivities;
//    }
//
//    /**
//     * Displays an interactive menu for the NormalUser.
//     */
//    public void showMenu(java.util.Scanner scanner) {
//        int choice = 0;
//        do {
//            System.out.println("\n===== Student Menu =====");
//            System.out.println("1. Log a Green Activity");
//            System.out.println("2. View My Activities");
//            System.out.println("3. Logout");
//            System.out.print("Enter choice (1-3): ");
//
//            try {
//                if (!scanner.hasNextInt()) {
//                    System.out.println("[ERROR] Please enter a number between 1 and 3.");
//                    scanner.nextLine(); // flush bad input
//                    continue;
//                }
//                choice = scanner.nextInt();
//                scanner.nextLine(); // consume newline
//
//                switch (choice) {
//                    case 1:
//                        System.out.println("\nSelect an activity:");
//                        System.out.println("  1. Walking or Cycling to Campus");
//                        System.out.println("  2. Saving Electricity");
//                        System.out.println("  3. Using Reusable Materials");
//                        System.out.println("  4. Planting Trees");
//                        System.out.println("  5. Reducing Plastic Usage");
//                        System.out.print("Your choice: ");
//                        if (!scanner.hasNextInt()) {
//                            System.out.println("[ERROR] Invalid selection.");
//                            scanner.nextLine();
//                            break;
//                        }
//                        int actChoice = scanner.nextInt();
//                        scanner.nextLine();
//                        String[] activities = {
//                                "Walking or Cycling to Campus",
//                                "Saving Electricity",
//                                "Using Reusable Materials",
//                                "Planting Trees",
//                                "Reducing Plastic Usage"
//                        };
//                        if (actChoice >= 1 && actChoice <= activities.length) {
//                            logActivity(activities[actChoice - 1]);
//                        } else {
//                            System.out.println("[ERROR] Invalid activity number.");
//                        }
//                        break;
//                    case 2:
//                        viewMyActivities();
//                        break;
//                    case 3:
//                        logout();
//                        break;
//                    default:
//                        System.out.println("[ERROR] Invalid choice. Enter 1, 2, or 3.");
//                }
//            } catch (Exception e) {
//                System.out.println("[ERROR] Unexpected error: " + e.getMessage());
//                scanner.nextLine();
//            }
//        } while (choice != 3);
//    }
//}