package com.javarush.test.level08.lesson08.task03;

import java.util.*;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String,String>map=new HashMap<String, String>();
        map.put("Ivanov","lil");
        map.put("Petrov","jon");
        map.put("Ofg","fog");
        map.put("DAS","kurt");
        map.put("DFG","fgb");
        map.put("Gyt","alex");
        map.put("Fed","unt");
        map.put("Boui","ded");
        map.put("DEW","erff");
        map.put("Ght","gf");
        return map;


        //напишите тут ваш код

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        Iterator<Map.Entry<String,String>> iterator=map.entrySet().iterator();
        int count=0;
        while(iterator.hasNext()){
            if (name.equals(iterator.next().getValue()))
                count++;
        }
        return count;


        //напишите тут ваш код

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        Iterator<Map.Entry<String,String>>iterator= map.entrySet().iterator();
        int count=0;
        while (iterator.hasNext()){
            if (lastName.equals(iterator.next().getKey()))
                count++;
                    }
        return count;
        //напишите тут ваш код

    }
}
