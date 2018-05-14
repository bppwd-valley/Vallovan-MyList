package mylist;

public class MyList {
    
    Node head;
    
    public MyList() {
        head = new Node();   
    }
    
    public void add(String value){
        if (head == null){
            head = new Node(value, null);
        }
        else {
            Node tmp = head;
            while(tmp.next != null){
                tmp = tmp.next;
            }
            tmp.next = new Node(value, null);
        }
    }
    
    public void print(){
        Node tmp = head;
        while(tmp.next != null){
            System.out.println(tmp.getValue());
            tmp = tmp.next;
        }
    }
}
