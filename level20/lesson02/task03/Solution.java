package com.javarush.test.level20.lesson02.task03;

import java.io.*;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* Знакомство с properties
В методе fillInPropertiesMap считайте имя файла с консоли и заполните карту properties данными из файла.
Про .properties почитать тут -
Реализуйте логику записи в файл и чтения из файла для карты properties.
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();
    public static void main(String[]args) throws Exception
    {



    }

    public void fillInPropertiesMap() throws Exception
    {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        InputStream in=new FileInputStream(reader.readLine());
        load(in);
         in.close();

        //implement this method - реализуйте этот метод
    }

    public void save(OutputStream outputStream) throws Exception {
       Properties prop=new Properties();
        for (Map.Entry<String,String> item:properties.entrySet()){
            String key=item.getKey();
            String value=item.getValue();
            prop.setProperty(key,value);
        }
        prop.store(outputStream,null);
        outputStream.close();
        //implement this method - реализуйте этот метод
    }

    public void load(InputStream inputStream) throws Exception {
        Properties prop=new Properties();
        prop.load(inputStream);
        Enumeration<?>e=prop.propertyNames();
        while (e.hasMoreElements()){
            String key=(String)e.nextElement();
            String value=prop.getProperty(key);
            properties.put(key,value);
        }
        inputStream.close();

        }                         //implement this method - реализуйте этот метод
    }

