package soup2;

public class Potatoe extends Vegetable {

    private int eyes;
    private static double eyepeel = 0.01 ;

    Potatoe(double kilogrammes, int eyess){
        this.eyes = eyess;
        this.weight = kilogrammes;
    }

    Potatoe(double kilogrammes){
        this.eyes = 1 + (int)(Math.random() * ((10 - 1) + 1));
        this.weight = kilogrammes;
    }

    @Override
    public String toString(){
        String Affichage = "text";
        if (eyes>1)  Affichage = "Patate :["+weight+" kg - "+eyes+" yeux]";
        else if (eyes == 1) Affichage = "Patate :["+weight+" kg - "+eyes+" oeil]";
        return Affichage;}

    @Override
    public double getPeelingweightleg(){
        return (this.weight*peelpourcent) + (this.eyes*eyepeel);
    }


}
