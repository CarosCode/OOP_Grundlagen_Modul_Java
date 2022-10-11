package view;

import Controller.Azubi;
import Controller.Chef; // Controller = / Chef = Klasse
import Controller.Mitarbeiter;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args){
        // Array: (abteilung)
        Mitarbeiter abteilung[] = new Mitarbeiter[2];


        Chef chef = new Chef("Susi Sorglos", new BigDecimal(2345), 100.0); //Constructor (argumente für Chef / Parameter bei Chef.java)

        abteilung[0]=chef; // Definition Array abteilung bei Index 0
        abteilung[1]=new Azubi("Ben Baller", new BigDecimal(234)); //Definition Array bei index 1

        System.out.println("\nVor Gehaltserhoehung: "); // von Objekt Chef - String aufgerufen
        for(Mitarbeiter m :abteilung){
            System.out.println(m.toString());
            m.gehaltserhoehung();
        }
        System.out.println("\nNach Gehaltserhoehung: ");
        for(Mitarbeiter m :abteilung){
            System.out.println(m.toString());
        }

        chef.gehaltserhoehung();


        Azubi azubi = new Azubi("\nBen Baller", new BigDecimal(234));
        System.out.println(azubi);
    }
}
