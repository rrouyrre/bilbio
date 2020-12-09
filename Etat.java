public class Etat extends Date{
	
	//Attributs
	public int disponible;
	private Date dateEmprunt;
	private Date dateConsultation;
	private Date dateReservation;
		
	//Accesseurs
	public int getDisponible(){
		return disponible;
	}
	
	public Date getdateE(){
		return dateEmprunt;
	}

	public Date getdateC(){
		return dateConsultation;
	}

	public Date getdateR(){
		return dateReservation;
	}
	
	public Date setDateE(Date d){
		dateEmprunt=d;
		return d;
	}
	
	public Date setDateC(Date d){
		dateEmprunt=d;
		return d;
	}
	
	public Date setDateR(Date d){
		dateEmprunt=d;
		return d;
	}

	//Constructeurs
	public Etat(int x) {
		this.disponible = x;
		this.dateEmprunt=new Date();
		this.dateConsultation=new Date();
		this.dateReservation=new Date();
	}

	public Etat(int x, Date d1, Date d2, Date d3){
		this.disponible = x;
		this.dateEmprunt=d1;
		this.dateConsultation=d2;
		this.dateReservation=d3;
	}
	
	//Méthodes
	public String toString() {
		return "Dispo ? dE, dC, dR: "+getDisponible()+" "+getdateE()+"  "+getdateC()+"  "+getdateR();
	}
	
	public Etat setEtat(Etat e, int x, Date d1, Date d2, Date d3){
		e.disponible = x;
		e.dateEmprunt = d1;
		e.dateConsultation = d2;
		e.dateReservation = d3;
		return e;
	}
	
	public boolean Emprunt() {
		if (disponible==1) return true;
		else return false;
	}
	
	
	public Date changerDateEmprunt() {
		Date d = dateAuj();
		
		dateEmprunt.jour=d.jour;
		dateEmprunt.mois=d.mois + 1;
		dateEmprunt.annee=d.annee;
		return dateEmprunt;
	}
	
			
}
