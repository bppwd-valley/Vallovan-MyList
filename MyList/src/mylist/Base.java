package mylist;

public class Base {

    public static void main(String[] args) {
        MyList<Integer> list = new MyList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.addLast(7);
        list.addLast(8);
        list.print();
        System.out.println("--------------------------------------");
        list.insertAt(3, 300);
        list.print();
        System.out.println("--------------------------------------");
        list.remove(3);
        list.print();
        System.out.println("--------------------------------------");
        list.addFirst(600);
        list.print();
        System.out.println("--------------------------------------");
        System.out.println(list.toString());
    }
    
}
