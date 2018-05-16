package mylist;

public class Base {

    public static void main(String[] args) {
        MyList<String> list = new MyList();
        list.addLast("Gus");
        list.addLast("Valley");
        list.addLast("+");
        list.addLast("Colin");
        list.addLast("Donovan");
        list.addLast("=");
        list.addLast("Guslin");
        list.addLast("Vallovan");
        System.out.println(list.toString());
        list.addFirst("Test");
        System.out.println(list.toString());
        list.addLast("Another Test");
        System.out.println(list.toString());
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.get(3));
        System.out.println(list.toString());
        System.out.println(list.contains("Valley"));
        System.out.println(list.contains("c"));
        list.insertAt(3, "herro");
        System.out.println(list.toString());
        list.insertAt(18, "Hi");
        System.out.println(list.toString());
        list.insertBefore("Colin", "Yes this is another test");
        System.out.println(list.toString());
        list.insertAfter("Colin", "Yet another test");
        System.out.println(list.toString());
    }
    
}
