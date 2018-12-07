import java.util.*;

public class Program {

    public static void main(String args[]) {

        List<User> users = new ArrayList<>();

        users.add(new User("Jakub", "Szczygiel", 14));
        users.add(new User("Niko", "Zalewski", 14));
        users.add(new User("Nikita", "Grusha", 19));
        users.add(new User("Ndsfdsfds", "G", 19));
        users.add(new User("Adfsdf", "Grusha", 15));
        users.add(new User("Bfbdsjffd", "Grusha", 45));
        users.add(new User("Cwdbsd", "Grusha", 56));
        users.add(new User("Dyrgyer", "Grusha", 78));
        users.add(new User("Esdds", "Grusha", 20));
        users.add(new User("Fbfhdsf", "Grusha", 99));
        users.add(new User("Gsdgs", "Grusha", 39));
        users.add(new User("Hjdbfd", "Grusha", 48));
        users.add(new User("Jdfjbdsjf", "Grusha", 33));
        users.add(new User("Kjdfsd", "Grusha", 30));
        users.add(new User("Lbhfdgf", "Grusha", 41));

        users.forEach(m -> System.out.println(m.firstName+" "+m.lastName+" "+m.age));
        users.sort(User::compareTo);
        System.out.println("*************** Array List *******************");
        users.forEach(m -> System.out.println(m.firstName+" "+m.lastName+" "+m.age));

        Collections.shuffle(users);

        System.out.println("***************** s h u f f l e *********");
        users.forEach(m -> System.out.println(m.firstName+" "+m.lastName+" "+m.age));


        List<User> usersInLinkedList = new LinkedList<>();

        usersInLinkedList.addAll(users);
        usersInLinkedList.forEach(m -> System.out.println(m.firstName+" "+m.lastName+" "+m.age));

        System.out.println("**************** Linked List **********************");
        usersInLinkedList.sort(User::compareTo);
        usersInLinkedList.forEach(m -> System.out.println(m.firstName+" "+m.lastName+" "+m.age));
    }
}
