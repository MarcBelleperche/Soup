package soup1;

import java.lang.Math;
import java.util.Random;

public class Potatoe {

    private double kilogramme;
    private int eyes;

    Potatoe(double kilogrammes, int eyess){
        this.eyes = eyess;
        this.kilogramme = kilogrammes;
    }

    Potatoe(double kilogrammes){
        this.eyes = 1 + (int)(Math.random() * ((10 - 1) + 1));
        this.kilogramme = kilogrammes;
    }

    @Override
    public String toString(){
        String Affichage = "Patate :["+kilogramme+" kg - "+eyes+" eyes]";
        return Affichage;
    }

    public double getKilogramme() {return kilogramme;}
    public int getEyes() {return eyes;}


}
