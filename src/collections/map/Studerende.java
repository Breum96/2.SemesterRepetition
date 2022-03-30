package collections.map;

import java.util.*;

public class Studerende {
    private int studieNr;
    private String navn;
    private Map<Integer, Integer> karakterer = new HashMap<>();

    public Studerende(int studieNr, String navn){
        this.studieNr = studieNr;
        this.navn = navn;
    }

    public int getStudieNr() {
        return studieNr;
    }

    public String getNavn() {
        return navn;
    }

    public Map<Integer, Integer> getKarakter() {
        return karakterer;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void addKarakter(int nøgle, int karakter){
        karakterer.put(nøgle, karakter);
    }

    public int sumKarakterer(){
        int sum = 0;
        for (int i : karakterer.values()) {
            sum += i;
        }
        return sum / karakterer.values().size();
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
