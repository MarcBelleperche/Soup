package soup2;

abstract class Vegetable {

    protected double weight;
    protected double peelingweight;
    protected static double peelpourcent = 0.1;



    public double getPeelingweightleg(){
        return (this.weight*peelpourcent); }


    public static void setPeelingWeight(double newpeelpourcent){peelpourcent = newpeelpourcent;}



}