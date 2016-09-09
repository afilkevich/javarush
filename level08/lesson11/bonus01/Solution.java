package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String month=reader.readLine();
        HashMap<String,String>monthMap=new HashMap<String, String>();
        monthMap.put("January","January is 1 month");
        monthMap.put("February","February is 2 month");
        monthMap.put("March","March is 3 month");
        monthMap.put("April","April is 4 month");
        monthMap.put("May","May is 5 month");
        monthMap.put("June","June is 6 month");
        monthMap.put("July","July is 7 month");
        monthMap.put("August","August is 8 month");
        monthMap.put("September","September is 9 month");
        monthMap.put("October","October is 10 month");
        monthMap.put("November","November is 11 month");
        monthMap.put("December","December is 12 month");
        Iterator<Map.Entry<String,String>>iterator=monthMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String>pair=iterator.next();
            String key=pair.getKey();
            if (key.equals(month)){
                System.out.println(pair.getValue());
            }
        }
        //напишите тут ваш код
    }

}
