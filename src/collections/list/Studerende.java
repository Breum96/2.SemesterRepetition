package collections.list;

import java.util.ArrayList;
import java.util.List;

public class Studerende implements Comparable<Studerende> {
    private int studieNr;
    private String navn;
    private List<Integer> karakterer;

    public Studerende(int studieNr, String navn){
        karakterer = new ArrayList<>();
        this.studieNr = studieNr;
        this.navn = navn;
    }

    public int getStudieNr() {
        return studieNr;
    }

    public String getNavn() {
        return navn;
    }

    public List<Integer> getKarakter() {
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


    @Override
    public int compareTo(Studerende o) {
        return studieNr - o.studieNr;
    }
}
