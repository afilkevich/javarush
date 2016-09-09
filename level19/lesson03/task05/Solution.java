package com.javarush.test.level19.lesson03.task05;

import java.util.HashMap;
import java.util.Map;

/* Закрепляем адаптер
Адаптировать Customer и Contact к RowItem.
Классом-адаптером является DataAdapter.
Инициализируйте countries перед началом выполнения программы. Соответствие кода страны и названия:
UA Ukraine
RU Russia
CA Canada
*/

public class Solution {
    private static Map<String,String> countries = new HashMap<String,String>();
    static {
        countries.put("Ukraine","UA");
        countries.put("Russia","RU");
        countries.put("Canada","CA");
    }
    public static void main(String[] args){
        Customer customer=new Customer()
        {
            @Override
            public String getCompanyName()
            {
                return "Javarash";
            }

            @Override
            public String getCountryName()
            {
                return "Ukraine";
            }
        };
        Contact contact=new Contact()
        {
            @Override
            public String getName()
            {
                return "Ivanov, Ivan";
            }

            @Override
            public String getPhoneNumber()
            {
                return "+38(050)123-45-67";
            }
        };
        DataAdapter data=new DataAdapter(customer,contact);
        System.out.println(data.getCountryCode());
        System.out.println(data.getCompany());
        System.out.println(data.getContactFirstName());
        System.out.println(data.getContactLastName());

        System.out.println(data.getDialString());
    }

    public static class DataAdapter  implements RowItem{
        private Customer customer;
        private Contact contact;
        public DataAdapter(Customer customer, Contact contact) {
            this.customer=customer;
            this.contact=contact;

        }

        @Override
        public String getCountryCode()
        {
            String code=countries.get(customer.getCountryName());
            return code;
        }

        @Override
        public String getCompany()
        {

            return customer.getCompanyName();
        }

        @Override
        public String getContactFirstName()
        {
            String first=contact.getName().split(", ")[1];
            return first;
        }

        @Override
        public String getContactLastName()
        {
            String last=contact.getName().split(", ")[0];
            return last;
        }

        @Override
        public String getDialString(){
            String dial=contact.getPhoneNumber();
            dial= dial.replaceAll( "[^0-9]","");
            return "callto://+"+ dial;
        }
    }

    public static interface RowItem {
        String getCountryCode();        //example UA
        String getCompany();            //example JavaRush Ltd.
        String getContactFirstName();   //example Ivan
        String getContactLastName();    //example Ivanov
        String getDialString();         //example callto://+380501234567
    }

    public static interface Customer {
        String getCompanyName();        //example JavaRush Ltd.
        String getCountryName();        //example Ukraine
    }

    public static interface Contact {
        String getName();               //example Ivanov, Ivan
        String getPhoneNumber();        //example +38(050)123-45-67
    }
}