package use_case.logout;

/**
 * The Input Data for the Logout Use Case.
 */
public class LogoutInputData {
    private String username;

    public LogoutInputData(String username) {
        this.username = username;
    }

    /**
     * Returns the username associated with the object.
     * @return the username
     */
    public String getUsername() {
        return this.username;
    }

}
