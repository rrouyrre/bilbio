public class Auteur extends Personne {
	
	//Attributs
	private int numero;

	//Accesseurs
	public int getNum(){
		return numero;
	}
	
	//Constructeurs
	public Auteur(){
		super();
		this.numero=0;
	}
	
	public Auteur (int num){
		super();
		this.numero=num;
	}
	
	public Auteur(String p, String n, int num) {
		super(p,n);
		numero=num;
	}
	
	public Auteur(Personne pers, int num){
		nom=pers.getNom();
		prenom=pers.getPrenom();
		numero=num;
	}
	
	//Méthodes
	public String toString() {
		return getPrenom()+ " " +getNom()+", auteur numero "+numero;
	}
}
