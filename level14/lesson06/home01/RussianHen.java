package com.javarush.test.level14.lesson06.home01;

import static com.javarush.test.level14.lesson06.home01.Solution.*;

/**
 * Created by Александр on 26.04.2016.
 */
public class RussianHen extends Hen
{
    @Override
    public int getCountOfEggsPerMonth()
    {
        return 4;
    }

    @Override
    public String getDescription()
    {
        return super.getDescription()+" Моя страна - "+Country.RUSSIA + ". Я несу " +getCountOfEggsPerMonth()+ " яиц в месяц.";
    }
}
