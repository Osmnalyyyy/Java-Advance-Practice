public class Ex01Main {
    public static void main(String[] args) {
        //1 Aylar enum create edin
        //2 enum class da constructor create edin
        //3  constructor kullanarak ay ve gun sayisini main methodda yazdirin

        Aylar ay=Aylar.AGUSTOS;
        System.out.println(ay);


    }
}

enum Aylar {
    OCAK, SUBAT, MART, NISAN, MAYIS, HAZİRAN, TEMMUZ, AGUSTOS, EYLUL, EKIM, KASIM, ARALIK, Aylar;

    Aylar() {

/*
        switch () {
            case OCAK -> System.out.println("Ocak ayı 30 gundur");
            case SUBAT -> System.out.println("SUBAT ayı 28 gundur");
            case MART -> System.out.println("MART ayı 31 gundur");
            case NISAN -> System.out.println("NISAN ayı 30 gundur");
            case MAYIS -> System.out.println("MAYIS ayı 31 gundur");
            case HAZİRAN -> System.out.println("HAZİRAN ayı 30 gundur");
            case TEMMUZ -> System.out.println("TEMMUZ ayı 31 gundur");
            case AGUSTOS -> System.out.println("AGUSTOS ayı 31 gundur");
            case EYLUL -> System.out.println("EYLUL ayı 30 gundur");
            case EKIM -> System.out.println("EKIM ayı 31 gundur");
            case KASIM -> System.out.println("KASIM ayı 30 gundur");
            case ARALIK -> System.out.println("ARALIK ayı 31 gundur");
        }

 */
    }


}