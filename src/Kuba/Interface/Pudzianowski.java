package Kuba.Interface;

public class Pudzianowski implements Wrestler{
    @Override
    public void paymentForWork() {
        System.out.println("Pudzianowski zarobił mało");
    }

    @Override
    public void musicTheme() {
        System.out.println("Muza pudziana");
    }

    @Override
    public void finisher() {
        System.out.println("Finisher pudziana");
    }
}
