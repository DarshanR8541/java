package DSlist;
class cirNode{
    int data;
    cirNode next;
}
class code extends cirNode{
    cirNode head=null;
    
    void insertBegin(int data) {
        cirNode newnode = new cirNode();
        newnode.data = data;
        newnode.next = null;
        if(head == null) {    
            head =newnode;
            newnode.next = head;
        }
        else {
            cirNode temp=head;
            while(temp.next != head) {
                temp=temp.next;
            }
            temp.next=newnode;
            newnode.next=head;
            head=newnode;
        }
    }
    void insertEnd(int data) {
        cirNode newnode = new cirNode();
        newnode.data = data;
        newnode.next = null;
        if(head == null) {    
            head =newnode;
            newnode.next = head;
        }
        else {
            cirNode temp=head;
            while(temp.next != head) {
                temp=temp.next;
            }
            temp.next=head;
            temp.next=newnode;
        }
    }
    void display() {
        cirNode temp =head;
        while(temp.next!=head) {
            System.out.print(temp.data+ "--->");
            temp=temp.next;
        }
        System.out.print(temp.data);
    }
}


public class CirList {
	 public static void main(String[] args) {
         code r=new code();
         r.insertBegin(5);
         r.insertBegin(7);
         r.insertEnd(9);
         r.display();
    }
}
