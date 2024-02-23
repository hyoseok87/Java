package de.uebungen;

public class Spieler {

	
	// Attribute(Globale sollten deklariert werden)
		public String name;
		public int lebenspunkte;
		public int goldmuenzen;
		
//		kONSTRUKTOREN
		public Spieler( ) {
			name = "Jane doe";
			lebenspunkte = 1;
			goldmuenzen = 1;
		}
		
		//Überladener Konstruktor
		//Selber "Name", aber unterschiedliche Parameterliste
		
		public Spieler(String name) {
			this("asd", 1, 2); //Konstruktorverkettung
			this.name = name;
		
		}
		
		public Spieler(String name, int lebenspunkte, int goldmuenzen) {
			this.name = name;
			this.lebenspunkte = lebenspunkte;
			this.goldmuenzen = goldmuenzen;
		}
		
		//Methoden
		public void info() {
			System.out.println("\nName: "+name+"\nLebenspunkte:" +lebenspunkte);
		}
		
		public void findeMuenzen() {
			goldmuenzen = goldmuenzen +2 ;
		}
		
		public void werfeMitMuenze() {
		    if (goldmuenzen > 0) {
		        goldmuenzen--;
		        lebenspunkte--; 
		    } else {
		        System.out.println("Du hast kein Muenzen zum Werfen");
		    }
		}

		
		public void werfeMitMuenze(int anzahlMuenzen) {
			for(int i = 0; i < anzahlMuenzen; i++) {
				werfeMitMuenze();
			}
		}
}

