package soup3;

abstract class Vegetable implements Quantifiable {

    protected double weight;
    protected double peelingweight;
    protected static double peelpourcent = 0.1;



    public double getPeelingweightleg(){
        return (this.weight*peelpourcent); }

    public static void setPeelingWeight(double newpeelpourcent){peelpourcent = newpeelpourcent;}


}