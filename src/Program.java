import java.util.*;

public class Program {

    public static void main(String args[]) {

        List<User> usersInArrayList = new ArrayList<>();

        usersInArrayList.add(new User("Jakub", "Szczygiel", 14));
        usersInArrayList.add(new User("Niko", "Zalewski", 14));
        usersInArrayList.add(new User("Nikita", "Grusha", 19));
        usersInArrayList.add(new User("Ndsfdsfds", "G", 19));
        usersInArrayList.add(new User("Adfsdf", "Grusha", 15));
        usersInArrayList.add(new User("Bfbdsjffd", "Grusha", 45));
        usersInArrayList.add(new User("Cwdbsd", "Grusha", 56));
        usersInArrayList.add(new User("Dyrgyer", "Grusha", 78));
        usersInArrayList.add(new User("Esdds", "Grusha", 20));
        usersInArrayList.add(new User("Fbfhdsf", "Grusha", 99));
        usersInArrayList.add(new User("Gsdgs", "Grusha", 39));
        usersInArrayList.add(new User("Hjdbfd", "Grusha", 48));
        usersInArrayList.add(new User("Jdfjbdsjf", "Grusha", 33));
        usersInArrayList.add(new User("Kjdfsd", "Grusha", 30));
        usersInArrayList.add(new User("Lbhfdgf", "Grusha", 41));

        usersInArrayList.forEach(m -> System.out.println(m.getGetFirstName()+" "+m.getLastName()+" "+m.getAge()));
        //usersInArrayList.sort(User::compareTo);
        Collections.sort(usersInArrayList);
        System.out.println("*************** Array List *******************");
        usersInArrayList.forEach(m -> System.out.println(m.getGetFirstName()+" "+m.getLastName()+" "+m.getAge()));

        Collections.shuffle(usersInArrayList);

        System.out.println("***************** s h u f f l e *********");
        usersInArrayList.forEach(m -> System.out.println(m.getGetFirstName()+" "+m.getLastName()+" "+m.getAge()));


        List<User> usersInLinkedList = new LinkedList<>();

        usersInLinkedList.addAll(usersInArrayList);
        usersInLinkedList.forEach(m -> System.out.println(m.getGetFirstName()+" "+m.getLastName()+" "+m.getAge()));

        System.out.println("**************** Linked List **********************");
        //usersInLinkedList.sort(User::compareTo);
        Collections.sort(usersInLinkedList);
        usersInLinkedList.forEach(m -> System.out.println(m.getGetFirstName()+" "+m.getLastName()+" "+m.getAge()));
    }
}
