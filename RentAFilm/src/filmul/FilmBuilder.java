package filmul;

public class FilmBuilder {

	private Film f;
	
	public FilmBuilder adaugaDenumire(String denumire) {
		f.setDenumire(denumire);
		return this;
	}
	public FilmBuilder adaugaan_aparitie(int an_aparitie) {
		f.setAn_aparitie(an_aparitie);
		return this;
	}
	public FilmBuilder adaugaPret(double pret) {
		f.setPret(pret);
		return this;
	}
	public FilmBuilder adaugaLimba(String limba) {
		f.setLimba(limba);
		return this;
	}
	public FilmBuilder(){
		f = new Film();
	}
	public Film build(){
		return f;
	}
	
}
