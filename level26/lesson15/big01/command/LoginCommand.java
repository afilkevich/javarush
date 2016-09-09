package com.javarush.test.level26.lesson15.big01.command;

import com.javarush.test.level26.lesson15.big01.ConsoleHelper;
import com.javarush.test.level26.lesson15.big01.exception.InterruptOperationException;

import java.util.ResourceBundle;

/**
 * Created by Александр on 11.08.2016.
 */
 class LoginCommand implements Command
{
    private ResourceBundle validCreditCards=ResourceBundle.getBundle("com.javarush.test.level26.lesson15.big01.resources.verifiedCards");
    private ResourceBundle res=ResourceBundle.getBundle("com.javarush.test.level26.lesson15.big01.resources.login_en");


    @Override
    public void execute() throws InterruptOperationException
    {
        String lineCard;
        String linePin;
        while (true){
            ConsoleHelper.writeMessage(res.getString("before"));
            lineCard=ConsoleHelper.readString();
            if (lineCard.length()!=12){ConsoleHelper.writeMessage(res.getString("try.again.with.details"));
            continue;}

            linePin=ConsoleHelper.readString();
            if (linePin.length()!=4){ConsoleHelper.writeMessage(res.getString("try.again.with.details"));
            continue;}

            if (validCreditCards.containsKey(lineCard)){
                if (validCreditCards.getString(lineCard).equals(linePin)){
                ConsoleHelper.writeMessage(res.getString("success.format"));
                break;}
                else{
                    ConsoleHelper.writeMessage(res.getString("try.again.with.details"));
                    continue;
                }

            }
            else {
                ConsoleHelper.writeMessage(res.getString(" try.again.with.details"));
                continue;

            }

        }
    }
}
