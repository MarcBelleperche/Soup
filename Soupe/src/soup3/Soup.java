package soup3;

import soup3.Vegetable;

public class Soup implements Quantifiable {

    Vegetable vegetables[] = new Vegetable[10];
    @Override
    public String toString(){
        String soup ="";
        for (int i = 0; i < vegetables.length; i++) {
            if (vegetables[i]!= null){
                soup += vegetables[i].toString()+"\n"; }
            }
        return soup = "Soupe \n------\n\n"+ getCalories()+" calories\n" + soup +"\n------"  ;
    }

    public void add(Potatoe potatoe) {
        for (int i = 0; i < vegetables.length; i++) {
        if (vegetables[i]==null){
            vegetables[i]=potatoe;
            break;}
        }
    }
    public void add(Carrot carrot){
        for (int i = 0; i < vegetables.length; i++) {
            if (vegetables[i]==null){
                vegetables[i]=carrot;
                break;}
        }
    }

    public double getPeelingWeight(){
        double finalpeelingweight=0;
        for (int i = 0; i < vegetables.length; i++) {
            if (vegetables[i]==null){break;}
            finalpeelingweight += vegetables[i].getPeelingweightleg();
        }
        return finalpeelingweight;
    }


    public int getCalories() {
        int Calories = 0;
        for(int i = 0; i < vegetables.length; i++){
            if (vegetables[i]!=null)
            {Calories += vegetables[i].getCalories();}
        }
        return Calories;
    }
}
