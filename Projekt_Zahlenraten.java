import java.util.Random;
import java.util.Scanner;

public class Projekt_Zahlenraten {
    
    private static final int MAX_VERSUCHE = 3;
    
    public static void main(String[] args) {
        Random random = new Random();
        int zahl = random.nextInt(20) + 1;
        System.out.println("Herzlich Willkommen Zahlenraten Spiel!");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Bitte erraten Sie die gesuchte Zahl, sie befindet sich zwischen 1 und 20.");
        
        for (int versuch = 1; versuch <= MAX_VERSUCHE; versuch++) {
            if (startVersuch(zahl, versuch)) {
                System.out.println("Glückwunsch, die von Ihnen eingegebene Zahl (" + zahl + ") stimmt mit der gesuchten Zahl überein.");
                return;
            }
        }
        
        System.out.println("Sie haben alle Versuche verbraucht.\nDie gesuchte Zahl war: " + zahl);
    }
    
    private static boolean startVersuch(int zahl, int versuch) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Ihr " + versuch + ". Versuch: ");
        
        while (!s.hasNextInt()) { 
            System.out.println("Ungültige Eingabe. Bitte geben Sie eine ganze Zahl ein.");
            System.out.print("Ihr " + versuch + ". Versuch: ");
            s.next(); 
        }
        int versuchZahl = s.nextInt();
        
        if (versuchZahl == zahl) {
            return true; 
        } else if (versuchZahl > zahl) {
            System.out.println("Die gesuchte Zahl ist kleiner!");
        } else {
            System.out.println("Die gesuchte Zahl ist größer!");
        }
        
        return false; 
    }
}

