package collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Studerende {
    private int studieNr;
    private String navn;
    private HashSet<Integer> karakterer;

    public Studerende(int studieNr, String navn){
        karakterer = new HashSet<>();
        this.studieNr = studieNr;
        this.navn = navn;
    }

    public int getStudieNr() {
        return studieNr;
    }

    public String getNavn() {
        return navn;
    }

    public HashSet<Integer> getKarakter() {
        return karakterer;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void addKarakter(int karakter){
        karakterer.add(karakter);
    }

    @Override
    public String toString() {
        return "Studerende{" +
                "studieNr=" + studieNr +
                ", navn='" + navn + '\'' +
                ", karakterer=" + karakterer +
                '}';
    }
}
