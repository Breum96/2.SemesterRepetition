package søgning.soegningelevopgaver;

import java.util.ArrayList;

public class Spiller {
	private String navn;
	private int hojde;
	private int vaegt;
	private int antalMaal;

	// Opretter et Spiller objekt med navn, højde, vægt og
	// antal mål
	public Spiller(String navn, int hoejde, int vaegt, int antalmaal) {
		this.hojde = hoejde;
		this.navn = navn;
		this.vaegt = vaegt;
		this.antalMaal = antalmaal;
	}

	// returnerer spillerens navn
	public String getNavn() {
		return navn;
	}

	// returnerer spillerens højde i cm
	public int getHoejde() {
		return hojde;
	}

	// returnerer spillerens vægt i kg
	public int getVaegt() {
		return vaegt;
	}

	// returnerer antal mål spilleren har scoret i
	// indeværende sæson
	public int getMaal() {
		return antalMaal;
	}

	// opgave 4.1
	public Spiller findScoreLineær(ArrayList<Spiller> spillere, int score){
		int i = 0;
		while(i < spillere.size()){
			Spiller spiller = spillere.get(i);
			if (spiller.antalMaal == score){
				return spiller;
			}
			i++;
		}
		return null;
	}

	// Opgave 4.2
	public Spiller findScoreBinær(ArrayList<Spiller> spillere, int score){
		int left = 0;
		int right = spillere.size() - 1;
		while(left <= right) {
			// starter med at se på værdien af det midterste tal i vores liste
			int middle = (left+right) / 2;
			Spiller spiller = spillere.get(middle);
			// hvis tallet i midten er det vi leder efter, returneres blot denne spiller
			if (spiller.antalMaal == score){
				return spiller;
			}
			// Hvis tallet i midten er større end det tal vi leder efter
			// Kigger vi nu kun i venstre del, ved at gøre vores højre værdi mindre
			if (spiller.antalMaal > score){
				right = middle - 1;
			}else{
				// hvis tallet i midten er mindre, leder vi så kun i højre del
				left = middle + 1;
			}
		}
		return null;
	}

	// opgave 4.3
	public String godSpiller(ArrayList<Spiller> spillere){
		String bedsteSpiller = "";
		int i = 0;
		while(i < spillere.size()){
			Spiller spiller = spillere.get(i);
			if(spiller.hojde < 170 && spiller.antalMaal > 50){
				bedsteSpiller = spiller.navn;
				return bedsteSpiller;
			}
			i++;
		}
		return bedsteSpiller;
	}
	
	public String toString(){
		return "Navn: " + navn + " højde: " + hojde + " vægt: " + vaegt + " mål: " + antalMaal;
	}

}
