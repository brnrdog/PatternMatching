package com.ufrn.br.GenericTree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bernardog on 15/05/14.
 */
public class Node {

    private String value;
    private Node father;
    private List<Node> children;
    private boolean printed;

    public Node(String value) {
        this.value = value;
        this.children = new ArrayList<Node>();
        this.father = null;
        this.printed = false;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Node getFather() {
        return father;
    }

    public void setFather(Node father) {
        this.father = father;
    }

    public boolean isPrinted() {
        return printed;
    }

    public void setPrinted(boolean printed) {
        this.printed = printed;
    }

    public List<Node> getChildren() {
        return children;
    }

    public void addChild(Node child) {
        this.children.add(child);
        child.father = this;
    }




}
