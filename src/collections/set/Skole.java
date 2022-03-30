package collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Skole {
    private String navn;
    private HashSet<Studerende> studerende = new HashSet<>();

    public Skole(String navn){
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }

    public void addStuderende(Studerende elev){
        if (!studerende.contains(elev)){
            studerende.add(elev);
        }
    }

    public void removeStuderende(Studerende elev){
        if (studerende.contains(elev)){
            studerende.remove(elev);
        }
    }

    public double gennemsnit(){
        double total = 0.0;
        int karaktererIAlt = 0;
        for (Studerende s : studerende){
            for (Integer karakter : s.getKarakter()){
                karaktererIAlt++;
                total += karakter;

            }
        }
        return total / karaktererIAlt;

    }

    public Studerende findStuderende(int studieNr){
        for (Studerende s : studerende){
            if (s.getStudieNr() == studieNr){
                return s;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Skole{" +
                "navn='" + navn + '\'' +
                ", studerende=" + studerende +
                '}';
    }
}
