package com.javarush.test.level08.lesson08.task04;

import java.util.*;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("G",new Date("JULY 2 1984"));
        map.put("H",new Date("AUGUST 5 1989 "));
        map.put("F",new Date("JUNE 4 1995"));
        map.put("Hf",new Date("AUGUST 3 1985"));
        map.put("V",new Date("APRIL 5 2014"));
        map.put("B",new Date("JUNE 5 1996"));
        map.put("FD",new Date("AUGUST 4 1996"));
        map.put("BN",new Date("JULY 4 1983"));
        map.put("FR",new Date("JUNE 23 1986"));
        return map;


        //напишите тут ваш код

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        ArrayList<String>names=new ArrayList<String>();
        for (Map.Entry<String,Date>pair:map.entrySet()){
            String name=pair.getKey();
            Date month=pair.getValue();
            int summer=month.getMonth();
            if (summer>4&&summer<8)
                names.add(pair.getKey());
        }
        for (int i=0;i<names.size();i++){
            String name=names.get(i);
            map.remove(name);
        }
        //напишите тут ваш код

    }

    }

