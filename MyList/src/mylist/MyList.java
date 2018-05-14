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
            tmp = tmp.next;
            System.out.println(tmp.getValue());
        }
    }
    
    public void insert(int index, String newVal){
        Node tmp = head;
        for(int i = 0; i < index; i++){
            tmp = tmp.next;
            i++;
        }
        tmp.next = new Node(newVal, tmp.next.next);
    }
    
    public void remove(int index){
        Node tmp = head;
        for(int i = 0; i < index; i++){
            tmp = tmp.next;
            i++;
            if(i == index){
                tmp = null;
            }
        }  
    }
}
