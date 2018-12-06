import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Program {

    public static void main(String args[]) {

        ArrayList<User> users = new ArrayList<>();

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


        LinkedList<User> usersInLinkedList = new LinkedList<>();

        usersInLinkedList.add(new User("Jakub", "Szczygiel", 14));
        usersInLinkedList.add(new User("Niko", "Zalewski", 14));
        usersInLinkedList.add(new User("Nikita", "Grusha", 19));
        usersInLinkedList.add(new User("Nedfds", "G", 19));
        usersInLinkedList.add(new User("Adfdsfd", "Grusha", 15));
        usersInLinkedList.add(new User("Bsadsa", "Grusha", 45));
        usersInLinkedList.add(new User("Cdsfsdf", "Grusha", 56));
        usersInLinkedList.add(new User("Dsdfasd", "Grusha", 78));
        usersInLinkedList.add(new User("Esfsdf", "Grusha", 20));
        usersInLinkedList.add(new User("Fdgdry", "Grusha", 99));
        usersInLinkedList.add(new User("Getsdfd", "Grusha", 39));
        usersInLinkedList.add(new User("Hfsefsd", "Grusha", 48));
        usersInLinkedList.add(new User("Jsarewqee", "Grusha", 33));
        usersInLinkedList.add(new User("Kwrwes", "Grusha", 30));
        usersInLinkedList.add(new User("Lrsere", "Grusha", 41));

        usersInLinkedList.forEach(m -> System.out.println(m.firstName+" "+m.lastName+" "+m.age));

        System.out.println("**************** Linked List **********************");
        usersInLinkedList.sort(User::compareTo);
        usersInLinkedList.forEach(m -> System.out.println(m.firstName+" "+m.lastName+" "+m.age));
    }
}
