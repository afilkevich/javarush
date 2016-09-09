package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Александр on 26.04.2016.
 */
public class BelarusianHen extends Hen
{
    @Override
    public String getDescription()
    {
        return super.getDescription()+" Моя страна - "+Country.BELARUS+ ". Я несу "+ getCountOfEggsPerMonth()+" яиц в месяц.";
    }

    @Override
    public int getCountOfEggsPerMonth()
    {
        return 5;
    }
}
