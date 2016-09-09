package com.javarush.test.level19.lesson10.home03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* Хуан Хуанович
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя день месяц год
где [имя] - может состоять из нескольких слов, разделенных пробелами, и имеет тип String
[день] - int, [месяц] - int, [год] - int
данные разделены пробелами

Заполнить список PEOPLE импользуя данные из файла
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Иванов Иван Иванович 31 12 1987
Вася 15 5 2013
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws FileNotFoundException, IOException, ParseException
    {
        String filename=args[0];
        BufferedReader reader=new BufferedReader(new FileReader(filename));
        Calendar birthday=new GregorianCalendar();

        while (reader.ready()){
            String line=reader.readLine();
            String[]arr=line.split(" ");
            int day= Integer.parseInt( arr[arr.length-3]);
            int month=Integer.parseInt(arr[arr.length-2]);
            int year=Integer.parseInt(arr[arr.length-1]);
            birthday.set(year,month-1,day);
            String name=new String();
            for (int i=0;i<arr.length-3;i++){

                name+=arr[i]+" ";
            }

            name=name.trim();
            PEOPLE.add(new Person(name,birthday.getTime()));
        }
        reader.close();
        for (Person a:PEOPLE){
            System.out.println(a.getName()+" "+a.getBirthday());
        }

    }

}
