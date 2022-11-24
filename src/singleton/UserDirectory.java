package singleton;

/**
 * UserDirectory Singleton class to manage instances of users
 * @author Donna Nguyen
 */

public class UserDirectory {
    private static UserDirectory user;
    private UserDirectory () {}
    public static UserDirectory getInstance() {
        if (user == null) {
            user = new UserDirectory();
        }
        return user;
    }
    public void print (String text) {
        System.out.println(text);
    }
}
