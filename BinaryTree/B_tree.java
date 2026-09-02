package BinaryTree;

public class B_tree {
    class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    Node root;
    B_tree(int data){
        root=new Node(data);
    }
    void insertleft(Node node,int data){
        node.left=new Node(data);
    }
    void insertright(Node node,int data){
        node.right=new Node(data);
    }
    void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
    }
    public static void main(String[] args) {
        
    }
}
