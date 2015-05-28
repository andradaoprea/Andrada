package filmul;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Inchiriere {

	public int id_inchiriere;
	public ArrayList<Film> filmeInchiriate;
	public String data_inchiriere;
	public String data_returnare;
	public String data_returnare_reala;
	public Client cl;
	public double pret_final;
	SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
	
	public Inchiriere() {
		filmeInchiriate = new ArrayList<Film>();
		
	}
	
	public int getId_inchiriere() {
		return id_inchiriere;
	}

	public void setCliente(Client c) {
		this.cl = c;
	}
	
	public void setId_inchiriere(int id_inchiriere) {
		this.id_inchiriere = id_inchiriere;
	}


	public ArrayList<Film> getFilmeInchiriate() {
		return filmeInchiriate;
	}


	public void setFilmeInchiriate(ArrayList<Film> filmeInchiriate) {
		this.filmeInchiriate = filmeInchiriate;
	}


	public String getData_inchiriere() {
		return data_inchiriere;
	}


	public void setData_inchiriere(String data_inchiriere) {
		this.data_inchiriere = data_inchiriere;
	}


	public String getData_returnare() {
		return data_returnare;
	}


	public void setData_returnare(String data_returnare) {
		this.data_returnare = data_returnare;
	}


	public String getData_returnare_reala() {
		return data_returnare_reala;
	}


	public void setData_returnare_reala(String data_returnare_reala) {
		this.data_returnare_reala = data_returnare_reala;
	}


	public double getPret_final() {
		return pret_final;
	}


	public void setPret_final(double pret_final) {
		this.pret_final = pret_final;
	}


	public void CalculDataReturnare(int zile){
		Date dd=null;
		Date ddd=null;
		try{
			dd = format.parse(this.data_inchiriere);
			long d = dd.getTime() + zile*(24*60*60*1000);
			ddd = new Date(d);
			this.data_returnare = ddd.toString();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public double CalculPenalizare(double pret_penalizare){
		double penalizare=0;
		
		
		Date d1=null;
		Date d2=null;
		
		
		try {
			d2=format.parse(this.data_returnare);
			d1=format.parse(this.data_returnare_reala);
		
		long zile_intarziere1 = d1.getTime()-d2.getTime();
		long intarziere = zile_intarziere1/(24*60*60*1000);
			
		
		
		if(intarziere>0)
			penalizare=pret_penalizare*intarziere;
		}
		catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return penalizare;
	}
	
	public double AplicareFidelitate(double procent,double pret){
		if(this.cl.card_fidelitate)
			pret = pret - (procent*pret)/100;
		return pret;
	}
	
	public void CalculPretFinal(double pret_penalizare,double procent_fidelitate){
		
		double pret_initial = 0;
		for(Film f : filmeInchiriate)
		{
			pret_initial+=f.pret;
		}
		
		double pret_fidelitate = AplicareFidelitate(procent_fidelitate,pret_initial);
		double penalizare = CalculPenalizare(pret_penalizare);
		
		this.pret_final = pret_initial - (pret_fidelitate + penalizare);
		
	}
	
}
