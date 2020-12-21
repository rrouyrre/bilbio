public class Ouvrage {
	
	//Attributs
	public String titre;
	public Etat etat;
	
	//Accesseurs
	public String getTitre() {
		return titre;
	}
	
	
	//Constructeurs
	public Ouvrage() {
		this.titre="Inconnu";
	}
	
	public Ouvrage(String t) {
		this.titre=t;
	}
	
	//Méthodes
	public String toString(){
		return getTitre();
	}
	
	public Ouvrage ajouterOuvrage (String c) {
		return new Ouvrage(c);
	}
	
}
