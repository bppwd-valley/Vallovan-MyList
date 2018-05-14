package mylist;

public class MyList {
    
    Node head;
    
    public MyList() {
        head = new Node();
    }
    
    public void add(String value){
        if (head.getValue() == null){
            head.setValue(value);
        }
        else {
            Node tmp = head;
            while(tmp.next.getValue() != null){
                tmp = tmp.next;
            }
            tmp.next = new Node(value);
        }
    }
    
    public void print(){
        Node tmp = head;
        while (tmp.next.getValue() != null){
            System.out.println(tmp.getValue());
            tmp = tmp.next;
        }
    }
}
