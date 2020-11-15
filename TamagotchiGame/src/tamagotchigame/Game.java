package tamagotchigame;

import outils.Clavier;

public class Game {

	public static void printMenuActions() {

		System.out.println(
				"Menu des actions : \nVoir les informations : 0\nManger : 1\nSe reproduire : 2\nAller aux toilettes : 3"
						+ "\nSe teindre les cheveux en roux : 4\nSe reposer : 5\nExprimer son humeur : 6\nVoir des amis : 7\nFaire du sport : 8"
						+ "\nSe laver : 9");
	}

	public static int demandeActions() {

		int action = Clavier.lireInt();
		return action;
	}

	public static void verifAction() {

		switch (demandeActions()) {

		case 0:
			System.out.println(Main.myTama.toString());
			actions();
		case 1:
			Main.myTama.manger();
			actions();
			break;
		case 2:
			Main.myTama.reproduire();
			actions();
		case 3:
			Main.myTama.wc();
			actions();
		case 4:
			Main.myTama.roux();
			actions();
		case 5:
			Main.myTama.repos();
			actions();
		case 6:
			Main.myTama.humeur();
			actions();
		case 7:
			Main.myTama.amis();
			actions();
		case 8:
			Main.myTama.sport();
			actions();
		case 9:
			Main.myTama.seLaver();
			actions();
		default:
			demandeActions();
			break;
		}
	}

	public static void actions() {
		
		printMenuActions();
		verifAction();
	}
}