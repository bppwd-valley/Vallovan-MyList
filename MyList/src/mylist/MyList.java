package mylist;

public class MyList<T> {
    
    Node<T> head;
    
    public MyList() {
        head = null;  
    }
    
    public void addLast(T value){
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
    
    public void insertAt(int index, T newVal){
        Node tmp = head;
        for(int i = 0; i < index; i++){
            tmp = tmp.next;
        }
        tmp.next = new Node(newVal, tmp.next);
    }
    
    public void insertAfter(T target, T newVal){
        Node tmp = head;
        while(!tmp.getValue().equals(target)){
            tmp = tmp.next;
        }
        tmp.next = new Node(newVal, tmp.next);
    }
    
    public void insertBefore(T target, T newVal){
        Node tmp = head;
        while(!tmp.next.getValue().equals(target)){
            tmp = tmp.next;
        }
        tmp.next = new Node(newVal, tmp.next);
    }
    
    public void remove(int index){
        Node tmp = head;
        for(int i = 0; i <index; i++){
            tmp = tmp.next;
        }
        tmp.next = tmp.next.next;
    }
    
    public void addFirst(T value){
        Node tmp = head;
        head = new Node(value, tmp);
    }
    
    public T get(int index){
        Node tmp = head;
        for(int i = 0; i <index+1; i++){
            tmp = tmp.next;
        }
        return (T) tmp.getValue();
    } 
    
    public T getFirst(){
        Node tmp = head;
        tmp = tmp.next;
        if (head == null){
            return (T) "List is empty";
        }
        return (T) tmp.getValue();
    }
    
    public T getLast(){
        Node tmp = head;
        tmp = tmp.next;
        if (head == null){
            return (T) "List is empty";
        }
        while(tmp.next != null){
            tmp = tmp.next;
        }
        return (T) tmp.getValue();
    }
    
    public boolean contains(T target){
        Node tmp = head;
        while(tmp.next != null){
            if(tmp.getValue().equals(target)){
                return true;
            }
            tmp = tmp.next;
        }
        return false;
    }
    
    @Override
    public String toString(){
        Node tmp = head;
        String toS = "{ ";
        while(tmp != null){
            if (tmp.next != null)
                toS += tmp.getValue() + ", ";
            else
                toS += tmp.getValue();
            tmp = tmp.next;
        }
        return toS + " }";
    }
}
