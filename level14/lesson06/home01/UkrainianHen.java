package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Александр on 26.04.2016.
 */
public class UkrainianHen extends Hen
{
    @Override
    public int getCountOfEggsPerMonth()
    {
        return 8;
    }

    @Override
    public String getDescription()
    {
        return super.getDescription()+" Моя страна - "+Country.UKRAINE + ". Я несу "+ getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}
