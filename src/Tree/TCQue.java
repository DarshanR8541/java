package Tree;

public class TCQue {
TreeNode arr[];	
	
int capacity;
int front;
int rear;
int size;
TCQue(int data) {
	arr=new TreeNode[capacity];
	rear=-1;
	this.capacity=capacity;
}
boolean isEmpty() {
	return size==0;
}

boolean isFull() {
	return (size==capacity)?true:false;
}

void add(TreeNode ob) {
	if(isFull() ) {
		System.out.println("Stack is full");
		return;
	}
	rear=(rear+1)%capacity;
	arr[rear]=ob;
	size++;
	
}

TreeNode Deque() {
	if(isEmpty()) {
		return null;
	}
	TreeNode ob=arr[front];
	front=(front+1)%capacity;
	size++;
	return ob;
}

}
