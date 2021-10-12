package bataille;
import java.util.ArrayList;

public class Joueur {
	
	ArrayList<Carte> cartes = new ArrayList<Carte>();
	public Integer counter = 0;
	
	// S'il lui reste toujours des cartes, le joueur tire une carte
	public Carte TireUneCarte() {
		if (cartes.size()>0) {
			Carte currCarte = cartes.get(cartes.size()-1); // le joueur tire la carte du dessus (index supérieur)
			cartes.remove(cartes.size()-1); // on retire la carte tirée du jeu du joueur
			return currCarte;
		}
		else {
			return null;
		}
	}				
}


