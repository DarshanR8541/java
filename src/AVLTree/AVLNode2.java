package AVLTree;

public class AVLNode2 {

    // Node class
    class AVLNode {
        int key, height;
        AVLNode left, right;

        AVLNode(int key) {
            this.key = key;
            this.height = 1;
        }
    }

    // Tree class
    class AVLTree {
        private AVLNode root;

        private int height(AVLNode node) {
            return (node == null) ? 0 : node.height;
        }

        private int getBalance(AVLNode node) {
            return (node == null) ? 0 : height(node.left) - height(node.right);
        }

        private AVLNode rightRotate(AVLNode y) {
            AVLNode x = y.left;
            AVLNode T2 = x.right;

            x.right = y;
            y.left = T2;

            y.height = Math.max(height(y.left), height(y.right)) + 1;
            x.height = Math.max(height(x.left), height(x.right)) + 1;

            return x;
        }

        private AVLNode leftRotate(AVLNode x) {
            AVLNode y = x.right;
            AVLNode T2 = y.left;

            y.left = x;
            x.right = T2;

            x.height = Math.max(height(x.left), height(x.right)) + 1;
            y.height = Math.max(height(y.left), height(y.right)) + 1;

            return y;
        }

        public void insert(int key) {
            root = insert(root, key);
        }

        private AVLNode insert(AVLNode node, int key) {
            if (node == null) return new AVLNode(key);

            if (key < node.key)
                node.left = insert(node.left, key);
            else if (key > node.key)
                node.right = insert(node.right, key);
            else
                return node; // Duplicate keys not allowed

            node.height = 1 + Math.max(height(node.left), height(node.right));
            int balance = getBalance(node);

            // Balancing cases
            if (balance > 1 && key < node.left.key)
                return rightRotate(node);
            if (balance < -1 && key > node.right.key)
                return leftRotate(node);
            if (balance > 1 && key > node.left.key) {
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
            if (balance < -1 && key < node.right.key) {
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }

            return node;
        }

        public void inOrder() {
            inOrder(root);
            System.out.println();
        }

        private void inOrder(AVLNode node) {
            if (node != null) {
                inOrder(node.left);
                System.out.print(node.key + " ");
                inOrder(node.right);
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        AVLNode2 wrapper = new AVLNode2();
        AVLTree avl = wrapper.new AVLTree();

        avl.insert(10);
        avl.insert(20);
        avl.insert(30);
        avl.insert(40);
        avl.insert(50);
        avl.insert(25);

        System.out.print("In-order traversal of the AVL tree: ");
        avl.inOrder();
    }
}