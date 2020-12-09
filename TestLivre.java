public class TestLivre {
	public static void main(String [] args){
	
	String t="La fille de Souslov";
	String p="Habib";
	String n="Abdulrab";
	
	//Création des objets
	Ouvrage o = new Ouvrage("Java");
	Livre l1 = new Livre(t,1,p,n,1); //Meme principe que dictionnaire et revue
	Auteur au1 = new Auteur(p,n,1);
	
	
	//Affichage des attributs:
	System.out.println("Titre de l'ouvrage: "+o);
	System.out.println(l1);
	System.out.println(au1);
	
	}
}
