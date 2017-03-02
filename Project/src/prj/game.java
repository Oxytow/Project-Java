package prj;

import java.util.Random;
import java.util.Scanner;

public class game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("R�gles du jeu :\n"
				+ "L'utilisateur doit d�duire des quatres mot affich� l'id�e ou le mot appropri� dans un minimum de temps.\n"
				+ "Pour donner le mot exact, il devra s�lectionner parmi les lettres qui lui sont propos�es.\n");
		Scanner scan = new Scanner(System.in);
		System.out.println("Commencer le jeu ? (O/N)");
		String ouiOuNon = scan.nextLine();
		String ouiOuNon2;
		String oui = "o";
		String non = "n";

		while (!oui.equalsIgnoreCase(ouiOuNon) && (!non.equalsIgnoreCase(ouiOuNon))) {
			System.out.println("\nSelectionner O ou N :");
			ouiOuNon = scan.nextLine();
		}

		if (ouiOuNon.equalsIgnoreCase(oui)) {

			do {
				int min = 0;
				int max = 4;
				int r = min+(int)(Math.random()*((max-min) + 1));
				int choixJeu = r;
				
				String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","w","x","y","z"};
						
				String jeu[][] = { 
						{ "Pomme", "Fraise", "P�che", "Cerise", "Fruit", "5" },
						{ "Epinard", "Carrotte", "Pomme de terre", "Courge", "L�gume","6" },
						{ "France", "Russie", "Mexique", "Allemagne", "Pays", "4" },
						{ "Vert", "Violet", "Orange", "Blanc", "Couleur", "7" },
						{ "Tennis", "Natation", "Danse", "Athl�tisme", "Sport", "5" },
						{ "Lion", "Gu�pard", "Panterre", "Crocodile", "Animaux", "7" } };

				String reponseJeu = jeu[choixJeu][4];
				String lettreJeu = jeu[choixJeu][5];

				System.out.println("\n1." + jeu[choixJeu][0] + " 2." + jeu[choixJeu][1] + " 3." + jeu[choixJeu][2]
						+ " 4." + jeu[choixJeu][3]);
				System.out.println("\nLe mot est constitu� de " + lettreJeu +" parmis les lettre suivantes : ");
				System.out.println("Le mot est :");
				String reponse = scan.nextLine();

				if (reponse.equalsIgnoreCase(reponseJeu)) {
					System.out.println("Bravo vous avez trouver la bonne r�ponse!\n");

				} else {
					String reponse2;
					do {
						System.out.println("Mauvaise r�ponse! \nLe mot est :");
						reponse2 = scan.nextLine();
					} while (!reponse2.equalsIgnoreCase(reponseJeu));
					System.out.println("Bravo vous avez trouver la bonne r�ponse!\n");
				}

				System.out.println("Voulez vous rejouez ? (O/N)");
				ouiOuNon2 = scan.nextLine();

				while (!oui.equalsIgnoreCase(ouiOuNon2) && (!non.equalsIgnoreCase(ouiOuNon2))) {
					System.out.println("\nSelectionner O ou N :");
					ouiOuNon2 = scan.nextLine();
				}

			} while (ouiOuNon2.equalsIgnoreCase(oui));
			System.out.println("Fin du jeu!");

		}

		else {
			System.out.println("Fin du jeu!");
		}
		scan.close();

	}

}

