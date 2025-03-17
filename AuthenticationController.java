package Interfaces.AuthenticationOps;

public class AuthenticationController implements AuthController {

    @Override
    public boolean login(String username, String password) {
        return false;
    }

    @Override
    public boolean logout(int userID) {
        return false;
    }

    @Override
    public boolean resetPassword(String email) {
        return false;
    }
}
