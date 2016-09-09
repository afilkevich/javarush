package com.javarush.test.level27.lesson15.big01;

import com.javarush.test.level27.lesson15.big01.kitchen.Dish;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Александр on 15.08.2016.
 */
public class ConsoleHelper
{
    static BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));


    /*
    Выводит сообщение
     */
    public static void writeMessage(String message){
        System.out.println(message);
    }
    /*
    Считывает строку
     */
    public static String readString() throws IOException
    {
        String line=reader.readLine();
        return line;
    }

    /*
    просит ползователя выбрать блюдо и добавляет его в список.
     */
    public static List<Dish> getAllDishesForOrder() throws IOException
    {
        ArrayList<Dish> dishList=new ArrayList<>();
        writeMessage("Please,enter the dish "+Dish.allDishesToString());
        String answer;
        while (true){
            answer=readString();
            if (answer.equals("exit")) break;
            try
            {
                dishList.add(Dish.valueOf(answer));
            }
            catch (IllegalArgumentException e){writeMessage( String.format ("%s is not detected",answer));}
        }
           return dishList;
    }


}
