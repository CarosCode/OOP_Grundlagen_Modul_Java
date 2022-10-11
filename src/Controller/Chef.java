package Controller;

import java.math.BigDecimal;

public class Chef extends Mitarbeiter{             // => Instanzvariablen "Chef IST EIN Mitarbeiter"

private Double _boni;
    public Chef(String name, BigDecimal gehalt, Double boni) {  //Parameter für Chef, welche übergeben werden(Constructor:hat keinen Rückgabewert)
                                                                 /* System.out.println("Ein Chef ");
                                                                  this.name = name; //Instanzvariable immer links "this." -
                                                                  dann Variable = Zuweisung "nimm Instanzvariable und weise Variable zu"*/
        super(name, gehalt);
        _boni = boni;
    }

    public Chef(String name, BigDecimal gehalt) {  // Methode zweimal vorhanden,
       this(name, gehalt, 0.0);               //Construct entweder über den oberen oder den unteren
        _boni = 0.0;
    }
    @Override
    public void gehaltserhoehung(){ //von Mitarbeiter -> auch bei Azubi
    super._gehalt=super._gehalt.multiply(new BigDecimal("1.2")); //20% mehr Gehalt
    }

    @Override // etwas wird überschrieben
    public String toString() {

        return super.toString() + " und " + _boni + " EUR Boni.";
    }
}
