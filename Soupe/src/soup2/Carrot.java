package soup2;

public class Carrot extends Vegetable{

    private int centimetre;

    Carrot(double kilogrammes,int centimetres){ // Création d'un constructeur
        this.centimetre = centimetres;
        this.weight = kilogrammes;
    }

    @Override
    public String toString(){
        String Affichage = "Carotte :["+weight+" kg - "+centimetre+" cm]";
        return Affichage;
    }


}
