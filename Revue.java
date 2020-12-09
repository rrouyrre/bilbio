public class Revue extends Ouvrage {
	
	//Attributs
	private int numero;
	private String domaine;
	
	//Accesseurs
	public int getNum() {
		return numero;
	}

	public String getDom() {
		return domaine;
	}
	
	//Constructeurs
	public Revue (String t, int n, String c) {
		super(t);
		numero=n;
		domaine=c;
	}
	
	//Méthodes
	public String toString() {
		return getTitre()+","+numero+","+domaine;
	}	
}
