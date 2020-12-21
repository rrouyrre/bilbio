import java.io.*;
import java.util.LinkedList;

public class ListOuvrage extends LinkedList<Ouvrage>{
	
	//Attributs
	private LinkedList<Ouvrage> listO;
	
	//Tout le code en-dessous sont simplement des essais de la méthode rechercher que nous n'avons pas réussie à coder
	
	//Méthodes
	
//	public int rechercher(String titre){
	//	String r="false";
		//int disp=0;
	
		//for(int k=0; k<list.size(); k++)
		//{
			//if (titre==list.get(k).toString()){
				//r="true";
				//System.out.println(r);
			//}
		//}
		//if (r == ("True")){
			//disp=1;
		//}
		//return disp;
	//}	
		
		
	public static void main(String[] args){
		String t="tit";
		String t2="LesMiserables";
		LinkedList<Ouvrage> list = new LinkedList<Ouvrage>();//Crée une liste de Livres
		
		Ouvrage o = new Ouvrage(t);//Crée un livre
		list.add(o);//Ajoute le livre
		Ouvrage o2 = new Ouvrage(t2);
		list.add(o2);
		
		for(int j=0; j<list.size(); j++)
		{
			System.out.println(j+"La liste est:"+list.get(j).toString());//Affiche la liste
		}
	
		String titre="tit";
		
		int k=0;
		String r="false";
		String k1;
		
		for(k=0; k<list.size(); k++)
		{
			System.out.println(k+"La liste est:"+list.get(k).toString());
			k1=list.get(k).toString();
			if (titre==list.get(k).toString()){
				r="true";
				System.out.println(r);
			}
		}
		//if (titre==k1) r="false" ;
		if (titre!=list.get(0).toString()){
			r="false";
			System.out.println(r);
		}
		
		if (titre==list.get(0).toString()){
			r="false";
			System.out.println(r);
		}
		
		while(titre!=list.get(k).toString())// &&  (k<list.size()))
		{
			k++;
		}
		if (k==list.size()+1) r="false";
		System.out.println(r);
		}
	
}
