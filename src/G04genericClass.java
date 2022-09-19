public  class  G04genericClass<T extends Number> {
        //T type parametrik class declaration yapalim <T> yaptin mi yeterli
        //1 bu class i generic yapiniz
        //2 bir field tanimla ve getter setter const olustur
        //3 main methoddan farkli tiplerde obj create edip yazdir
        G04genericClass input;

    public G04genericClass getInput() {
        return input;
    }

    public void setInput(G04genericClass input) {
        this.input = input;
    }

    public G04genericClass(G04genericClass input) {
        this.input = input;
    }


}
