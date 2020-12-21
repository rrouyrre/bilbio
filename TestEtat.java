public class TestEtat {
	public static void main(String [] args){
	
	int j=12,m=12,a=1998;

	//Création des objets
	Date d1 = new Date(j,m,a);
	Date d2 = new Date();
	Date d3 = new Date();
	Date d4 = new Date();
	Etat e1 = new Etat(1);
	Etat e2 = new Etat(1, d1, d3, d4);
	
	//Affichage des attributs:
	System.out.println(d1);
	System.out.println(d2);
	
	//Test dateAuj
	d3 = d2.dateAuj();
	System.out.println(d3);
	
	//Test dateRes
	d4 = d2.dateRes();
	System.out.println(d4);
	
	//Test setEtat	
	System.out.println(e1);
	e2.setEtat(e2,1,d1, d3, d4);
	System.out.println(e2);
	
	//Test changerDateEmprunt
	e2.setDateE(e2.changerDateEmprunt());
	System.out.println(e2);	
		
	}
}
