package com.javarush.test.level26.lesson15.big01.command;

import com.javarush.test.level26.lesson15.big01.ConsoleHelper;
import com.javarush.test.level26.lesson15.big01.CurrencyManipulator;
import com.javarush.test.level26.lesson15.big01.CurrencyManipulatorFactory;

import java.util.Collection;
import java.util.ResourceBundle;

/**
 * Created by Александр on 02.08.2016.
 */
 class InfoCommand implements Command
{
 private ResourceBundle res=ResourceBundle.getBundle("com.javarush.test.level26.lesson15.big01.resources.info_en");
 @Override
 public void execute()
 {
  Collection<CurrencyManipulator>manipulatorMap= CurrencyManipulatorFactory.getAllCurrencyManipulators();
  if (manipulatorMap.isEmpty())
   ConsoleHelper.writeMessage(res.getString("no.money"));
  else {
   int count=0;
   for (CurrencyManipulator man:manipulatorMap){
    if (man.hasMoney()&&man.getTotalAmount()>0){
     ConsoleHelper.writeMessage(man.getCurrencyCode()+" - "+man.getTotalAmount());
     count++;
    }
   }
   if (count==0)
    ConsoleHelper.writeMessage(res.getString("no.money"));
  }


 }
}
