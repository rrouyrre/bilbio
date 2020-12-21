import java.io.*;
import java.util.LinkedList;

public class ListeLivre extends LinkedList<Livre>{
	
	//Attributs
	private LinkedList<Livre>  list; //Nous aurions pu créer une ListeRevue ou ListeDictionnaire sur le même principe
										//mais nous n'avons pas trouvé cela nécessaire car nous avons déjà bcp de classes
										//de même pour Adhérent et Auteur
	
	//Méthodes
	public static void main(String[] args){
		int i=1; String p="Victor"; String nom="Hugo"; int num=1;
		String t="tit";
		LinkedList<Livre> list = new LinkedList<Livre>();//Crée une liste de Livres
		
		Livre l = new Livre(t,i,p,nom,num);//Crée un livre
		list.add(l);//Ajoute le livre
		Livre l2 = new Livre(t,i,p,nom,num);
		list.add(l2);
		
		for(int j=0; j<list.size(); j++)
		{
			System.out.println(j+" La liste est: "+list.get(j).toString());//Affiche la liste
		}
	}	
}
