package com.javarush.test.level07.lesson09.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Слова в обратном порядке
Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String>list=new ArrayList<String>();
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        for (int i=0;i<5;i++){
            String a=reader.readLine();
            list.add(a);
        }
        list.remove(2);
        for (int i=0;i<list.size();i++){
            int j=list.size()-i-1;
            String a =list.get(j);
            System.out.println(a);
        }
        //напишите тут ваш код

    }
}
