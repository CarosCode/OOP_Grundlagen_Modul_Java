package Controller;

import java.math.BigDecimal;

public class Mitarbeiter {
    //________ Instanzvariablen ________
    private String _name;        // private - wird nicht vererbt, bleibt in einer Klasse!
    protected BigDecimal _gehalt;

    //________ Getter Setter ___________
    public String getName() {
        return _name;
    }

    public void setName(String _name) {
        // Schaut in die DB und entscheide.. Bevor zugewiesen wird, kann man prüfen
        this._name = _name;
    }

    //_________ Konstruktoren _____________
    public Mitarbeiter(String name, BigDecimal gehalt) { //Constructor
        _name = name;
        _gehalt = gehalt;
    }
    //________ Weitere Methoden _____________

    public void gehaltserhoehung(){
        _gehalt=_gehalt.add(new BigDecimal(5)); //20% mehr Gehalt
    }
    @Override // etwas wird überschrieben
    public String toString() {

        return _name + " erhaelt " + _gehalt + " EUR Gehalt.";
    }
}
