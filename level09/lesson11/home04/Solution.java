package com.javarush.test.level09.lesson11.home04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* Конвертер дат
Ввести с клавиатуры дату в формате «08/18/2013»
Вывести на экран эту дату в виде «AUG 18, 2013».
Воспользоваться объектом Date и SimpleDateFormat.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String a=reader.readLine();
        SimpleDateFormat format=new SimpleDateFormat("MM/dd/yyy");//сперва надо конвертить строку в типа Date  такого же формата как в строке.а потом уже с работать
        Date date1=format.parse(a);
        SimpleDateFormat format1=new SimpleDateFormat("MMM dd, yyyy",Locale.US);// что писал месяц на нужном языке , всегда делать локализацию

        System.out.println(format1.format(date1).toUpperCase());// увеличить в буквы до строчных в меясце метод toUpperCase()

        //напишите тут ваш код
    }
}
