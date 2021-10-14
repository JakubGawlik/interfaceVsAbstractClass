package Kuba.Interface;

public class Main {
    public static void main(String[] args) {

        Pudzianowski pudzianowski = new Pudzianowski();

        Kane kane = new Kane();

        pudzianowski.paymentForWork();
        pudzianowski.musicTheme();
        pudzianowski.finisher();

        System.out.println();

        kane.paymentForWork();
        kane.musicTheme();
        kane.finisher();
    }

}
