package com.javarush.test.level22.lesson13.task01;

import java.util.ArrayList;
import java.util.StringTokenizer;

/* StringTokenizer
Используя StringTokenizer разделить query на части по разделителю delimiter.
Пример,
getTokens("level22.lesson13.task01", ".") == {"level22", "lesson13", "task01"}
*/
public class Solution {
    public static void main(String[]args){
        for (String a:getTokens("level22.lesson13.task01", ".")){
            System.out.println(a);
        }
    }
    public static String [] getTokens(String query, String delimiter) {
        StringTokenizer tokenizer=new StringTokenizer(query,delimiter);
        ArrayList<String>list=new ArrayList<>();
        String[]arr=new String[tokenizer.countTokens()];

        while (tokenizer.hasMoreTokens()){
            String a =tokenizer.nextToken();
            list.add(a);
        }

        list.toArray(arr);

        return arr;
    }
}
