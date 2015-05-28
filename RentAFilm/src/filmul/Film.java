package filmul;


public class Film {

	public String denumire;
	public int an_aparitie;
	public String limba;
	public double pret;
	public String getDenumire() {
		return denumire;
	}
	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}
	public int getAn_aparitie() {
		return an_aparitie;
	}
	public void setAn_aparitie(int an_aparitie) {
		this.an_aparitie = an_aparitie;
	}
	public String getLimba() {
		return limba;
	}
	public void setLimba(String limba) {
		this.limba = limba;
	}
	public double getPret() {
		return pret;
	}
	public void setPret(double pret) {
		this.pret = pret;
	}
	public Film(String denumire, int an_aparitie, String limba, double pret) {
		super();
		this.denumire = denumire;
		this.an_aparitie = an_aparitie;
		this.limba = limba;
		this.pret = pret;
	}
	public Film(){
		this.denumire="";
		this.an_aparitie = 0;
		this.limba = "";
		this.pret = 0;
	}
	
}
