package Interfaces.AuthenticationOps;
/**
 * @author Luis Duque
 * CEN 4010 RVF 1251
 * PID: 6410684
 * This interface takes care of all user authentication operations
 */
public interface AuthController {
    /**
     * Authenticates user through a username and password verification
     * @param username The user's custom username or userID
     * @param password The user's password. Must contain uppercase, lowercase, at least 8 characters, and at least 1 special symbol
     * return true if password entered matches the password connected to the username
     */
    boolean login(String username, String password);

    /**
     * Logs out the current user based on their userID
     * @param userID The ID of the user being logged out
     * @return true if logout is successful and user, false otherwise
     */
    boolean logout(int userID);

    /**
     * Allows the user to reset the password associated to their account
     * @param email The email connected as backup to the username and userID
     * @return true if password reset link was sent to the email, false otherwise
     */
    boolean resetPassword(String email);
}
