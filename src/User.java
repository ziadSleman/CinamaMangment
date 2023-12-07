public class User {
    private String username;
    private String password;
    private String userDetails;

    public User(String username, String password, String userDetails) {
        this.username = username;
        this.password = password;
        this.userDetails = userDetails;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserDetails() {
        return this.userDetails;
    }

    public void setUserDetails(String userDetails) {
        this.userDetails = userDetails;
    }

    public String toString() {
        return "User{username='" + this.username + "', userDetails='" + this.userDetails + "'}";
    }

}
