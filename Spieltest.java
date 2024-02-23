package de.uebungen;

public class Spieltest {

	public static void main(String[] args) {
		// Objekt aus der Klasse Spieler erzeugt.
		
		Spieler dieter = new Spieler();
		Spieler hildegard = new Spieler();
		
		dieter.name ="Bla Blup";
		dieter.lebenspunkte = 5;
		dieter.goldmuenzen = 2;
		
		hildegard.name ="Blup Bla";
		hildegard.lebenspunkte = 5;
		hildegard.goldmuenzen = 3;

		dieter.info();
		dieter.werfeMitMuenze();
		dieter.werfeMitMuenze();
		dieter.werfeMitMuenze();
		System.out.println(dieter.goldmuenzen);
		System.out.println(hildegard.goldmuenzen);
	}

}
