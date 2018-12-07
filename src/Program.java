import java.util.*;

public class Program {

    public static void main(String args[]) {

        List<User> usersInArrayList = new ArrayList<>();

        usersInArrayList.add(new User("Jakub", "Szczygiel", 22));
        usersInArrayList.add(new User("Niko", "Zalewski", 14));
        usersInArrayList.add(new User("Nikita", "Grusha", 15));
        usersInArrayList.add(new User("Małgorzata", "Majchrowicz", 15));
        usersInArrayList.add(new User("Donald", "Trump", 15));
        usersInArrayList.add(new User("Zxxxx", "Zzzzzzzzzzz", 22));
        usersInArrayList.add(new User("Cwdbsd", "Grusha", 56));
        usersInArrayList.add(new User("Dyrgyer", "Grusha", 78));
        usersInArrayList.add(new User("Esdds", "Grusha", 20));
        usersInArrayList.add(new User("Fbfhdsf", "Grusha", 99));
        usersInArrayList.add(new User("Gsdgs", "Grusha", 39));
        usersInArrayList.add(new User("Hjdbfd", "Grusha", 48));
        usersInArrayList.add(new User("Jdfjbdsjf", "Grusha", 33));
        usersInArrayList.add(new User("Kjdfsd", "Grusha", 30));
        usersInArrayList.add(new User("Lbhfdgf", "Grusha", 41));

        System.out.println("*************** Array List nieposortowana *******************");
        usersInArrayList.forEach(m -> System.out.println(m.getGetFirstName()+" "+m.getLastName()+" "+m.getAge()));
        System.out.println("*************** Array List niepozortowana koniec*******************\n\n");
        //usersInArrayList.sort(User::compareTo);
        Collections.sort(usersInArrayList);
        System.out.println("*************** Array List posortowana wiekiem *******************");
        usersInArrayList.forEach(m -> System.out.println(m.getGetFirstName()+" "+m.getLastName()+" "+m.getAge()));
        System.out.println("*************** Array List posortowana wiekiem koniec*******************\n\n");

        Collections.sort(usersInArrayList,new UsersComparator());
        System.out.println("*************** Array List *******************");
        usersInArrayList.forEach(m -> System.out.println(m.getGetFirstName()+" "+m.getLastName()+" "+m.getAge()));
        System.out.println("*************** Array List koniec*******************\n\n");

        Collections.shuffle(usersInArrayList);

        System.out.println("***************** ArrayList after s h u f f l e *********");
        usersInArrayList.forEach(m -> System.out.println(m.getGetFirstName()+" "+m.getLastName()+" "+m.getAge()));
        System.out.println("***************** ArrayList after s h u f f l e koniec *********\n\n");

        List<User> usersInLinkedList = new LinkedList<>();

        usersInLinkedList.addAll(usersInArrayList);
        //usersInLinkedList.forEach(m -> System.out.println(m.getGetFirstName()+" "+m.getLastName()+" "+m.getAge()));

        System.out.println("**************** Linked List **********************");
        Collections.sort(usersInLinkedList);
        usersInLinkedList.forEach(m -> System.out.println(m.getGetFirstName()+" "+m.getLastName()+" "+m.getAge()));
        System.out.println("**************** Linked List koniec **********************\n\n");

        System.out.println("**************** Linked List sorted **********************");
        Collections.sort(usersInLinkedList,new UsersComparator());
        usersInLinkedList.forEach(m -> System.out.println(m.getGetFirstName()+" "+m.getLastName()+" "+m.getAge()));
    }
}
