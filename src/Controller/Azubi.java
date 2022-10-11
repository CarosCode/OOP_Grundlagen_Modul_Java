package Controller;

import java.math.BigDecimal;

public class Azubi extends Mitarbeiter{
    public Azubi(String name, BigDecimal gehalt) {
        super(name, gehalt);
    }
    public void gehaltserhoehung(){ //von Mitarbeiter
        super.gehaltserhoehung();   // super - da in anderer Datei deklariert
        super._gehalt=super._gehalt.add(new BigDecimal(20)); //20% mehr Gehalt
    }
}
