package io.kar.collectionDemo;

import java.util.TreeSet;


public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> treeset = new TreeSet<>();

        treeset.add("C");
        treeset.add("A");
        treeset.add("Z");
        treeset.add("F");
        treeset.add("AA");

        System.out.println(treeset);
    }
}
