package insertion_Deletion;

public class insert_delete {
    node head;
    class node{
        int data;
        node next;
        node(int d){
            data = d;
            next =null;
        }
    }
    // insert at begninning
    public void insertbegning(int newdata) {
        node newnode = new node(newdata);
        newnode.next = head;
        head = newnode;
    }
    // insert at end
    public void insertend(int newdata) {
        node newnode = new node(newdata);
        if(head == null){
           head = newnode;
           return;
        }
        node tamp = head;
        while(tamp.next != null){
            tamp = tamp.next;
        }
        tamp.next = newnode;
    }
    // middle node
    public void middle_term() {
        node slow = head;
        node fast = head;
        while(fast != null && fast.next !=null ){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("middle node = "+slow.data);   
    }
    //delete element - on index basis - 0,1,2,3...n
    public void delete(int position){
        node temp = head;
        int i = 0;
        while(i<position-1){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        System.out.println("element at "+position+" index deleted successfully");
     }
    // display method
    public void display() {
        node tamp = head;
        while(tamp!=null){
            System.out.print(tamp.data + "  ");
            tamp = tamp.next;
        }
        
    }
    public static void main(String[] args) {
        insert_delete ll = new insert_delete();
       ll.insertbegning(1);
       ll.insertend(3);
       ll.insertbegning(5);
       ll.insertend(7);
       ll.display();
    }
}

