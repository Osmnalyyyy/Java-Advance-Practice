package generics;//OCA trick = ayni dosya icinde birden fazla create edilen non-inner class lari
// JVM compile ederken
// sadece main class public olarak tanimlar. diger class lar dan herhangi biri de
// public olursa CTE veriri

public class G07genericInterface {//main class

    //1 math islem yapan mehodu olan generic bir interface create diniz
    //2 silme yapan bir class create edip bu classtan interface i implement edin
    //3 main methoddan obj ler creqate dip call yapin
    public static void main(String[] args) {
        UsAlClass<Float> floatUs = new UsAlClass<>();
        System.out.println("floatUs.usAl(5f, 8f) = " + floatUs.usAl(5f, 8f));
        UsAlClass<Double> doubleUs = new UsAlClass<>();
        System.out.println("doubleUs.usAl(5.9,9.5) = " + doubleUs.usAl(5.9, 9.5));
        UsAlClass<Integer> intUs = new UsAlClass<>();
        System.out.println("intUs.usAl(9,8) = " + intUs.usAl(2, 2));
    }

}

interface MathIslem<T extends Number> {// generin interface'den data type number olarak parametreli bounded'i create edildi

    double usAl(T t, T u);// abstract bir parametreli method create edildi

}

class UsAlClass<T extends Number> implements MathIslem<T> {

    @Override
    public double usAl(T t, T u) {// pow methodu parametre olarak Double data tipinde alır
        // bundan dolayı parametreleri double'a doubleValue() donusturduk

        return Math.pow(t.doubleValue(), u.doubleValue());
    }
}