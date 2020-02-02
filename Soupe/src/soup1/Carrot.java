package soup1;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.*;
import javax.swing.tree.*;

public class Carrot {


    private double kilogramme;
    private int centimetre;

    Carrot(double kilogrammes, int centimetres){ // Création d'un constructeur
            this.centimetre = centimetres;
            this.kilogramme = kilogrammes;
    }

    @Override
    public String toString(){
        String Affichage = "Carotte :["+kilogramme+" kg - "+centimetre+" cm]";
        return Affichage;

    }



   public double getKilogramme(){
        return kilogramme;
    }

    public int getCentimetre() {
        return centimetre;
    }


}
