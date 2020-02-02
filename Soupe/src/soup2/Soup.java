package soup2;

import java.lang.invoke.StringConcatFactory;
import java.util.ArrayList;

public class Soup {

    Vegetable vegetables[] = new Vegetable[10];

    @Override
    public String toString(){
        String soup ="";
        for (int i = 0; i < vegetables.length; i++) {
            if (vegetables[i]!= null){
                soup += vegetables[i].toString()+"\n"; }
            }
        return soup;
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


}
