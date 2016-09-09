package com.javarush.test.level22.lesson05.task01;

/* Найти подстроку
Метод getPartOfString должен возвращать подстроку начиная с символа после 1-го пробела и до конца слова,
которое следует после 4-го пробела.
Пример: "JavaRush - лучший сервис обучения Java."
Результат: "- лучший сервис обучения"
На некорректные данные бросить исключение TooShortStringException (сделать исключением).
Сигнатуру метода getPartOfString не менять.
Метод main не участвует в тестировании.
*/
public class Solution {
    public static void main(String[]args) throws TooShortStringException
    {
        String a="JavaRush - лучший сервис обучения Java.";
        System.out.println(getPartOfString(a));
    }
    public static String getPartOfString(String string) throws TooShortStringException
    {
        if(string==null||string.isEmpty()){throw new TooShortStringException();}
        String[]arr=string.split(" ");
        String s="";
       if (arr.length<5){

                throw new  TooShortStringException ();

        }
        else {
        s=arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4];


        return s;}
    }

    public static class TooShortStringException extends Exception {
    }
}
