package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        try
        {
            String Url=reader.readLine();
            int a=Url.indexOf("?");
            String shortUrl=Url.substring(a+1);
            String[]param=shortUrl.split("&");
            for (int i=0;i<param.length;i++){
                if (param[i].contains("=")){
                    System.out.print(param[i].substring(0,param[i].indexOf("="))+" ");

                }
                else {System.out.print(param[i]+" ");}
            }

            System.out.println();

            for (String par:param){
                if (par.contains("obj")){
                    String[]pr=par.split("=");
                    String s= pr[1];
                    if (s.contains(".")){alert(Double.parseDouble(s));}
                    else alert(s);
                }
            }


        }
        catch (IOException e){}

        //add your code here
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
