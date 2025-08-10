package Tree;

public class Binary {
	public static void main(String[] args) {
		BinaryTree b=new BinaryTree();
		b.insert(10);
		b.insert(20);
		b.insert(30);
		b.insert(40);
		b.insert(50);
		b.insert(60);
		b.insert(70);
		b.insert(80);
		b.insert(90);
		b.insert(100);
		b.insert(110);
		b.insert(120);
		b.insert(130);
		b.insert(140);
		b.insert(150);
		b.inOrder();
		b.preOrder();
		b.postOrder();
	}
}
class TreeNode {
	int data;
	TreeNode left;
	TreeNode right;
	TreeNode(int data){
		this.data=data;
		left=null;
		right=null;
	}
}
class CircularQueue {
	TreeNode arr[];
	int capacity,front,rear,size;
	CircularQueue(int capacity){
		arr=new TreeNode[capacity];
		this.capacity=capacity;
		rear=-1;
	}
	boolean isEmpty() {
	return size==0;
	}
	boolean isFull() {
		return size==capacity;

	}
	void enQueue(TreeNode ob) {
		if(isFull()) {
			System.out.println("Overflow");
			return;
		}
		rear=(rear+1)%capacity;
		arr[rear]=ob;
		size++;
	}
	TreeNode deQueque() {
		if(isEmpty()) {
			System.out.println("Queue Underflow");
			return null;
		}
		TreeNode ob=arr[front];
		front=(front+1)%capacity;
		size--;
		return ob;
	}
}
class BinaryTree {
	TreeNode root=null;
	static final int NODE_COUNT=100;
	void insert(int data) {
		TreeNode newNode=new TreeNode(data);
		if(root==null) {
		root=newNode;
			return;
		}
		CircularQueue q=new CircularQueue(NODE_COUNT);
		q.enQueue(root);
		while(!q.isEmpty()) {
			TreeNode current=q.deQueque();
			if(current.left==null) {
				current.left=newNode;
				return;
			}
			else {
				q.enQueue(current.left);
			}
			if(current.right==null) {
				current.right=newNode;
				return;
			}
			else {
				q.enQueue(current.right);
			}
		}
	}
	void delete(int key) {
		if(root==null) {
			System.out.println("Empty Tree");
			return;
		}
		TreeNode keyNode=null,current=null,parent=null;
		CircularQueue q=new CircularQueue(NODE_COUNT);
		while(!q.isEmpty()) {
			current=q.deQueque();
			if(current.data==key) {
				keyNode=current;
			}
			if(current.left!=null) {
				parent=current;
				q.enQueue(current.left);
			}
			if(current.right!=null) {
				parent=current;
				q.enQueue(current.right);
			}
		}
		if(keyNode==null) {
			System.out.println("Value not in the tree");
			return;
		}
		keyNode.data=current.data;
		if(parent.right==current) {
			parent.right=null;
		}
		else {
			parent.left=null;
		}
	}
	public void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }
    public void inOrder() {
        System.out.print("In-order: ");
        inOrder(root);
        System.out.println();
        
    }
    
    
    // Pre-order Traversal (Root, Left, Right)
    public void preOrder(TreeNode root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public void preOrder() {
        System.out.print("Pre-order: ");
        preOrder(root);
        System.out.println();
    }
    
    
    
    // Post-order Traversal (Left, Right, Root)
    public void postOrder(TreeNode root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }
    public void postOrder() {
        System.out.print("Post-order: ");
        postOrder(root);
        System.out.println();
    }

}
             










                                                                             


