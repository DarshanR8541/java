package singlylinked;
//adding at beginning
public class SinglyLL {   
    Node head = null;
    void inBegin(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    //adding at end
    void atEnd(int data) {
    	Node newNode=new Node(data);
    	if(head==null) {
    		head=newNode;
    		return;
    	}
    	Node current=head;
    	while(current.next!=null) {
    		current=current.next;
    	}
    	current.next=newNode;
    }
    // delete
    void delete(int val) {
    	Node current =head;
    	if(current.data==val) {
    	current.next=head;
    	return;
    	}
    if (current.next.data==val);
    }
    //search
    void search(int val) {
    	if (head==null) {
    		System.out.println("LL is empty");
    		return;
    	}
    }
    void bubblesort() {
    	if(head==null) {
    		return;
    	}
    	Node current=head;
    }
    //print the display
    void display() {
        if (head == null) {
            System.out.println("Empty Linked List");
            return;
        }
        Node current = head;
        while (current.next!= null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println(current.data); 
    }
}
