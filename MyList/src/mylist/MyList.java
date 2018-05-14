package mylist;

public class MyList {
    
    Node head;
    
    public MyList() {
        
        head = new Node();
        
    }
    
    public void add(String value){
        Node tmp = head;
        while(tmp.next.getValue() != null){
            tmp = tmp.next;
        }
        tmp.next = new Node(value);
    }
    
    public void print(){
    
        
        
    }
}
