package h9;

public class BinaryTree<E> {

	//Atributes
    Object node = null;
    BinaryTree left;
    BinaryTree right;

   
    public BinaryTree(){
    }

    
    public BinaryTree(Object node){
        this.node = node;
    }

    
    public void insert(Object newNode){
        if (this.node == null){//If the tree is empty it creates a new one
            setNode(newNode);
        } else {
            if (newNode.toString().compareTo(node.toString()) < 0){
                if (left == null){
                    left = new BinaryTree();
                    left.insert(newNode);
                } else {
                    left.insert(newNode);
                }
            } else if (newNode.toString().compareTo(node.toString()) > 0){
                if (right == null){
                    right = new BinaryTree();
                    right.insert(newNode);
                } else {
                    right.insert(newNode);
                }
            }
        }
    }

   
    public Object search(Object searchNode){//Looks for the node
        if (this.node != null){
            if (this.node.toString().equals(searchNode)){
                return this.node;
            } else {
                if (searchNode.toString().compareTo(node.toString()) < 0){
                    if (left != null){
                        return left.search(searchNode);
                    } else {
                        return null;
                    }
                } else if (searchNode.toString().compareTo(node.toString()) > 0){
                    if (right != null){
                        return right.search(searchNode);
                    } else {
                        return null;
                    }
                }
            }
        } else {
            return null;
        }
        return null;
    }

   
    public static Object inOrder(BinaryTree binaryTree){
        String inOrder = "";

        if (binaryTree.getLeft() != null){
            inOrder += inOrder(binaryTree.getLeft());
        }

        inOrder += binaryTree.getNode() + "\n";

        if (binaryTree.getRight() != null){
            inOrder += inOrder(binaryTree.getRight());
        }

        return inOrder;
    }

    
    public Object getNode() {
        return node;
    }

    
    public void setNode(Object node) {
        this.node = node;
    }

   
    public BinaryTree getLeft() {
        return left;
    }

    
    public void setLeft(BinaryTree left) {
        this.left = left;
    }

    
    public BinaryTree getRight() {
        return right;
    }

    
    public void setRight(BinaryTree right) {
        this.right = right;
    }
}
