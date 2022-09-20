package generics;

import java.util.ArrayList;
import java.util.List;

public class G03nonGenericsClass {
    public static void main(String[] args) {

       // List<String> liste=new ArrayList<>();// ==>generic list
        List liste=new ArrayList<>();// default data türü olarak object alır

        liste.add("tipsiz liste");
        liste.add(1990);

        System.out.println("liste = " + liste);

        String name= (String) liste.get(0);
        System.out.println("name = " + name);

     //   String tarih= (String) liste.get(1); ClassCastException throw eder
     //   System.out.println("tarih = " + tarih);

        int tarih= (int) liste.get(1);
        System.out.println("tarih = " + tarih);

        System.out.println(" ====================================");
        //row List yerine Object super class data type
        List<Object> devList=new ArrayList<>();//object super class data type list create ediniz.
        devList.add("osman ali");
        devList.add(1980);
        devList.add(20000.5);
        String devName= (String) devList.get(0);
        Integer dogumTarih= (Integer) devList.get(1);
        for (Object w:devList
             ) {
            String data= (String) w;// icerinde numeric deger oldugu için casting yapamaz
            System.out.println("data = " + data);
        }











    }

}
