package com.javarush.test.level19.lesson05.task02;

/* Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        BufferedReader filereader=new BufferedReader(new FileReader(reader.readLine()));
        int count = 0;
        Pattern p=Pattern.compile("\\bworld\\b",Pattern.CASE_INSENSITIVE);
        String line;
        while ((line=filereader.readLine())!=null){
            Matcher m=p.matcher(line);
            while (m.find()){count++;}
            
        }
        reader.close();
        filereader.close();
        System.out.println(count);
    }
}
