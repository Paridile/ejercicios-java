package com.paridile.week4.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class SetExample {
    public static void main(String[] args) {
        System.out.println("---------------------------");
        System.out.println("HashSet");
        System.out.println("---------------------------");

        Set <String> set = new HashSet<>();
        set.add("a");                      
        set.add("a");        
        set.add("d");
        set.add("b");
        set.add("c");
        set.add("e");       
        
        Iterator <String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        
        System.out.println();

        System.out.println("Size : " + set.size());

        set.add("f");
        set.add("b");

        System.out.println("Size : " + set.size());
        
        System.out.println("---------------------------");
        System.out.println("TreeSet");
        System.out.println("---------------------------");

        Set<Integer> set2 = new TreeSet<Integer>();
        set2.add(3);
        set2.add(2);
        set2.add(5);
        set2.add(1);        
        set2.add(4);
        set2.add(1);
        
        for (Integer i : set2) {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("---------------------------");
        System.out.println("LinkedHashList");
        System.out.println("---------------------------");

        Set<String> set3 = new LinkedHashSet<String>();
        set3.add("a");
        set3.add("b");
        set3.add("c");
        set3.add("a");
        set3.add("d");
        set3.add("e");
        for (String s : set3) {
            System.out.print(s + " ");
        }
        System.out.println();


        
    }
}
