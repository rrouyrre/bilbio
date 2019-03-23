import java.io.*;

public class Adherent extends Personne{
	
	//Attributs
	private int identifiant;
		
	//Accesseurs
	public int getId(){
		return identifiant;
	}

	//Constructeurs
	public Adherent(){
		super();
		this.identifiant=0;
	}
	
	public Adherent(int id){
		super();
		this.identifiant=id;
	}
	
	public Adherent(String p, String n, int id) {
		super(p,n);
		this.identifiant=id;
	}
	
	public Adherent(int id, Personne pers){
		this.nom=pers.getNom();
		this.prenom=pers.getPrenom();
		this.identifiant=id;
	}
	
	
	//Méthodes
	public String toString() {
		return "Adherent: Prenom Nom, identifiant: "+getPrenom()+" "+getNom()+","+identifiant;
	}
		
	public Adherent ajouterAdherent(int n, String nom, String prenom) {
		Personne personne=new Personne (nom, prenom);
		Adherent adh1 =new Adherent(n, personne);
		return adh1;
	}

}
		
