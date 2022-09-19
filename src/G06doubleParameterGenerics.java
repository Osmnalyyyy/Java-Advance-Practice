public class G06doubleParameterGenerics {
    public static void main(String[] args) {
        //1 iki pm li generic class create din
        //2 getter seter const crete edin
        //3 main methoddan farkli tiplerde obj ler create ederek key value tipinde obj leri yazdirin
        Jeneric<Integer,String> obj1=new Jeneric();
        Jeneric<String,Integer> obj2=new Jeneric();
        Jeneric<Byte,Integer> obj3=new Jeneric();
        obj1.setId(1);
        obj2.setId("o");
        obj3.setId((byte) 12);
        obj1.setName("osman");
        obj2.setName(25);
        obj3.setName(15);

    }
}

class Jeneric<T, U> {
    private T id;
    private U name;

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public U getName() {
        return name;
    }

    public void setName(U name) {
        this.name = name;
    }

    public Jeneric() {
    }

    public Jeneric(T id, U name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Jeneric{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }
}

