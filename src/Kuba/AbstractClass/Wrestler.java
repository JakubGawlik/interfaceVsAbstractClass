package Kuba.AbstractClass;

public abstract class Wrestler {
    public void paymentForWork(int hours){
        System.out.println("The wrestler will make $" + hours*250 + " for tonight's match");
    }
    public abstract void MusicTheme();

    public abstract void finisher();


}
