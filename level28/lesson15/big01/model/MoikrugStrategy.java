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
 * Created by Александр on 02.09.2016.
 */
public class MoikrugStrategy implements Strategy
{
    private static final String URL_FORMAT = "https://moikrug.ru/vacancies?page=%d&q=java+%s";

    protected Document getDocument(String searchString, int page) throws IOException
    {
        return Jsoup.connect(String.format(URL_FORMAT,page,searchString)).userAgent("Chrome/52.0.2743.116").referrer(""). get();

    }


    @Override
    public List<Vacancy> getVacancies(String searchString)
    {
        ArrayList<Vacancy> list=new ArrayList<>();
        int page=0;
        try
        {
            while (true)
            {
                Document  doc = getDocument(searchString, page);



                Elements elements=doc.getElementsByClass("job");

                if(elements.size()==0)break;
                for (Element e:elements){

                    Element titleElement=e.getElementsByClass("title").first();
                    String title=titleElement.text();

                    String url="https://moikrug.ru"+titleElement.getElementsByTag("a").attr("href");


                    Element salaryElement=e.getElementsByClass("salary").first();
                    String salary="";
                    if (salaryElement!=null){
                        salary=salaryElement.text();
                    }


                    Element cityElement=e.getElementsByClass("location").first();
                    String city="";
                    if (cityElement!=null){
                        city=cityElement.text();
                    }

                    String companyName=e.getElementsByClass("company_name").first().text();

                    String site="http://moikrug.ru";

                    Vacancy vac=new Vacancy();
                    vac.setSalary(salary);
                    vac.setUrl(url);
                    vac.setSiteName(site);
                    vac.setTitle(title);
                    vac.setCompanyName(companyName);
                    vac.setCity(city);
                    list.add(vac);
                }

                page++;
            }

        }
        catch (IOException e){}

        return list;

    }
}
