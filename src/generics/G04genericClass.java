package generics;

public class G04genericClass {
    //T type parametrik class declaration yapalim <T> yaptin mi yeterli
    //1 bu class i generic yapiniz
    //2 bir field tanimla ve getter setter const olustur
    //3 main methoddan farkli tiplerde obj create edip yazdir
    public static void main(String[] args) {
    G04genericClass1<String> obj1=new G04genericClass1<>();
    G04genericClass1<Double> obj2=new G04genericClass1<>();
    G04genericClass1<Comparable> obj3=new G04genericClass1<>();
    obj1.setOsman_ali("osman");
    obj2.setOsman_ali(99.95);
    obj3.setOsman_ali('x');
        System.out.println("obj1.getOsman_ali() = " + obj1.getOsman_ali());
        System.out.println("obj2.getOsman_ali() = " + obj2.getOsman_ali());
        System.out.println("obj3.getOsman_ali() = " + obj3.getOsman_ali());

    }

}

 class  G04genericClass1 <T> {
    private T osman_ali;

    public G04genericClass1() {
    }

    public G04genericClass1(T osman_ali) {
        this.osman_ali = osman_ali;
    }

    public T getOsman_ali() {
        return osman_ali;
    }

    public void setOsman_ali(T osman_ali) {
        this.osman_ali = osman_ali;
    }

    @Override
    public String toString() {
        return "G04genericClass1{" +
                "osman_ali=" + osman_ali +
                '}';
    }
}