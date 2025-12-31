import java.util.*;

public class Main{
    
    public static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    static class linkedlist{
        Node head=null;
        Node tail=null;
        
        //Insert at end
        void insertAtEnd(int data){
            Node temp=new Node(data);
            if(head==null){
                head=temp;
                tail=temp;
            }else{
                tail.next=temp;
                tail=temp;
            }
        }
        //insert at starting
        void insertAtBeginning(int data){
            Node temp=new Node( data);
            if(head==null){
                head=tail=temp;
            }else{
                temp.next=head;
                head=temp;
            }
        }
        
        //insert at any index;
        
        void insertAt(int val,int idx){
            Node t=new Node(val);
            Node temp=head;
            if(idx<0||idx>size()){
                System.out.println("Wrong index");
                return;
            }
            if(idx==0){
                insertAtBeginning(val);
                return;
            }
            if (idx==size()){
                insertAtEnd(val);
                return;
            }
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
        }
        
        //get element from any index;
        int getAt(int idx){
            
            Node temp=head;
            
            for(int i=1;i<=idx;i++){
                temp=temp.next;
            }
            return temp.data;
        }
        //delete at any index
        void deleteAt(int idx){
            if(idx==0) head=head.next;
            Node temp=head;
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            tail=temp;
        }
        //displaying list
        void display(){
            Node temp=head;
            
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        //to get size of list 
        int size(){
            int count=0;
            Node temp=head;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }
    }
    public static void main(String[]args){
        
        linkedlist ll=new linkedlist();
        ll.insertAtEnd(4);
         //ll.display(); //4
        ll.insertAtEnd(5);
        // ll.display(); //4->5
        ll.insertAtEnd(6);
        // ll.display(); //4->5->6
         ll.insertAtBeginning(1);
        // ll.display(); //1->4->5->6
        
        //ll.insertAt(12,5);
        ll.display();
        //System.out.println(ll.tail.data);
        //System.out.println(ll.getAt(4));
        ll.deleteAt(0);
        ll.display();
        
        
        
        
        
    }
}