package com.javarush.test.level26.lesson15.big01;

import java.util.Collection;
import java.util.HashMap;

/**
 * Created by Александр on 29.07.2016.
 */
public final class CurrencyManipulatorFactory
{

    private static HashMap<String,CurrencyManipulator>map=new HashMap<>();

    private  CurrencyManipulatorFactory(){}
    /*
    Вернет Collection всех манипуляторов
     */
   public static Collection getAllCurrencyManipulators(){
       return map.values();
   }

  /*
  Cоздает нужный манипулятор по коду валюты, если он еще не существует, либо возвращает ранее созданный.
   */
    public static CurrencyManipulator getManipulatorByCurrencyCode(String currencyCode){
        if (map.get(currencyCode)==null){
             map.put(currencyCode,new CurrencyManipulator(currencyCode));
        }
         return map.get(currencyCode);

    }
}
