import java.util.Arrays;

public class G02genericsMethods {
    //parameter tipleri non-primitive olmali
    // ERASURE process==> jvm derleyici compile time asamasinda generic methodu java byte kodlara ceviriken
    // parametere tiplerini kaldirir
    // ve yerine gercek parametre koyar.


    //generik veri tipleri sadece non-primitive olabilir
    //binary operatorler (+ - * / < > ) ise non-primitive veri tiplerindee kullanilmazlar
    //dolayisiyla birgeneric methodda karsilastirma icin ne kullanilabilir
    //cevap => comparable interface i kullanilmali
    public static void main(String[] args) {
        Integer[] intDizi = {1, 2, 3, 3, 6, 4, 6, 5, 6, 4, 6, 9};
        Double[] doubleDizi = {1.2, 2.6, 3.2, 3.8, 6.3};
        Character[] charDizi = {'a', 's', 'w', 'r'};
        //task 1 generic method create ederek bu dizileri yazdirirniz
        diziYazdir(intDizi);
        System.out.println("------------------");
        diziYazdir(doubleDizi);
        System.out.println("-----------------");
        diziYazdir(charDizi);
        //task 2 max sayiyi bulan generic method yazinir. 3 pmli olsun
        System.out.println(" - generic method ");
        System.out.println("maxSayiyiBulGeneric(35,63,15) = " + maxSayiyiBulGeneric(35, 63, 15));
        System.out.println("maxSayiyiBulGeneric(25.4,87.9,35.58) = " + maxSayiyiBulGeneric(25.4, 87.9, 35.58));
        System.out.println("maxSayiyiBulGeneric(\"25\",\"89\",\"45\") = " + maxSayiyiBulGeneric("25", "89", "45"));
    }

    public static <T> void diziYazdir(T[] dizi) {// generic method create edildi
        Arrays.stream(dizi).forEach(System.out::print);
    }

    public static <T extends Comparable<T>> T maxSayiyiBulGeneric(T a, T b, T c) {
        //generic return type olan method create edildi
        //cevap => comparable interface i kullanilmali(>,< gibi karşılaştırma operatörleri generic'te kullanamadığımız için Comparable interface'inin methodlarını kullandık)
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }

        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

}
