package com.javarush.test.level28.lesson15.big01.model;

import com.javarush.test.level28.lesson15.big01.vo.Vacancy;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Александр on 25.08.2016.
 */
public class HHStrategy implements Strategy
{

    private static final String URL_FORMAT = "http://hh.ua/search/vacancy?text=java+%s&page=%d";

    protected Document getDocument(String searchString, int page) throws IOException{
       return Jsoup.connect(String.format(URL_FORMAT,searchString,page)).userAgent("Chrome/52.0.2743.116").referrer(""). get();

    }


    @Override
    public List<Vacancy> getVacancies(String searchString)
    {
        ArrayList<Vacancy> list=new ArrayList<>();
        int page=0;
         try
        {
            while (page<2)
            {
              Document  doc = getDocument(searchString, page);


                Elements elements=doc.getElementsByAttributeValue("data-qa","vacancy-serp__vacancy");

                if(elements.size()==0)break;
                for (Element e:elements){
                    Vacancy vac=new Vacancy();
                    vac.setCity(e.getElementsByAttributeValue("data-qa","vacancy-serp__vacancy-address").text());
                    vac.setCompanyName(e.getElementsByAttributeValue("data-qa","vacancy-serp__vacancy-employer").text());
                    vac.setTitle(e.getElementsByAttributeValue("data-qa","vacancy-serp__vacancy-title").text());
                    vac.setSiteName(doc.title());
                    vac.setUrl(e.getElementsByAttributeValue("data-qa","vacancy-serp__vacancy-title").attr("href"));
                    String salary=e.getElementsByAttributeValue("data-qa","vacancy-serp__vacancy-compensation").text();
                    vac.setSalary(salary!=null?salary:"");
                    list.add(vac);
                }

             page++;
            }

        }
        catch (IOException e){}

        return list;

    }
}



