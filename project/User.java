/**
 * User - Abstract superclass for all users.
 * Demonstrates: Encapsulation (private fields), Abstraction (abstract method)
 */
public abstract class User {
    private String userID;
    private String name;
    private String email;
    private String role;
    private String password;

    public User(String userID, String name, String email, String role, String password) {
        this.userID = userID;
        this.name   = name;
        this.email  = email;
        this.role   = role;
        this.password = password;
    }

    // Getters / Setters (Encapsulation)
    public String getUserID()   { return userID; }
    public String getName()     { return name; }
    public String getEmail()    { return email; }
    public String getRole()     { return role; }
    public String getPassword() { return password; }
    public void setName(String name)         { this.name = name; }
    public void setEmail(String email)       { this.email = email; }
    public void setPassword(String password) { this.password = password; }

    public boolean login(String inputPassword) {
        if (this.password.equals(inputPassword)) {
            System.out.println("[LOGIN] Welcome, " + name + "! Role: " + role);
            return true;
        }
        System.out.println("[LOGIN] Incorrect password.");
        return false;
    }

    public void logout() {
        System.out.println("[LOGOUT] Goodbye, " + name + "!");
    }

    // Abstract method - each subclass must override this
    public abstract void displayRole();
}