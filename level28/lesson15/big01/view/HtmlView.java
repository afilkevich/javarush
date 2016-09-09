package com.javarush.test.level28.lesson15.big01.view;

import com.javarush.test.level28.lesson15.big01.Controller;
import com.javarush.test.level28.lesson15.big01.vo.Vacancy;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by Александр on 31.08.2016.
 */
public class HtmlView implements View
{
    private Controller controller;
    private final String filePath="./src/"+this.getClass().getPackage().getName().replaceAll("\\.","/") + "/vacancies.html";

    @Override
    public void update(List<Vacancy> vacancies)
    {

            updateFile(getUpdatedFileContent(vacancies));



    }
    private String getUpdatedFileContent(List<Vacancy> list)
    {
        String content;
        try
        {
         Document doc=getDocument();
        Element template=doc.getElementsByClass("template").first();
        Element copyTemplate=template.clone();
        copyTemplate.removeClass("template");
        copyTemplate.removeAttr("style");

        doc.select("tr[ class=vacancy]").remove();
            for (Vacancy vac:list){
                Element nextClone=copyTemplate.clone();
                nextClone.getElementsByClass("city").first().text(vac.getCity());
                nextClone.getElementsByClass("companyName").first().text(vac.getCompanyName());
                nextClone.getElementsByClass("salary").first().text(vac.getSalary());
                nextClone.getElementsByTag("a").first().text(vac.getTitle()).attr("href",vac.getUrl());
                template.before(nextClone.outerHtml());
            }
            content=doc.html();

        }

        catch (IOException e){
            e.printStackTrace();
            content="Some exception occurred";

        }

        return content;}

    protected Document getDocument() throws IOException{
        return Jsoup.parse(new File(filePath),"UTF-8");
    }

    private void updateFile(String a){
        File file=new File(filePath);

        try
        {
            PrintWriter writer = new PrintWriter(file.getAbsoluteFile());
            try
            {
                writer.write(a);

            }
            finally
            {
                writer.close();
            }
        }
        catch (IOException e){}

    }

    @Override
    public void setController(Controller controller)
    {
        this.controller=controller;

    }
    public void userCitySelectEmulationMethod(){
        controller.onCitySelect("Odessa");
    }
}
