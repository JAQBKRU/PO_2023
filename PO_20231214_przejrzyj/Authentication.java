public interface Authentication {
    public abstract boolean login(String username, String password);
    public abstract void logout();
    public abstract boolean resetPassword(String username, String oldPassword, String newPassword);
}

class UserAuthentication implements Authentication{
    private String username;
    private String password;

    public UserAuthentication(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    @Override
    public void logout() {
        System.out.println("Wylogowano usera");
    }

    @Override
    public boolean resetPassword(String username, String oldPassword, String newPassword) {
        if(this.username.equals(username) && this.password.equals(oldPassword)) {
            this.password = newPassword;
            return true;
        }
        return false;
    }
}

class AdminAuthentication implements Authentication{
    private String adminUsername;
    private String adminPassword;

    public AdminAuthentication(String adminUsername, String adminPassword) {
        this.adminUsername = adminUsername;
        this.adminPassword = adminPassword;
    }

    @Override
    public boolean login(String username, String password) {
        return this.adminUsername.equals(username) && this.adminPassword.equals(password);
    }

    @Override
    public void logout() {
        System.out.println("Wylogowano admina");
    }

    @Override
    public boolean resetPassword(String username, String oldPassword, String newPassword) {
        if(this.adminUsername.equals(username) && this.adminPassword.equals(oldPassword)) {
            this.adminPassword = newPassword;
            return true;
        }
        return false;
    }
}
