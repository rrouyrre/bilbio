public class Dictionnaire extends Ouvrage {
	
	//Attributs
	private String langue;
	
	//Accesseurs
	public String getLangue() {
		return langue;
	}

	
	//Constructeurs
	public Dictionnaire (String t, String c) {
		super(t);
		langue=c;
	}
	
	//Méthodes
	public String toString() {
		return getTitre()+","+langue;
	}	
}
