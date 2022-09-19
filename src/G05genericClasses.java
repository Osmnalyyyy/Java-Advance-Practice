import java.util.Arrays;

public class G05genericClasses {//non generic main class

    public static void main(String[] args) {
        //1 veri sakla adinda generic pojo class create ediniz
        //2 getter setter ve pm li const create
        //3 dataprint adinda non-generic class create ediniz
        //4 yazdir adinda pm'li generic method create ediniz
        //main method dan farkli tiplerde obj create ederek bunlari yazdirin

        VeriSakla<String> veriSakla = new VeriSakla<>();
        veriSakla.setBekir("Bekir Bakır");
        String str = veriSakla.getBekir();
        Dataprint.yazdir(str);
        VeriSakla<Integer[]> veriSakla1 = new VeriSakla<>();
        Integer[] arr = {1, 2, 3, 4, 5, 6};
        veriSakla1.setBekir(arr);
        Dataprint.yazdir(Arrays.toString(veriSakla1.getBekir()));
        VeriSakla<String[]> str1 = new VeriSakla<>();
        String[] strArr = {"en", "buyuk", "cimbom"};
        str1.setBekir(strArr);
        Dataprint.yazdir(Arrays.toString(str1.getBekir()));

    }

}

class VeriSakla<T> {
    private T bekir;

    public VeriSakla() {
    }

    public VeriSakla(T bekir) {
        this.bekir = bekir;
    }

    public T getBekir() {
        return bekir;
    }

    public void setBekir(T bekir) {
        this.bekir = bekir;
    }

    @Override
    public String toString() {
        return "VeriSakla{" +
                "bekir=" + bekir +
                '}';
    }
}

class Dataprint {

    public static <T> void yazdir(T t) { // generic method
        System.out.println(t);
    }
}

