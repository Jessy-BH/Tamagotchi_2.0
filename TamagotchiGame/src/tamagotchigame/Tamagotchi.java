package tamagotchigame;

public class Tamagotchi {

	String nom;
	String couleur;
	String couleurCheveux;
	String type;
	int compteurFaim = 5;
	String faim;
	int vie = 100;

	/**
	 * Constructeur
	 */

	public Tamagotchi() {

	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom() {
		this.nom = Menu.demandeNom();
	}

	/**
	 * @return the couleur
	 */
	public String getCouleur() {
		
		return couleur;
	}

	/**
	 * @param couleur the couleur to set
	 */
	public void setCouleur() {
		switch (Menu.demandeCouleur()) {

		case 1:
			this.couleur = "Blanc";
			break;

		case 2:
			this.couleur = "Noir";
			break;

		case 3:
			this.couleur = "Gris";
			break;

		default:
			System.out.println("Veuillez saisir 1, 2 ou 3.");
			this.setCouleur();
			break;
		}
	}

	public String getCouleurCheveux() {
		
		return couleurCheveux;
	}

	public void setCouleurCheveux() {
		switch (Menu.demandeCouleurCheveux()) {

		case 1:
			this.couleurCheveux = "Blanc";
			break;

		case 2:
			this.couleurCheveux = "Noir";
			break;

		case 3:
			this.couleurCheveux = "Gris";
			break;

		default:
			System.out.println("Veuillez saisir 1, 2 ou 3.");
			this.setCouleurCheveux();
			break;
		}
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType() {

		switch (Menu.demandeType()) {

		case 1:
			this.type = "Chien";
			break;

		case 2:
			this.type = "Lapin";
			break;

		case 3:
			this.type = "Dragon";
			break;

		default:
			System.out.println("Veuillez saisir 1, 2 ou 3.");
			this.setType();
			break;
		}

	}

	/**
	 * @return the faim
	 */
	public String getFaim() {
		return faim;
	}

	/**
	 * @param faim the faim to set
	 */
	public void setFaim(String faim) {
		this.faim = faim;
	}

	/**
	 * @return the compteurFaim
	 */
	public int getCompteurFaim() {
		
		return compteurFaim;
	}

	/**
	 * @param compteurFaim the compteurFaim to set
	 */
	public void setCompteurFaim(int x) {

		int min = 0;
		int max = 10;

		int somme = this.compteurFaim += x;

		if (somme > max) {

			this.compteurFaim = max;

		} else if (somme < min) {

			this.compteurFaim = min;
		} else {
			this.compteurFaim = somme;
		}
	}

	public void manger() {
		
		this.compteurFaim++;

	}

	/**
	 * @return the vie
	 */
	public int getVie() {
		
		return vie;
	}

	/**
	 * @param vie the vie to set
	 */
	public void setVie(int x) {

		int min = 0;
		int max = 100;

		int somme = this.vie += x;

		if (somme > max) {

			this.vie = max;

		} else if (somme < min) {

			this.vie = min;
		} else {
			this.vie = somme;
		}
	}

	public void reproduire() {
		
		this.compteurFaim--;
		this.vie++;
	}

	public void wc() {
		
		this.vie++;
	}

	public void roux() {
		
		this.couleurCheveux = "Roux";
		System.out.println(Main.myTama.toString());
	}

	public void repos() {
		
		this.vie++;
		this.compteurFaim--;
	}
	
	public void humeur() {
		
		if(compteurFaim < 2) {
			System.out.println("Votre " + type + " a vraiment très faim");
		}else if(compteurFaim <= 5) {
			System.out.println("Votre " + type + " commence à avoir faim");
		}else if (compteurFaim >= 6) {
			System.out.println("Votre " + type + " se sent bien");
		}
	}
	
	public void amis() {
		
		System.out.println("Votre " + type + " voit ses amis " + type);
	}
	
	public void sport() {
		
		this.vie++;
		this.compteurFaim = compteurFaim-2;
	}
	
	public void seLaver() {
		
		this.vie++;
	}
	
	@Override
	public String toString() {
		
		return "Votre " + type + " " + couleur + " aux cheveux " + couleurCheveux + " s'appelle " + nom;
	}

}