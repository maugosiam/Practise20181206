import java.util.Comparator;

public class UsersComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        User firstUser = (User) o1;
        User secondUser = (User) o2;

        if (firstUser.getAge() == secondUser.getAge()) {
            return firstUser.getLastName().compareTo(secondUser.getLastName());
        }
        else
            return -1;

    }
}