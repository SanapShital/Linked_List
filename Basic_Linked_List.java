import java.util.*;

public class Main{
    
    static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data=data;
        }
    }
    /*
    public static void display(Node head){//by using function
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        */
        //by using recursive
        public static void displayR(Node head){
            if (head==null) return;
            
            System.out.print(head.data+" ");
            displayR(head.next);
        }
        //reverse linkedlist:-
        public static void ReverseLink(Node head){
            if(head==null) return;
            
            ReverseLink(head.next);
            System.out.print(head.data+" ");
        }
        //to find length of linkedlist:-here
        public static int length(Node head){
            int count=0;
            while(head!=null){
                count++;
                head=head.next;
            }
            return count;
        }
        
    public static void main(String[]args){
        
        Node n1=new Node(5);
        Node n2=new Node(3);
        Node n3=new Node(9);
        Node n4=new Node(8);
        Node n5=new Node(16);
        
        //5->3->9->8->16;
        n1.next=n2;//5->3 9 8 16
       // System.out.println(n1.next.data);//3 we want to print the data of n2;
        n2.next=n3;//5->3-> 9 8 16
        n3.next=n4;//5->3->9->8 16
        n4.next=n5;//5->3 ->9->8->16
        
        //display(n1);
        //displayR(n1);
        //ReverseLink(n1);
        System.out.println(length(n1));
        
        /*
        //only head is given ,we want to print all link value-Yes
        System.out.println(n1.data);//n1=5
        System.out.println(n1.next.data);//n2=3
        System.out.println(n1.next.next.data);//n3=9
        System.out.println(n1.next.next.next.data);//n4=8
        System.out.println(n1.next.next.next.next.data);//n5=16
        
        
        //displaying linked list -here size is fixed
        Node temp=n1;
        for(int i=1;i<=5;i++){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
        
        //but we dont know the size then
        Node temp=n1;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        */
        
        //function for displaying linked list:-here
        
        
        /*
        System.out.println(n1);//$Node@1dbd16a6
        System.out.println(n1.next);//$Node@7ad041f3
        System.out.println(n2);//$Node@7ad041f3
        System.out.println(n3);//$Node@251a69d7
        System.out.println(n4);//$Node@7344699f
        System.out.println(n5);//$Node@6b95977
        
    
        
        System.out.println(n1.data);
        System.out.println(n1);
        System.out.println(n1.next);
        */
        
    }
}