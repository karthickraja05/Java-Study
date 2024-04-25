package io.kar.collectionDemo;

import java.util.LinkedList;
import java.util.Iterator;


public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.addFirst("K");
        list.addFirst("Z");
        list.add(1,"Z");


        list.remove("Z");
        list.remove(1);

        System.out.println(list);

        list.forEach(e -> {
            System.out.println(e);
        });

        System.out.println(list.size());
        System.out.println(list.contains("Z"));
        System.out.println(list.toArray());

        String[] arr = list.toArray(new String[list.size()]);

        for(String item : arr){
            System.out.println(item);
        }

        // Get an iterator for the LinkedList
        Iterator<String> iterator = list.iterator();

        iterator.forEachRemaining(element -> System.out.println("Element: " + element));

        System.exit(0);

        // Traverse through the elements using the iterator
        while (iterator.hasNext()) {
            String element = iterator.next();
            if(element == "Z"){
            iterator.remove();
            }
            System.out.println("Element: " + element);
        }

        System.out.println(list);
        // list.iterator(e -> {
        //     System.out.println(e);
        // });


        LinkedList<Byte> list1 = new LinkedList<>();

        list1.add((byte) 1); 
        list1.add((byte) 127); 
        list1.add((byte) 1); 

        // list1.remove(1);

        System.out.println(list1.getClass());
        // list1.wait();
        // System.out.println();
    }
}
