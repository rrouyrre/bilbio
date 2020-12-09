import java.util.Scanner;

import java.io.*;

import java.text.DateFormat;
import java.util.Locale;


public class Date {
	
	//Attributs
	public int jour;
	public int mois;
	public int annee;

	//Accesseurs
	public int getJour(){
		return jour;
	}

	public int getMois(){
		return mois;
	}

	public int getAnnee(){
		return annee;
	}

	//Constructeurs
	public Date() {
		this.jour=0;
		this.mois=0;
		this.annee=0;
	}
	
	public Date (int a, int b, int c) {
		this.jour=a;
		this.mois=b;
		this.annee=c;
	}

	
	//Méthodes 
	public String toString() {
		return getJour()+ "/" +getMois()+"/"+getAnnee();
	}
	
	public Date dateAuj () {
		
		int jour=32;
		int mois=13;
		int annee=0;
		Scanner myObj = new Scanner(System.in); 
		 
		while((jour>31)||(jour<1)||(jour==32)){
			System.out.println("Entrer le jour d'aujourd'hui");
			jour = myObj.nextInt();
		}
		while((mois>12)||(mois<1)||(mois==13)){
			System.out.println("Entrer le mois d'aujourd'hui");
			mois = myObj.nextInt();
		}
		while(annee<2019){
			System.out.println("Entrer l'annee d'aujourd'hui");
			annee = myObj.nextInt();
		}
		return new Date(jour,mois,annee);
	}
	
	public Date dateRes () {
		
		int jour=32;
		int mois=13;
		int annee=0;
		Scanner myObj = new Scanner(System.in); 
		 
		while((jour>31)||(jour<1)||(jour==32)){
			System.out.println("Entrer le jour de reservation");
			jour = myObj.nextInt();
		}
		while((mois>12)||(mois<1)||(mois==13)){
			System.out.println("Entrer le mois de reservation");
			mois = myObj.nextInt();
		}
		while(annee<2019){
			System.out.println("Entrer l'annee de reservation");
			annee = myObj.nextInt();
		}
		return new Date(jour,mois,annee);
	}
}






