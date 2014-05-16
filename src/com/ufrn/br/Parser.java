package com.ufrn.br;

import com.ufrn.br.GenericTree.GenericTree;
import com.ufrn.br.GenericTree.Node;

import java.io.*;
import java.util.Scanner;

/**
 * Created by bernardog on 15/05/14.
 */
public class Parser {

    private String fileContent;
    private GenericTree tree;

    public Parser(String file) throws FileNotFoundException {
        this.fileContent = new Scanner(new File(file)).useDelimiter("\\Z").next();
        this.tree = new GenericTree();
    }

    public void parseTree(GenericTree tree) throws IOException {
        String[] result = fileContent.replace("\n", " ").split(" ");

        tree.setRoot(new Node(result[0]));

        Node node = tree.getRoot();

        for (int i = 1; i < result.length; i++) {
            Node child = new Node(result[i]);
            if (result[i].charAt(0) == '(') {
                node.addChild(child);
                node = child;
            } else {
                node.addChild(child);
                for (int j = (result[i].length()-1); j >= 0; j--) {
                    if (result[i].charAt(j) == ')') {
                        node = node.getFather();
                    }
                }
            }
        }
    }



}
