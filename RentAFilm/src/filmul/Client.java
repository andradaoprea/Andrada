package filmul;

public class Client {

	public String nume;
	public boolean card_fidelitate;
	public String getClient() {
		return nume;
	}
	public void setClient(String nume) {
		this.nume = nume;
	}
	public boolean isCard_fidelitate() {
		return card_fidelitate;
	}
	public void setCard_fidelitate(boolean card_fidelitate) {
		this.card_fidelitate = card_fidelitate;
	}
	public Client(String nume, boolean card_fidelitate) {
		super();
		this.nume = nume;
		this.card_fidelitate = card_fidelitate;
	}
	
	public Client(){
		this.nume="";
		this.card_fidelitate=false;
	}
	
}
