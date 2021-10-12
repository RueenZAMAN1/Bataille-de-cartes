package bataille;

public class Carte {
	
	private String couleur;
	private int valeur;
	static String couleurs[] = {"noir", "rouge"};
	static Integer valeurs[] = {1,2,3,4,5,6,7,8,9,10,11,12,13};
	
	// À la création d'une carte, on lui assigne ses caratcéristiques principales
	public Carte(String couleur, int valeur) {	
		this.couleur = couleur;
		this.valeur = valeur;
	}
	
	public String getCouleur() {
		return couleur;
	}
	
	public int getValeur() {
		return valeur;
	}
	
}
