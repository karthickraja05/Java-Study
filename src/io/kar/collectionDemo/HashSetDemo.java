package io.kar.collectionDemo;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>(4);

        hashSet.add("!");
        hashSet.add("A");
        hashSet.add("B");
        // hashSet.add("F");
        boolean e1 = hashSet.add("C");
        boolean e2 = hashSet.add("C");

        hashSet.remove("BA");
        System.out.println(hashSet);

        System.out.println("e1 value: " + e1);
        System.out.println("e2 value: " + e2);


        System.out.println("Set contains is A or not ? " + hashSet.contains("A") );
        System.out.println("Set contains is D or not ? " + hashSet.contains("D") );

        if(hashSet.contains("F")){
            System.out.println("F is present in the set");
        }else{
            System.out.println("F is not present in the set");
        }

        System.out.println(hashSet);


        Set<String> fruits1 = new HashSet<>();
        fruits1.add("Banana");
        fruits1.add("Apple");
        fruits1.add("Guava");

        Set<String> fruits2 = new HashSet<>();
        fruits2.add("Banana");
        fruits2.add("Apple");
        fruits2.add("Guavaa");

        
        boolean isEqual = fruits1.equals(fruits2);
        System.out.println("Hash Code for fruits1 :" + fruits1.hashCode());
        System.out.println("Hash Code for fruits1 :" + fruits2.hashCode());
        if(isEqual){
            System.out.println("Both are Equal");
        }else{
            System.out.println("Both are not Equal");
        }

        // fruits1.addAll(fruits2);
        // fruits1.retainAll(fruits2);
        fruits1.clear();

        

        System.out.println(fruits1);
    }
}
