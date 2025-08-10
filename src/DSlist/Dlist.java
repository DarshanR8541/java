package DSlist;

class Node  {
	int data;
	Node next;
	Node prev;
}


  class Meth extends Node {
	  Node head;
	  Node tail;
	  void Atbeg(int data) {
		  Node newnode=new Node();
		  newnode.data=data;
		  newnode.next=null;
		  newnode.prev=null;
		  
		  if(head==null) {
			  head=newnode;
			  tail=newnode;
		  }
		  else {
			  head.prev=newnode;
			  newnode.next=head;
			  head=newnode;
		  }
		  
	  }
	  
	  void AtEnd(int data) {
		  Node newnode=new Node();
		  newnode.data=data;
		  newnode.next=null;
		  newnode.prev=null;
		  
		  if(head==null) {
			  head=newnode;
			  tail=newnode;
		  }
		  else {
			  tail.next=newnode;
			  newnode.prev=tail;
			  tail=newnode;
		  }
		  
	  }
	  
	  
	  void AtMid(int data, int pos ) {
		 Node newnode=new Node();
		  Node temp=head; 
		 if(pos==0) {
			 Atbeg(data);
		 }
		 
		 for(int i=1;i<=pos-1;i++) {
			 temp.next.prev=newnode;
			 newnode.next=temp.next;
			 temp.next=newnode;
			 newnode.prev=temp;
			 
		 }
	  }
	  
	  
	  void disp() {
		  Node temp=new Node();
		  temp=head;
		  while(head!=null) {
			  System.out.println(temp.data+"-->");
			  temp=temp.next;
			  
		  }
		  
	  }
	  
	  
  }

 

public class Dlist {
 public static void main(String[] args) {
	 Meth r=new Meth();
		r.Atbeg(1);
		r.AtMid(2,1);
		r.disp();
  }
}
