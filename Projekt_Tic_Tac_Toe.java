import java.util.Scanner;

public class Projekt_Tic_Tac_Toe {

	// Überprüfen Sie, ob der eingegebene Ort gültig ist
			public static boolean eingabeUeberpruefung (int x , int y, int[][] feld) {
			 if(x<1 || x>3 || y<1 || y>3) {
				 System.out.println("Ungültige Position. Zeilen und Spalten sollten Werte von 1 bis 3 haben ");
			 }
			 return false;
			 // Wenn ein Symbol bereits platziert ist
		        if (feld[x - 1][y - 1] != ' ') {
		            System.out.println("Das Symbol ist bereits an dieser Stelle platziert. Bitte wählen Sie eine andere Position.");
		            return false;
			}
	
	
	public static void main(String[] args) {
	 int [][] feld = new int[3][3];
	// Array initialisieren (alle Zellen auf leer setzen) 
	for (int i=0; i<3; i++) {
		for(int j=0; j<3; j++) {
			feld [i][j] = ' ';
	}
	// Benutzer gibt Koordinaten ein
		Scanner benutzer1Eingabe = new Scanner(System. in);
		int x,y;
		System.out.println("geben Sie Koordinaten im Format x,y ein.:");
		
		do {
		x = benutzer1Eingabe.nextInt();
		y = benutzer1Eingabe.nextInt();
		} while (eingabeUeberpruefung(x,y,feld));
		feld[x - 1][y - 1] = 'X'; 
		
	}

 }
}
			
}
