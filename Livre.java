public class Livre extends Ouvrage {
	
	//Attributs
	private int numero;
	private Auteur au;
	
	//Accesseurs
	public int getNum() {
		return numero;
	}
	
	//Constructeurs
	public Livre(String t, int n, String p, String nom, int num) {
		super(t);
		this.numero=n;
		this.au = new Auteur(p,nom,num);
	}
	
	public Livre(Ouvrage ouv, int n, Auteur aut){
		this.titre=ouv.getTitre();
		this.numero=n;
		this.au=aut;
	}
	
	public Livre(String t, int n, Auteur aut){
		this.titre=t;
		this.numero=n;
		this.au=aut;
	}
	
	public Livre(Ouvrage ouv, int n, String p, String nom, int num) {
		this.titre=ouv.getTitre();
		this.numero=n;
		this.au = new Auteur(p,nom,num);
	}
	
	//Méthodes
	public String toString() {
		return "Livre: "+this.getTitre()+", numero "+numero+", ecrit par "+au;
	}	
}
