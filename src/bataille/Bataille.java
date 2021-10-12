package bataille;
import java.util.ArrayList;
import java.lang.Math;

public class Bataille {

	public static void main(String[] args) {
		
		Joueur joueur1 = new Joueur();
		Joueur joueur2 = new Joueur();
		Joueur joueurs[]= {joueur1,joueur2};
		ArrayList<Carte> pile = new ArrayList<Carte>();
		
		// Création du paquet de cartes
		for (int i=0; i<Carte.couleurs.length; i++) {
			String currCouleur = Carte.couleurs[i];			
			for (int j=0; j<Carte.valeurs.length; j++) {
				int currValeur = Carte.valeurs[j];
				Carte currCarte = new Carte(currCouleur, currValeur);
				pile.add(currCarte);
			}
		}
		
		// Distribution des cartes au hasard
		while (pile.size()>0) {	
			for (int i=0; i<joueurs.length; i++){
				int index = (int)(Math.random()*pile.size()-1); // on choisit une carte au hasard dans le paquet (avec un index au hasard)
				joueurs[i].cartes.add(pile.get(index)); // on ajoute cette carte au jeu du joueur en question
				pile.remove(index); // on enlève cette carte du paquet de distribution par son index
			}
		}
		System.out.println("Les cartes ont été distribuées..");
				
		// Jeu
		while(joueur1.cartes.size()>0){ // Tant que les joueurs on au moins une carte dans leur jeu, ils tirent et comparent leur carte
			Carte currCarte1 = joueur1.TireUneCarte();
			Carte currCarte2 = joueur2.TireUneCarte();
			if (currCarte1.getValeur()>currCarte2.getValeur()) {
				joueur1.counter++;
			}
			else if (currCarte1.getValeur()<currCarte2.getValeur()){
				joueur2.counter++;
			}
			else {
				continue;
			}
			System.out.println("Joueur 1: "+ joueur1.counter+"  Joueur2: "+joueur2.counter);
		}
		
		// Comparaison des points
		if (joueur1.counter > joueur2.counter) {
			System.out.println("Le joueur 1 remporte la partie! " +joueur1.counter+" contre "+joueur2.counter+" !");
		}
		else if (joueur1.counter < joueur2.counter) {
			System.out.println("Le joueur 2 remporte la partie! "+joueur2.counter+" contre "+joueur1.counter+" !");
		}
		else {
			System.out.println("Égalité, personne remporte la partie! "+ joueur1.counter+" partout!");
		}
		
	}

}
