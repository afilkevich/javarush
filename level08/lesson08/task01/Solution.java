package com.javarush.test.level08.lesson08.task01;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet(){
     HashSet<String> Lword=new HashSet<>(20);
        Lword.add("Лиза");
        Lword.add("Лимон");
        Lword.add("ЛАйм");
        Lword.add("Лог");
        Lword.add("Лоза");
        Lword.add("Лекараство");
        Lword.add("ЛИпень");
        Lword.add("Лиана");
        Lword.add("Лупа");
        Lword.add("Линза");
        Lword.add("Лом");
        Lword.add("Люк");
        Lword.add("Л");
        Lword.add("Лохматый");
        Lword.add("Лох");
        Lword.add("Лощина");
        Lword.add("Липа");
        Lword.add("Лиса");
        Lword.add("Лисенок");
        Lword.add("Лысь");
        return Lword;

        //напишите тут ваш код

    }
}
