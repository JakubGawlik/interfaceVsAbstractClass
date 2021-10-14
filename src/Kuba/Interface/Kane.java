package Kuba.Interface;

public class Kane implements Wrestler {
    @Override
    public void paymentForWork() {
        System.out.println("Kane zarobił dużo");
    }

    @Override
    public void musicTheme() {
        System.out.println("Muza kane");
    }

    @Override
    public void finisher() {
        System.out.println("finisher kane");
    }
}
