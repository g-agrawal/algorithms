package custom.tree;

public class CustomTree {
    public Node root;

    public void insert(int data) {
        if(root == null) {
            root = new Node(data);
        } else {
            insert(root, data);
        }

    }
    private Node insert(Node node, int data) {
        if(node == null) {
            node = new Node(data);
        } else if (data < node.data) {
            node.left = insert(node.left, data);
        } else if(data > node.data) {
            node.right = insert(node.right, data);
        }
            return node;
    }

    public void insertIterative(int data) {
        if(this.root == null) {
            this.root = new Node(data);
        } else {
            Node node = this.root;
            while(true) {
                if(data < node.data) {
                    if(node.left == null) {
                        node.left = new Node(data);
                        return;
                    } else {
                        node = node.left;
                    }
                } else if(data > node.data) {
                    if(node.right == null) {
                        node.right = new Node(data);
                        return;
                    } else {
                        node = node.right;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public void inOrder(Node node) {
        if(node == null) {
            return;
        }
        inOrder(node.left);
        System.out.println(node.data);
        inOrder(node.right);
    }

    public boolean search(Node node, int num) {
        boolean found = false;

        if(node.data == num) {
            found = true;
        } else if(num < node.data && node.left != null) {
            found = search(node.left, num);
        } else if(num > node.data && node.right != null){
            found = search(node.right, num);
        }
        return found;
    }

    public boolean contains(Node root, int num) {
        if(root == null) {
            return false;
        } else if(num == root.data) {
            return true;
        } else if(num < root.data) {
            return contains(root.left, num);
        } else if(num > root.data) {
            return contains(root.right, num);
        } else {
            return false;
        }
    }
}
