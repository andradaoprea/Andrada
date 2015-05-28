package filmul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FilmController c = new FilmController();
		//c.CitireFilmFisier();
				//c.AfisareFilme();
				//i.AdaugaInchiriere(10);
		InchirieriController i = InchirieriController.getInstance();
		//i.filme_disponibile.CitireFilmFisier();
		
		int opt = 0;
		System.out.println("Introduceti 1 daca doriti sa adaugati o inchiriere, 2 daca doriti sa incasati o plata, 3 pentru inchidere");
		BufferedReader bb = null;
		String li;
		try {

			bb = new BufferedReader(new InputStreamReader(System.in));
			while ((li = bb.readLine()) != null)
			{
				
			while(Integer.valueOf(li)!=3){	
			opt = Integer.valueOf(li);
			switch(opt)
			{
			case 1:
			{
				i.AdaugaInchiriere(10);
				System.out.println("Urmato? Introduceti 1 pentru DA si 0 pentr NU");
				BufferedReader brr = null;
				String linee;
				try {

					brr = new BufferedReader(new InputStreamReader(System.in));
					while ((linee = brr.readLine()) != null)
					{
						if(linee.equalsIgnoreCase("1"))
						{
							i.AdaugaInchiriere(10);
							
							
						}
						if(linee.equalsIgnoreCase("0")){
							for(Inchiriere ini : i.inchirieri)
							{
								
									ini.CalculPretFinal(5, 10);
									System.out.println("Pretul de plata pentru inchirierea "+ini.id_inchiriere +" este " +ini.pret_final);
							}
						}
					}
	
			}catch(IOException e){
				e.printStackTrace();	
			}
			}
			case 2:
			{
				System.out.println("Introduceti id-ul inchirierii");
				BufferedReader b = null;
				String lin;
				try {
					b = new BufferedReader(new InputStreamReader(System.in));
					while ((lin = b.readLine()) != null)
					{
						for(Inchiriere ini : i.inchirieri)
						{
							if(Integer.valueOf(lin)==ini.id_inchiriere)
							{
								ini.CalculPretFinal(5, 10);
								System.out.println("Pretul de platapentru inchirierea "+ini.id_inchiriere +" este " +ini.pret_final);
							}
						}
					}
	
			}catch(IOException e){
				e.printStackTrace();	
			}
				
				
			}
			}
			
		}
		
			
			}
}catch(IOException e){
	e.printStackTrace();	
}
	}	
}