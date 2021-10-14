package Kuba.AbstractClass;

public class Main {

    public static void main(String[] args) {

        Wrestler pudzian = new Pudzianowski();
        Wrestler kane = new Kane();

        pudzian.paymentForWork(5);
        pudzian.MusicTheme();
        pudzian.finisher();

        System.out.println();

        kane.paymentForWork(5);
        kane.MusicTheme();
        kane.finisher();
    }
}
