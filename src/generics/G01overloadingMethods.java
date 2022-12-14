package generics;

import java.util.Arrays;

public class G01overloadingMethods {
    public static void main(String[] args) {
// - Bir Generic (type özgü)  method tanımlanırken metodun return type önüne < T > (angle brackets) konulur.
// - E - Element (used extensively by the Java Collections Framework)
//   K - Key
//   N - Number
//   T - Type
//   V - Value
//   S,U,V etc. - 2nd, 3rd, 4th types kullanılan parametrik veri tipini göstermektedir
// - Method'un  parametre listesinde Generic parametre tipleri kullanılır.
// - Method parametre listeleri bir veya daha fazla olabilir ve virgülle ayrılarak yazılırlar.
// - çoook önemli TRİCKYYY : Parametre tipleri non-primitif olmalıdır.
// - JVM  derleyici, compile aşamasında generic methotu java byte kodlara çevirirken parametre tiplerini
//   kaldırır ve yerine gerçek parametreleri koyar. Bu prosese erasure denilir.

        // - Generic veri tipleri sadece non-primitif olabilir.
// - Binary operatörler (+, -,*, / ,<, >) ise non-primitif veri tiplerinde kullanılamazlar.
// - Dolayısıyla bir generic metotta karşılaştırma için ne kullanılabilir?
// - CEVAP: Comparable interface'i kullanılmalı.

        Integer[] intDizi = {1, 2, 3, 3, 6, 4, 6, 5, 6, 4, 6, 9};
        Double[] doubleDizi = {1.2, 2.6, 3.2, 3.8, 6.3};
        Character[] charDizi = {'a', 's', 'w', 'r'};
        // task bu dizileri yazdir methodu ile yazdiriniz Object datatype da kullaniniz

        System.out.println("******super object classdan");


        diziYazdir(intDizi);
        System.out.println("-----------------------");
        diziYazdir(doubleDizi);
        System.out.println("--------------------------");
        diziYazdir(charDizi);
        System.out.println("--------------------------");
        diziYazdirObject(intDizi);
        System.out.println("--------------------------");
        diziYazdirObject(doubleDizi);
        System.out.println("--------------------------");
        diziYazdirObject(charDizi);
    }

    private static void diziYazdirObject(Object[] intDizi) {// object oldugu için her datayı alır
        Arrays.stream(intDizi).forEach(t -> System.out.print(t + " "));

    }

    // overloads methodlar
    private static void diziYazdir(Integer[] intDizi) {
        Arrays.stream(intDizi).forEach(t -> System.out.print(t + " "));

    }

    private static void diziYazdir(Double[] intDizi) {
        Arrays.stream(intDizi).forEach(t -> System.out.print(t + " "));

    }

    private static void diziYazdir(Character[] intDizi) {
        Arrays.stream(intDizi).forEach(t -> System.out.print(t + " "));

    }
}
