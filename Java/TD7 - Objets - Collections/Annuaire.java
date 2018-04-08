import java.util.ArrayList;
import java.util.Comparator;

/**
 *  Annuaire g�rant des Individus
 *  
 *  M�thodes � impl�menter :
 *  	addIndividu(nom,adresse,num�ro de t�l�phone)
 *  	displayAllIndividus : affichage de tous les individus
 *  	getNbIndividus() : retourne le nombre d'individus contenus dans l'annuaire
 *  Votre impl�mentation utilisera la classe ArrayList pour stocker la liste des individus.
 */
public class Annuaire {
	
	private ArrayList<Individu> liste;
	
	
	
	/**
	 * Cr�e un annuaire vide
	 */
	public Annuaire() {
		liste = new ArrayList<>();
	}

	/**
	 * Ajoute un nouvel individu � l'annuaire
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param numero
	 * 
	 * Note : cette m�thode n'a que peu d'int�ret, c'est l'appelant qui devrait faire ces op�rations...
	 */
	public void addIndividu(String nom, String prenom, String adresse, String numero) {
		addIndividu(new Individu(nom, prenom, adresse, numero));
	}
	
	/**
	 * Ajoute un nouvel individu � l'annuaire
	 * @param individu
	 */
	public void addIndividu(Individu individu) {
		liste.add(individu);
	}
	
	/**
	 * Affiche la liste de tous les individus
	 */
	public void displayAllIndividus() {
		System.out.println("Liste des individus :");
		for (Individu individu : liste) {
			System.out.println("\t" + individu.toString());
		}
		System.out.println();
	}
	
	/**
	 * Retourne le nombre d'individus contenus dans l'annuaire
	 * @return nombre d'individus
	 */
	public int getNbIndividus() {
		return liste.size();
	}
	
	/**
	 * Trie l'annuaire par pr�nom
	 */
	public void sortByName() {
		liste.sort(new Comparator<Individu>() {
			public int compare(Individu a, Individu b) {
				return a.getPrenom().compareTo(b.getPrenom());
			}
		});
	}
	
	/**
	 * Trie l'annuaire par num�ro de t�l�phone
	 */
	public void sortByTelNumber() {
		liste.sort(new Comparator<Individu>() {
			public int compare(Individu a, Individu b) {
				return a.getNumero().compareTo(b.getNumero());
			}
		});
	}
}
