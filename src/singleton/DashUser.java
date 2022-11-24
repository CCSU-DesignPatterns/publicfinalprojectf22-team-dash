package singleton;

/**
 * DashUser class to manage users of the dashboard.
 * @author Donna Nguyen
 **/

public class DashUser {
    private final String name;
    private final String userType;

    public DashUser(String name, String userType) {
        this.name = name;
        this.userType = userType;
    }
    public void printUserType() {
        UserDirectory user = UserDirectory.getInstance();
        user.print(name + " - " + userType);
    }
}
