package singleton;

public class Main {
    public static void main(String[] args) {
        DashUser donna = new DashUser("Donna", "Admin");
        DashUser steven = new DashUser("Steven", "Admin");
        DashUser bob = new DashUser("Bob", "Visitor");
        donna.printUserType();
        steven.printUserType();
        bob.printUserType();
    }
}