import java.util.Comparator;

public class UsersComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        User firstUser = (User) o1;
        User secondUser = (User) o2;

        if(firstUser.getAge()>secondUser.getAge()){
            return 1;
        }
        if(firstUser.getAge()<secondUser.getAge()){
            return -1;
            }
        if(firstUser.getAge()==secondUser.getAge()){
            return -1*secondUser.getLastName().compareTo(firstUser.getLastName());
            }
            else return 0;

    }
}