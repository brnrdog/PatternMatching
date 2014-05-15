package com.ufrn.br.GenericTree;

/**
 * Created by bernardog on 15/05/14.
 */
public class GenericTree {

    private Node root;

    public GenericTree() {
        this.root = null;
    }

    public GenericTree(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public void preOrderTraversal(Node root){
        System.out.println("FILHOS DE " + root.getValue() + ":" + root.getChildren().size());
        System.out.println(root.getValue());
        for (Node child : root.getChildren()) {
            preOrderTraversal(child);
        }
    }

    public void prettyPrint(Node root, String s) {
        s = s + " " + root.getValue();
        if (root.getValue().charAt(root.getValue().length()-1) == ')') {
            System.out.println(s);
        }
        for(Node child : root.getChildren()) {
            prettyPrint(child, s);
        }
    }

}
