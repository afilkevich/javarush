package com.javarush.test.level22.lesson13.task02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* Смена кодировки
В метод main первым параметром приходит имя файла, тело которого в кодировке Windows-1251.
В метод main вторым параметром приходит имя файла, в который необходимо записать содержимое первого файла в кодировке UTF-8.
*/
public class Solution {
    static String win1251TestString = "РќР°СЂСѓС€РµРЅРёРµ РєРѕРґРёСЂРѕРІРєРё РєРѕРЅСЃРѕР»Рё?"; //only for your testing

    public static void main(String[] args) throws IOException {
        String fileNameWin1251=args[0];
        String fileNameUTF8=args[1];
        FileInputStream fis=new FileInputStream(fileNameWin1251);
        byte[]buffFis=new byte[fis.available()];
        fis.read(buffFis);
        fis.close();

        String s=new String(buffFis,"UTF-8");

        FileOutputStream fos=new FileOutputStream(fileNameUTF8);
        fos.write(s.getBytes("windows-1251"));
        fos.close();
    }
}
