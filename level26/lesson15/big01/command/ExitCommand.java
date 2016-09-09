package com.javarush.test.level26.lesson15.big01.command;

import com.javarush.test.level26.lesson15.big01.ConsoleHelper;

import com.javarush.test.level26.lesson15.big01.exception.InterruptOperationException;

import java.util.ResourceBundle;


/**
 * Created by Александр on 02.08.2016.
 */
class ExitCommand implements Command
{
     private ResourceBundle res=ResourceBundle.getBundle("com.javarush.test.level26.lesson15.big01.resources.exit_en");

    @Override
    public void execute() throws InterruptOperationException
    {
        ConsoleHelper.writeMessage(res.getString("exit.question.y.n"));
        String  ask=ConsoleHelper.readString();
        if (ask.equalsIgnoreCase(res.getString("yes")))
            ConsoleHelper.writeMessage(res.getString("thank.message"));

    }
}
