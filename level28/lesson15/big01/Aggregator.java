package com.javarush.test.level28.lesson15.big01;



import com.javarush.test.level28.lesson15.big01.model.HHStrategy;
import com.javarush.test.level28.lesson15.big01.model.Model;

import com.javarush.test.level28.lesson15.big01.model.MoikrugStrategy;
import com.javarush.test.level28.lesson15.big01.model.Provider;
import com.javarush.test.level28.lesson15.big01.view.HtmlView;


import java.io.IOException;
import java.util.List;


/**
 * Created by Александр on 25.08.2016.
 */
public class Aggregator
{
    public static void main(String[]args) throws IOException
    {
        HHStrategy hhStrategy=new HHStrategy();
        MoikrugStrategy moiKrugStrategy=new MoikrugStrategy();

        Provider hhprovider=new Provider(hhStrategy);
        Provider mkProvider=new Provider(moiKrugStrategy);
       Provider[] providers={hhprovider,mkProvider};

        HtmlView view=new HtmlView();
        Model model=new Model(view,providers);
        Controller contr=new Controller(model);
        view.setController(contr);
        view.userCitySelectEmulationMethod();











    }

}
