package collections.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Skole {
    private String navn;
    private Map<Integer, Studerende> studerende = new HashMap<>();

    public Skole(String navn){
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }

    public void addStuderende(Studerende elev){
        if (!studerende.containsKey(elev.getStudieNr())){
            studerende.put(elev.getStudieNr(), elev);
        }
    }

    public void removeStuderende(Studerende elev){
        if (studerende.containsKey(elev.getStudieNr())){
            studerende.remove(elev.getStudieNr());
        }
    }

    public double gennemsnit(){
        double sum = 0.0;
        for (Studerende s : studerende.values()){
            sum += s.sumKarakterer();
        }
        return sum / studerende.values().size();

    }

    public Studerende findStuderende(int studieNr){
        for (Studerende s : studerende.values()){
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
