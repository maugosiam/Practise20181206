public class User implements Comparable<User> {

    String firstName;
    String lastName;
    int age;

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public int compareTo(User o) {
        User x = (User) o;
        if (age > x.age) {
            return 1;
        } else if (age < x.age) {
            return -1;
        } else
           return 0;
    }

}

