package com.javarush.test.level15.lesson09.task01;

import java.util.HashMap;
import java.util.Map;

/* Статики 1
В статическом блоке инициализировать labels 5 различными парами.
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
   static {
       labels.put((double)1,"D");
       labels.put((double)5,"fg");
       labels.put((double)6,"fgh");
       labels.put((double)8,"tr");
       labels.put((double)7,"fd");
   }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
