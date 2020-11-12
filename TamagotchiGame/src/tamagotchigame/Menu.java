package tamagotchigame;

import outils.Clavier;

public class Menu {

	/*
	 * On regroupe toutes les méthodes dans le start menu pour tout lancer plus
	 * facilement dans le main
	 */

	public static void startMenu() {

		donneTypeAuTama();
		donneNomAuTama();
		donneCouleurAuTama();
		donneCouleurCheveuxAuTama();
	}

	/*
	 * Demande Nom
	 */

	public static void printDemandeNom() {

		System.out.println("Entrer le nom de votre " + Main.myTama.getType());
	}

	public static String demandeNom() {

		String nomUser = Clavier.lireString();
		return nomUser;
	}

	public static void donneNomAuTama() {

		printDemandeNom();
		Main.myTama.setNom();
	}

	/*
	 * Demande Couleurs
	 */

	public static void printDemandeCouleur() {

		System.out.println(
				"Entrer la couleur de votre " + Main.myTama.getType() + "\nBlanc : 1\n" + "Noir : 2\nGris : 3");
	}

	public static int demandeCouleur() {

		int couleurUser = Clavier.lireInt();
		return couleurUser;
	}

	public static void donneCouleurAuTama() {

		printDemandeCouleur();
		Main.myTama.setCouleur();
	}

	public static void printDemandeCouleurCheveux() {

		System.out.println("Entrer la couleur des cheveux de votre " + Main.myTama.getType() + "\nBlanc : 1\n"
				+ "Noir : 2\nGris : 3");
	}
	
	public static int demandeCouleurCheveux() {
		
		int couleurChev = Clavier.lireInt();
		return couleurChev;
	}
	
	public static void donneCouleurCheveuxAuTama() {
		
		printDemandeCouleurCheveux();
		Main.myTama.setCouleurCheveux();
	}
	/*
	 * Demande Type
	 */

	public static void printDemandeType() {

		System.out.println("Entrer le type de votre Tama : \nChien : 1\n" + "Lapin : 2\nDragon : 3");
	}

	public static int demandeType() {

		int typeUser = Clavier.lireInt();
		return typeUser;
	}

	public static void donneTypeAuTama() {

		printDemandeType();
		Main.myTama.setType();
	}

}