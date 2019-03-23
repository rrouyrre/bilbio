public class Personne{
	
	//Attributs
	public String prenom;
	public String nom;
	
	//Accesseurs
	public String getPrenom(){
		return prenom;
	}
		
	public String getNom(){
		return nom;
	}
		
	//Constructeurs
	public Personne() {
		this.prenom = "Inconnu";
		this.nom = "Inconnu";
	}
	
	public Personne(String p, String n) {
		this.prenom=p;
		this.nom=n;
	}
	
	//Méthodes
	public String toString() {
		return "Personne: Prenom Nom: "+getPrenom()+ " " +getNom();
	}
	
	public Personne ajouterPersonne (String a, String b) {
		return new Personne(a,b);
	}
}
	
