package com.javarush.test.level26.lesson15.big01;

import com.javarush.test.level26.lesson15.big01.exception.InterruptOperationException;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ResourceBundle;

/**
 * Created by Александр on 29.07.2016.
 */
public class ConsoleHelper
{
    private static ResourceBundle res=ResourceBundle.getBundle("com.javarush.test.level26.lesson15.big01.resources.common_en");

    static BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

   /*
   Метод выводит сообщение пользователю
    */
    public static void  writeMessage(String message){
        System.out.println(message);
    }
   /*
   Спрашивает о производимой операции.
    */
    public static Operation askOperation() throws InterruptOperationException{
        Operation operation;
        while (true){
            writeMessage(res.getString("choose.operation"));

            int ask=Integer.parseInt(readString());
            operation=Operation.getAllowableOperationByOrdinal(ask);
            break;
        }
        return operation;
    }

    /*
    Метод считывает с консоли строку и возвращает ее
     */
    public static String readString() throws InterruptOperationException{
        String mes = null;
            try
            {
                mes = reader.readLine();
                if (mes.equalsIgnoreCase(res.getString("operation.EXIT")))
                throw new InterruptOperationException();

            }
             catch(IOException e){}

        return mes;
    }

    /*
    Предлагает пользователю ввести код валюты, проверять, что код содержит 3 символа
     */
    public static String askCurrencyCode()throws InterruptOperationException{
        writeMessage(res.getString("choose.currency.code"));
        String code;
        while (true)
        {
            code = readString();
            if (code.length() == 3)
            {
                break;
            }
            else
                writeMessage(res.getString("invalid.data"));
        }
        return code.toUpperCase();
    }

    /*
    Метод предлагает пользователю ввести два целых положительных числа.
       Первое число - номинал, второе - количество банкнот.
     */
   public static String[] getValidTwoDigits(String currencyCode)throws InterruptOperationException{
   while (true)
   {
      writeMessage(res.getString("choose.denomination.and.count.format"));
       String line = readString();
       String[] digits = line.split(" ");
       try
       {
           if (digits.length == 2 && Integer.parseInt(digits[0]) >= 0 && Integer.parseInt(digits[1]) >= 0)
               return digits;
           else writeMessage(res.getString("invalid.data"));
       }
       catch (NumberFormatException e)
       {
           writeMessage(res.getString("invalid.data"));
       }
      }
   }

   public static void printExitMessarge(){
       writeMessage(res.getString("the.end"));
   }


}
