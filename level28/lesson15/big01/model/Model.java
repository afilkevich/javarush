package com.javarush.test.level28.lesson15.big01.model;

import com.javarush.test.level28.lesson15.big01.view.View;
import com.javarush.test.level28.lesson15.big01.vo.Vacancy;

import java.util.ArrayList;

/**
 * Created by Александр on 31.08.2016.
 */
public class Model
{
    private View view;
    private Provider[]providers;

    public Model(View view, Provider[] providers)
     {
         if (view==null)throw new IllegalArgumentException();
        this.view = view;
        if (providers.length==0) throw new IllegalArgumentException();
        this.providers = providers;
    }
    public void selectCity(String city){
        ArrayList<Vacancy> vacancy=new ArrayList<>();
        for (Provider a:providers){
            vacancy.addAll(a.getJavaVacancies(city));
        }
        view.update(vacancy);

    }
}
