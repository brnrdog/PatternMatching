package com.ufrn.br;

import com.ufrn.br.GenericTree.GenericTree;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        GenericTree tree = new GenericTree(null);


        Parser parser = new Parser("PTB-flat.txt");

        parser.parseTree(tree);

        tree.preOrderTraversal(tree.getRoot());

        System.out.println("===========");

        tree.prettyPrint(tree.getRoot(), "");



    }
}
