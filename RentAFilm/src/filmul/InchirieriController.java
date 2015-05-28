package filmul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class InchirieriController {
	
	private static InchirieriController inchircontr= null;
	
	public static InchirieriController getInstance(){
		if(inchircontr == null){
			inchircontr = new InchirieriController();
		}
		return inchircontr;
	}
	public FilmController filme_disponibile;
	public  ArrayList<Inchiriere> inchirieri = new ArrayList<Inchiriere>();
	
	public InchirieriController() {
		filme_disponibile = new FilmController();
		
	}

	public void AdaugaInchiriere(int zile_inchiriere){

		Inchiriere inch = new Inchiriere();
		Client client = new Client();
		

		if (!inchirieri.isEmpty())
			inch.id_inchiriere=inchirieri.size()+1;
		filme_disponibile.CitireFilmFisier();
		filme_disponibile.AfisareFilme();
		//filme_disponibile.CitireFilmFisier();
		System.out.println("Va rugam alegeti numele filmului  din lista afisata. Cand ati terminat de introdus numele filmelor, scriei # pentru a marca incheierea");
		BufferedReader br = null;
		String line;
		try {

			br = new BufferedReader(new InputStreamReader(System.in));
			while ((line = br.readLine()) != null) {
				//System.out.println(line);
				if(line!="#" && filme_disponibile.CautaFilm(line)!=null)
				{
					Film filmul = filme_disponibile.CautaFilm(line);
					inch.filmeInchiriate.add(filmul);
					//inch.id_inchiriere++;
				}
				else
					break;
				
			}

		}catch(IOException e){
			e.printStackTrace();	
		}
		
		System.out.println("Va rugam introduceti data la care s-a facut inchirierea ");
		BufferedReader br1 = null;
		String line1;
		try {

			br1 = new BufferedReader(new InputStreamReader(System.in));
			while ((line1 = br1.readLine()) != null) {
				inch.data_inchiriere = line1;
				inch.CalculDataReturnare(zile_inchiriere);
				break;
			}
			
			System.out.println("Filmele trebuie returnate pe data: "+ inch.data_returnare);
			
		}catch(IOException e){
			e.printStackTrace();	
		}
		
		System.out.println("Introduceti numele clientului:  ");
		
		
		BufferedReader br2 = null;
		String line2;
		try {

			br2 = new BufferedReader(new InputStreamReader(System.in));
			while ((line2 = br2.readLine()) != null) {
				
				client.nume = line2;
				break;
			}
		}catch(IOException e){
				e.printStackTrace();	
			}
			
			System.out.println("Clientul are card de fidelitate? Introdu 1 daca DA si 0 daca NU ");
			BufferedReader br3 = null;
			String line3;
			try {

				br3 = new BufferedReader(new InputStreamReader(System.in));
				while ((line3 = br3.readLine()) != null) {
					
					if(line3.equalsIgnoreCase("1"))
					{
						client.card_fidelitate=true;
						break;
					}else{
						client.card_fidelitate=false;	
						break;
					}
					
					}
			
		}catch(IOException e){
			e.printStackTrace();	
		}
		inchirieri.add(inch);
		
	}
}
