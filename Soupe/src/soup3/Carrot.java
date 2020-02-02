package soup3;

import soup3.Vegetable;

public class Carrot extends Vegetable {

    private int centimetre;

    Carrot(double kilogrammes,int centimetres){ // Création d'un constructeur
        this.centimetre = centimetres;
        this.weight = kilogrammes;
    }

    @Override
    public String toString(){
        String Affichage = "Carotte :["+getCalories()+" calories - "+weight+" kg - "+centimetre+" cm]";
        return Affichage;
    }

    @Override
    public int getCalories(){
        int Calories = (int) (((weight -getPeelingweightleg())/(0.1))*40);
        return Calories;
    }


}
