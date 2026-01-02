import java.util.*;

public class Main{
    
    
    static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    //nth node from end:
    static Node NthNodefromLast(Node head,int n){
        Node slow=head;
        Node fast=head;
        
        for(int i=1;i<=n;i++){
        fast=fast.next;
    }
    
    while(fast!=null){
        slow=slow.next;
        fast=fast.next;
    }
    return slow;
    
    }
    //removing Nth node from the end of linkedlist;
    public static Node deleteNthNodeFromEnd(Node head,int n){
        Node slow=head;
        Node fast=head;
        
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        if(fast==null){
            head=head.next;
            return head;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
        
    }
    
    //to finding intersection of 2 linkedlist
    
    //finding middle element of linkedlist;
    //deleting the middle element of list:-
    //linked list cycle check
    //Linked list cycle-2
    //Merge two sorted linked list;
    //split LL into 2-even odd-odd even linked list
    //remove duplicates from sorted linked list
    //reverse linked list:
    static Node reverse(Node head){
        if(head==null || head.next==null) return head;
        Node newHead= reverse(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
        
    }
    
    //Two pointer approach-reverse linked list
    static Node reverseT(Node head){
        Node curr=head;
        Node prev=null;
        Node next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
        
    }
    //Palindrome linked list:-
    static boolean palindrome(Node head){
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            
        }
        Node temp=reverse(slow.next);
        slow.next=temp;
        
        Node p1=head;
        Node p2=slow.next;
        
        while(p2!=null){
            if(p1.data!=p2.data) return false;
            p1=p1.next;
            p2=p2.next;
        }
        return true;
    }
    //Maximumtwin sum of linked list of even length:-
    
    
    static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    
    public static void main(String[]args){
        
        Node n1=new Node(100);
        Node n2=new Node(3);
        Node n3=new Node(15);
        Node n4=new Node(4);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        /*
        Node n1=new Node(1);
        Node n2=new Node(2);
        Node n3=new Node(2);
        Node n4=new Node(1);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        */
        //Node q=NthNodefromLast(n1,1);
        //System.out.println(q.data);
        //display(n1);
        //n1=deleteNthNodeFromEnd(n1,4);
        display(n1);
        boolean isPal=palindrome(n1);
        System.out.println(isPal);
        
        
    }
}