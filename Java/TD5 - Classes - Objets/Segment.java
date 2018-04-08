
/**
 * Segment du plan
 */
public class Segment {
	
	private double x1, x2, y1, y2;
	
	public void initialise(double x1, double x2, double y1, double y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}

	/**
	 * Longueur du segement
	 * Note : le carr� de l'hypot�nuse est �gale � la somme des carr�s des 2 autres cot�s
	 * @return longueur
	 */
	public double longueur() {
		return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		/* Note : on pr�f�re �crire a*a plutot que d'utiliser Math.pow(a,2),
		 pour �viter un appel de fonction et obtenir une lisibilit� accrue (d�bat ouvert) */
	}
	
	/**
	 * Translate l'origine du segment
	 * @param dx
	 * @param dy
	 */
	public void translateOrigine(double dx, double dy) {
		this.x1 += dx;
		this.y1 += dy;
	}
	
	/**
	 * Translate l'extr�mit� du segment
	 * @param dx
	 * @param dy
	 */
	public void translateExtremite(double dx, double dy) {
		this.x2 += dx;
		this.y2 += dy;
	}
	
	/**
	 * Affiche les informations du segment
	 */
	public void affiche() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Segment : (" + x1 + ", " + x2 + "), (" + y1 + ", " + y2 + "), l=" + longueur();
	}
	
	
}
