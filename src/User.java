public class User implements Comparable<User> {



    private String getFirstName;
    private String getLastName;
    private int age;



    public String getGetFirstName() {
        return getFirstName;
    }

    public String getLastName() {
        return getLastName;
    }

    public int getAge() {
        return age;
    }

    public User(String firstName, String lastName, int age) {
        this.getFirstName = firstName;
        this.getLastName = lastName;
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

