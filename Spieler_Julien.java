package de.uebungen;

public class Spieler_Julien {

	public static void main(String[] args) {
		
		Spieler Julien = new Spieler();
		Spieler Saba = new Spieler();
		
		Julien.name ="Julien";
		Julien.lebenspunkte = 10;
		Julien.goldmuenzen = 20;
		
		julienSpiel(Julien);
		System.out.println("goldmuenzen:" + Julien.goldmuenzen + "\nlebenspunkte: " + Julien.lebenspunkte);
		
		
		Saba.name ="Saba";
		Saba.lebenspunkte = 3;
		Saba.goldmuenzen = 2;
		
		sabaSpielen(Saba);
		System.out.println("goldmuenzen" +Saba.goldmuenzen + "\nlebenspunkte" + Saba.lebenspunkte);
		
		Spieler testSpieler = new Spieler();
		testSpieler.info();
		
		Spieler ueberladenSpieler = new Spieler ("Aytac");
		ueberladenSpieler.info();
		
		
		

	}

	private static void sabaSpielen(Spieler Saba) {
		Saba.info();
		Saba.werfeMitMuenze();
		Saba.werfeMitMuenze();
		Saba.werfeMitMuenze();
		Saba.findeMuenzen();
		Saba.findeMuenzen();
	}

	private static void julienSpiel(Spieler Julien) {
		Julien.info();
		Julien.werfeMitMuenze();
		Julien.werfeMitMuenze();
		Julien.werfeMitMuenze();
		Julien.findeMuenzen();
	}

}
