package mylist;

public class Base {

    public static void main(String[] args) {
        MyList list = new MyList();
        list.add("Gus");
        list.add("Valley");
        list.add("+");
        list.add("Colin");
        list.add("Donovan");
        list.add("=");
        list.add("Guslin");
        list.add("Vallovan");
        list.print();
        System.out.println("--------------------------------------");
        list.insert(3, "NO");
        list.print();
        System.out.println("--------------------------------------");
        list.remove(3);
        list.print();
    }
    
}
