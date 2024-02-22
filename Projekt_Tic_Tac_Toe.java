import java.util.Scanner;

public class Projekt_Tic_Tac_Toe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean nochmalSpielen = true;

        // Schleife für das Hauptspiel
        while (nochmalSpielen) {
            spielAusführen(scanner); // Tic Tac Toe Spiel ausführen
            System.out.print("Möchten Sie noch einmal spielen? (y/n): ");
            String wahl = scanner.nextLine().toLowerCase();
            while (!wahl.equals("y") && !wahl.equals("n")) {
                System.out.print("Ungültige Eingabe! Bitte geben Sie 'y' für Ja oder 'n' für Nein ein: ");
                wahl = scanner.nextLine().toLowerCase();
            }
            nochmalSpielen = wahl.equals("y"); // Weiterhin spielen oder nicht
        }

        System.out.println("Auf Wiedersehen!");
        scanner.close(); // Scanner schließen
    }

    // Methode zum Ausführen eines Spiels
    public static void spielAusführen(Scanner scanner) {
        char[][] spielfeld = new char[3][3]; // Das Spielfeld initialisieren
        char aktuellerSpieler = 'X'; // Der aktuelle Spieler initialisieren
        int verbleibendeZüge = 9; // Die verbleibende Anzahl von Zügen initialisieren

        spielfeldInitialisieren(spielfeld); // Das Spielfeld mit leeren Werten initialisieren
        System.out.println("Herzlich Willkommen bei Tic Tac Toe!");
        System.out.println("------------------------------------");

        // Schleife für den Spielverlauf
        while (verbleibendeZüge > 0) {
            System.out.println("Spieler " + aktuellerSpieler + ", geben Sie die Zeile (1-3) ein: ");
            int zeile = getInput(scanner) - 1; // Die Zeile des Spielers erhalten
            System.out.println("Spieler " + aktuellerSpieler + ", geben Sie die Spalte (1-3) ein: ");
            int spalte = getInput(scanner) - 1; // Die Spalte des Spielers erhalten

            // Überprüfen, ob der Zug gültig ist
            if (istZugGültig(spielfeld, zeile, spalte)) {
                spielfeld[zeile][spalte] = aktuellerSpieler; // Das Spielfeld mit dem Zug des Spielers aktualisieren
                spielfeldAusgeben(spielfeld); // Das aktualisierte Spielfeld ausgeben

                // Überprüfen, ob der aktuelle Spieler gewonnen hat
                if (istGewinner(spielfeld, aktuellerSpieler)) {
                    System.out.println("Spieler " + aktuellerSpieler + " hat gewonnen!");
                    return; // Das Spiel beenden
                }

                // Spielerwechsel für den nächsten Zug
                aktuellerSpieler = (aktuellerSpieler == 'X') ? 'O' : 'X';
                verbleibendeZüge--; // Die verbleibende Anzahl von Zügen verringern
            } else {
                System.out.println("Die Position ist schon besetzt! Bitte geben Sie andere Nummern ein!");
            }
        }

        System.out.println("Das Spiel endet unentschieden!");
    }

    // Methode zum Initialisieren des Spielfelds
    public static void spielfeldInitialisieren(char[][] spielfeld) {
        for (int i = 0; i < spielfeld.length; i++) {
            for (int j = 0; j < spielfeld[i].length; j++) {
                spielfeld[i][j] = ' '; // Jede Zelle im Spielfeld mit einem leeren Wert initialisieren
            }
        }
    }

    // Methode zum Ausgeben des Spielfelds
    public static void spielfeldAusgeben(char[][] spielfeld) {
        System.out.println("-------------");
        for (char[] zeile : spielfeld) {
            System.out.print("| ");
            for (char zelle : zeile) {
                System.out.print(zelle + " | "); // Jede Zelle im Spielfeld ausgeben
            }
            System.out.println("\n-------------");
        }
    }

    // Methode zum Einlesen einer Ganzzahl als Benutzereingabe
    public static int getInput(Scanner scanner) {
        while (true) {
            try {
                int input = Integer.parseInt(scanner.nextLine());
                if (input >= 1 && input <= 3) {
                    return input; // Die eingegebene Zahl zurückgeben, wenn sie zwischen 1 und 3 liegt
                } else {
                    throw new NumberFormatException(); // Eine Ausnahme auslösen, wenn die Eingabe außerhalb des gültigen Bereichs liegt
                }
            } catch (NumberFormatException e) {
                System.out.println("Ungültige Eingabe! Bitte geben Sie eine Zahl zwischen 1 und 3 ein.");
            }
        }
    }

    // Methode zur Überprüfung, ob ein Zug gültig ist
    public static boolean istZugGültig(char[][] spielfeld, int zeile, int spalte) {
        return zeile >= 0 && zeile < spielfeld.length && spalte >= 0 && spalte < spielfeld[zeile].length && spielfeld[zeile][spalte] == ' ';
    }

    // Methode zur Überprüfung, ob ein Spieler gewonnen hat
    public static boolean istGewinner(char[][] spielfeld, char spieler) {
        for (int i = 0; i < 3; i++) {
            if ((spielfeld[i][0] == spieler && spielfeld[i][1] == spieler && spielfeld[i][2] == spieler) || 
                (spielfeld[0][i] == spieler && spielfeld[1][i] == spieler && spielfeld[2][i] == spieler)) {
                return true; // Überprüfen auf horizontalen oder vertikalen Gewinn
            }
        }
        return (spielfeld[0][0] == spieler && spielfeld[1][1] == spieler && spielfeld[2][2] == spieler) || 
               (spielfeld[0][2] == spieler && spielfeld[1][1] == spieler && spielfeld[2][0] == spieler); // Überprüfen auf diagonalen Gewinn
    }
}














