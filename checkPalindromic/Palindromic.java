package checkPalindromic;

import java.util.ArrayList;

/**
 * InnerPalindromic
 */
public class Palindromic {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next =null;
        }
    }
    // insertion
    public void insertbegning(int newdata) {
        Node newnode = new Node(newdata);
        newnode.next = head;
        head = newnode;
    }
    // check palindrom
    boolean isPalindrome() 
    {
        //Your code here
        if(head.next == null) return true;
        if(head.next.next == null){
            if(head.data == head.next.data) return true;
            else return false;
        }
        ArrayList<Integer> arr = new ArrayList();
        
        Node tamp = head;
        while(tamp!=null){
            arr.add(tamp.data);
            tamp = tamp.next;
        }
        int i = 0;
        int j = arr.size()-1;
        boolean ans = true;
        while(i<=j){
            if(arr.get(i) != arr.get(j)) ans = false;
            i++;
            j--;
        }
        
        return ans;
    }    

    public static void main(String[] args) {
        
        Palindromic l = new Palindromic();
       // l.insertbegning(1);
        l.insertbegning(2);
        l.insertbegning(2);
        l.insertbegning(1);
        System.out.println( l.isPalindrome());
    }
    
}
 


    
   