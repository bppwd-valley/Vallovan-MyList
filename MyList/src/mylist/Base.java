package mylist;

public class Base {

    public static void main(String[] args) {
        MyList list = new MyList();
        list.addLast("Gus");
        list.addLast("Valley");
        list.addLast("+");
        list.addLast("Colin");
        list.addLast("Donovan");
        list.addLast("=");
        list.addLast("Guslin");
        list.addLast("Vallovan");
        list.print();
        System.out.println("--------------------------------------");
        list.insertAt(3, "NO");
        list.print();
        System.out.println("--------------------------------------");
        list.remove(3);
        list.print();
        System.out.println("--------------------------------------");
        list.addFirst("TEST");
        list.print();
        System.out.println("--------------------------------------");
        System.out.println("Get first:");
        System.out.println(list.getFirst());
        System.out.println("--------------------------------------");
        System.out.println("Get last:");
        System.out.println(list.getLast());
        System.out.println("--------------------------------------");
        System.out.println(list.toString());
    }
    
}
