package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String,String>map=new HashMap<String, String>();
        map.put("f1","n");
        map.put("f2","n2");
        map.put("f3","n");
        map.put("f4","n3");
        map.put("f5","n6");
        map.put("f6","n");
        map.put("f7","n7");
        map.put("f8","n");
        map.put("f9","n4");
        map.put("f10","n9");

        return map;
        //напишите тут ваш код

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        HashMap<String,String>copy=new HashMap<String, String>(map);
        for (Map.Entry<String,String>element:copy.entrySet()){
            int count=0;
            for (Map.Entry<String,String>copyelement:copy.entrySet()){
                if (element.getValue().equals(copyelement.getValue())){
                    count++;
                }
            }
          if (count>1)
              removeItemFromMapByValue(map,element.getValue());
        }
        //напишите тут ваш код
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
