package com.vilas.java8_tutorial.ch03.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Java uses Dual Pivot QuickSort
 * Compare each element in the middle with the end (left and right) two elements and identify if it should go to left or right.
 * 
 */
public class Example1_Lambda {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Vilas", "Rajesh", "Ani");
        // sort alphabetically
        Collections.sort(names);
        System.out.println("names sorted alphabetically  >>");
        System.out.println(names);
        System.out.println();

        // using anonymous classes
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
            	System.out.println(o1 +", "+o2);
            	System.out.println(o1.length() - o2.length());
                return o1.length() - o2.length();
            }
        });

        Collections.sort(names, (String o1, String o2) -> {return o1.length() - o2.length();});

        
        System.out.println("names sorted by length  >>");
        System.out.println(names);
        System.out.println();

        /**
         * Using lambda
         * Things to show >>
         * 1. return statement
         * 2. Without return statement
         * 3. Multiple lines
         * 4. Type inference
         */

        Collections.sort(names, (String first, String second) -> second.length() - first.length());
        System.out.println("names sorted by length(reversed)  >>");
        System.out.println(names);
        System.out.println();
    }


}
