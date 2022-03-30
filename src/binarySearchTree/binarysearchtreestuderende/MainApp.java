package binarySearchTree.binarysearchtreestuderende;

import java.sql.SQLOutput;

public class MainApp {

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree<>();
        tree.add(45);
        tree.add(22);
        tree.add(11);
        tree.add(30);
        tree.add(25);
        tree.add(77);
        tree.add(90);
        tree.add(88);
        tree.print();

        System.out.println(tree.findMax(tree));
        System.out.println(tree.findMin(tree));

        System.out.println(tree.removeMax());
        System.out.println(tree.removeMin());

        tree.print();
    }
}
