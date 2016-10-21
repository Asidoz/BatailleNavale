import java.util.*;

public class Demo {
	
	private static int plateauEnnemis[][] = { 
			{0,0,1,1,1,1,1,0,0,0},
			{0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,1,0,0,0},
			{0,0,0,1,0,0,1,0,0,0},
			{0,0,0,1,0,0,1,0,0,0},
			{0,0,0,1,0,0,0,0,0,0},
			{0,0,0,1,0,0,0,0,0,0},
			{0,1,0,0,0,0,0,0,0,0},
			{0,1,0,0,0,0,0,1,1,1},
			{0,0,0,0,0,0,0,0,0,0}
	};
	
	private static int plateauPerso[][] = { 
			{0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0}
	};
	
	public static void main(String args[])
    {
		
		char ligne;
		int colonne;
		String str;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			affichePlateau(plateauPerso);
			
			System.out.println("--- Choix de la cible ---");
			System.out.print("Ligne : ");
			str = sc.nextLine();
			ligne = str.charAt(0);
			System.out.print("Colonne : ");
			colonne = sc.nextInt();
			
			System.out.println("\n"+ligne+" | "+colonne+"\n");
			
			System.out.println("\n\n\n\n\n\n\n\n\n\n");
			
			sc.nextLine();
			
			tirer(ligne,colonne-1);
		
		}
		
    }
	
	public static void affichePlateau(int[][] plateau) {
		char lettres[] = {'a','b','c','d','e','f','g','h','i','j'};
		int i=0;
		System.out.println("    1   2   3   4   5   6   7   8   9   10");
		System.out.println("  -----------------------------------------");
		for (int[] ligne : plateau) {
			System.out.print(lettres[i]+" | ");
			i++;
			for(int v : ligne) {
				if(v == 0) 
					System.out.print("  | ");
				else if(v == 2)
					System.out.print("- | ");
				else
					System.out.print("X | "); 
			}
			System.out.println("");
			System.out.println("  -----------------------------------------");
		}
	}
	
	public static void tirer(char l, int c) {
		
		int numL=-1;
		switch (l) {
		case 'a':
			numL=0;
			break;
			
		case 'b':
			numL=1;
			break;
			
		case 'c':
			numL=2;
			break;
			
		case 'd':
			numL=3;
			break;
			
		case 'e':
			numL=4;
			break;
			
		case 'f':
			numL=5;
			break;
			
		case 'g':
			numL=6;
			break;
			
		case 'h':
			numL=7;
			break;
			
		case 'i':
			numL=8;
			break;
			
		case 'j':
			numL=9;
			break;

		default:
			break;
		}
		
		if(numL >= 0 && numL < 10 && c >= 0 && c < 10) {
			
			if(plateauEnnemis[numL][c] == 1) {
				
				System.out.println("          -----  Touché ! >:D  -----\n");
				plateauPerso[numL][c] = 1;
				
			} else {
				System.out.println("          ----- Loupé... :( -----\n");
				plateauPerso[numL][c] = 2;
			}
			
		}
		
	}
	
}
