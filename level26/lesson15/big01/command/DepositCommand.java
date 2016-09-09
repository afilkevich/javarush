package com.javarush.test.level26.lesson15.big01.command;

import com.javarush.test.level26.lesson15.big01.ConsoleHelper;
import com.javarush.test.level26.lesson15.big01.CurrencyManipulator;
import com.javarush.test.level26.lesson15.big01.CurrencyManipulatorFactory;
import com.javarush.test.level26.lesson15.big01.exception.InterruptOperationException;

import java.util.ResourceBundle;


/**
 * Created by Александр on 02.08.2016.
 */
class DepositCommand implements Command
{
    private ResourceBundle res=ResourceBundle.getBundle("com.javarush.test.level26.lesson15.big01.resources.deposit_en");
    @Override
    public void execute() throws InterruptOperationException
    {
        String code= ConsoleHelper.askCurrencyCode();
        String[] digits=ConsoleHelper.getValidTwoDigits(code);
        CurrencyManipulator manipul= CurrencyManipulatorFactory.getManipulatorByCurrencyCode(code);
        manipul.addAmount(Integer.parseInt(digits[0]),Integer.parseInt(digits[1]));

    }
}
