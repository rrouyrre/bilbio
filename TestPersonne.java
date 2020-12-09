public class TestPersonne {
	public static void main(String [] args){
	
	String p="Charles";
	String n="Baudelaire";
	String p1="Habib";
	String n1="Abdulrab";

	//Création des objets
	Personne pers = new Personne(p,n);
	Adherent a1 = new Adherent(p1,n1,1);
	Auteur au1 = new Auteur(p,n,1);
	
	
	//Affichage des attributs:
	System.out.println(pers);
	System.out.println(a1);
	System.out.println(au1);
	
	}
}
