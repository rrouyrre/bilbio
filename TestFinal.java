import java.io.*;
import java.util.LinkedList;


public class TestFinal {
	public static void main(String [] args){
				
		//Création des listes
		ListOuvrage list = new ListOuvrage();
		ListeLivre listeLivre= new ListeLivre();
		
		//Initialisation des titres d'ouvrage
		//HP est l'abréviation pour "Harry Potter"
		String t1="HP1";
		String t2="HP2";
		String t3="HP3";
		String t4="HP4";
		String t5="HP5";
		String t6="HP6";
		String t7="HP7";
		boolean r=false;
		
		String titre="HP2";
		int disponible=0;
		
		//Remplissage des listes
		Ouvrage o1 = new Ouvrage(t1);//Crée un ouvrage
		list.add(o1);//Ajoute l'ouvrage à la liste
		Ouvrage o2 = new Ouvrage(t2);
		list.add(o2);
		Ouvrage o3 = new Ouvrage(t3);
		list.add(o3);
		Ouvrage o4 = new Ouvrage(t4);
		list.add(o4);
		Ouvrage o5 = new Ouvrage(t5);
		list.add(o5);
		Ouvrage o6 = new Ouvrage(t6);
		list.add(o6);
		Ouvrage o7 = new Ouvrage(t7);
		list.add(o7);
		Ouvrage q = new Ouvrage();
		int g=0;

		for(int j=0; j<list.size(); j++)
			{
				System.out.println(j+" La liste est: "+list.get(j).toString());//Affiche la liste
			}
		
		//Recherche de l'ouvrage titre dans la liste
		for(int k=0; k<list.size(); k++)
			{
				if (titre==list.get(k).toString()){
					r=true;
					q=(Ouvrage)list.get(k);
					g=k;
				}
			}
		
		//Le code exécute mal cette partie probablement à cause des appels dans la liste, nous n'avons pas réussi à trouver
		//Modification de l'etat disponible de l'ouvrage
		if (list.get(g).etat.Emprunt() == true) {
				list.get(g).etat.changerDateEmprunt(); //S'il est disponible on l'emprunte donc il ne l'est plus
			}
			else {
				System.out.println("Saisir la date de réservation");
				q.etat.dateRes(); //Sinon on le réserve
			}
		//Si l'ouvrage n'est pas dans la liste, on l'achète et l'ajoute à la liste
		if (r=false) {
			Ouvrage nouv = new Ouvrage(titre);
			list.add(nouv);
		}
		
		
	
}
}
