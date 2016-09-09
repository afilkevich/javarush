package com.javarush.test.level08.lesson11.home04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Минимальное из N чисел
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
*/

public class Solution
{
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {

      int min=Collections.min(array);

        // Найти минимум
        return min  ;
    }

    public static List<Integer> getIntegerList() throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(reader.readLine());
        List<Integer>list=new LinkedList<Integer>();
        for (int i=0;i<N;i++){
            int a=Integer.parseInt(reader.readLine());
            list.add(a);
        }

       //Тут создать и заполнить список
        return list;
    }
}
