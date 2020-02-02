package soup2;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args){

        Soup s = new Soup();
        s.add(new Potatoe(0.3, 10));
        s.add(new Carrot(0.25, 30));
        System.out.println(s.getPeelingWeight());
        Vegetable.setPeelingWeight(0.05);
        System.out.println(s.getPeelingWeight());

    }

}