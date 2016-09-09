package com.javarush.test.level22.lesson09.task01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* Обращенные слова
В методе main с консоли считать имя файла, который содержит слова, разделенные пробелами.
Найти в тексте все пары слов, которые являются обращением друг друга. Добавить их в result.
Порядок слов first/second не влияет на тестирование.
Использовать StringBuilder.
Пример содержимого файла
рот тор торт о
о тот тот тот
Вывод:
рот тор
о о
тот тот
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException
    {
        //считываем из файла
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String filename=reader.readLine();
        reader.close();
        BufferedReader filereader=new BufferedReader(new FileReader(filename));
        String firstString="";
        try
        { firstString=filereader.readLine();
            StringBuilder sb1=new StringBuilder(firstString);
            while (filereader.ready()){ // добавляем строки в билдер
                sb1.append(filereader.readLine()+" ");
            }
            String resultText=sb1.toString();
            String resultTexrW[]=resultText.split(" ");// сплитиим и получаем массив
            for (int i=0;i<resultTexrW.length-1;i++)// цикл  по поиску слов  в массиве
            {
                String word=resultTexrW[i];
                for (int j=i+1;j<resultTexrW.length;j++){
                    StringBuilder sb2=new StringBuilder(word);
                    sb2=sb2.reverse();
                    String s=sb2.toString();
                    if ((s.equals(resultTexrW[j]))&&(i!=j)&&(!s.equals("")&&(!resultTexrW[i].equals(""))&&(!resultTexrW[j].equals(""))))
                    {
                        Pair pair=new Pair();
                        pair.first=word;
                        pair.second=resultTexrW[j];
                        result.add(pair);
                        resultTexrW[i]="";
                        resultTexrW[j]="";
                        word="";
                    }
                }
            }
            for (int i=0;i<result.size();i++){
                System.out.println(result.get(i).toString());
            }

         }
        catch (Exception e){}

   }

    public static class Pair {
        String first;
        String second;

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                    first == null && second != null ? second :
                    second == null && first != null ? first :
                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
