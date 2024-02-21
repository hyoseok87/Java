
public class Aufgaben_Tag_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] array1 = {1, 2, 3};
        array1 = größerearray(array1, 5); 
        for(int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
    }

	 public static int[] größerearray(int[] array1, int neueGröße) {
		 int[] array2 = new int[neueGröße]; 
		 int i = Math.min(array1.length, neueGröße);
		 System.arraycopy(array1, 0, array2, 0, i);
		return array2;
	 }}
	 
	


//initalisieren von zwei Werten für den GGT
//int u = 121;
//int v = 88;
//
////Euklidischer Algorithmus für den GGT 
//do {
//	
//	if ( u < v) {
//		int Vertausche = u;
//		u = v;
//		v = Vertausche;}
//	else {u= u-v;
//	}
//	
//	
//} while ( u != 0);
//
//// den größten gemeinsamen Teiler von zwei Variabeln
//System.out.println(v);

//Inhalt vom array1, in das array2 kopieren.

//int[] array1 = {1, 2, 3};
//int[] array2 = new int[10]; 
//
//System.arraycopy(array1, 0, array2, 0, array1.length);
//array1 = array2; // array2의 주소를 array1에 할당하여 array1이 array2를 가리키도록 함
//
//for(int i = 0; i < array1.length; i++) {
//    System.out.println(array1[i]);


//int a = 10;
//int b = 20;
//
//System.out.println("Die größere Zahl ist: " + getMax(a, b)); 
//
//char ch = 'B';
//System.out.println("Ist " + ch + " ein lateinischer Buchstabe? " + isLatinLetter(ch));



////Soll die größere von zwei Zahlen zurückgeben.	
//public static int getMax(int a, int b) {
//return a > b ? a : b;
//	}
//    	
////Soll prüfen, ob das übergebene Zeichen ein lateinischer Buchstabe ist. 
//public static boolean isLatinLetter(char ch) {
//return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
//
//}

