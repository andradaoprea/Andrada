package filmul;



import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FilmController {
	
	
	
	public  ArrayList<Film> filme = new ArrayList<Film>();
	 
	 
	 public void AdaugaFilm(String denumire, int an_aparitie, String limba, double pret){
		 
		 Film film = new FilmBuilder().adaugaDenumire(denumire).adaugaan_aparitie(an_aparitie).adaugaLimba(limba).adaugaPret(pret).build();
		 
		 this.filme.add(film);
	 }
	 
	 
	public void CitireFilmFisier(){
		
		String[] cuvinte = new String[100];
		// The name of the file to open.
        String fileName = "temp.txt";

        // This will reference one line at a time
        String line = null;
       
        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);
            
            while((line = bufferedReader.readLine()) != null) { 
            	cuvinte = line.split(";"); 
            	 AdaugaFilm(cuvinte[0],Integer.valueOf(cuvinte[1]),cuvinte[2],Double.valueOf(cuvinte[3]));  
            }

            
           
            bufferedReader.close();            
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                   
            // Or we could just do this: 
            // ex.printStackTrace();
        }
	}

	public  void AfisareFilme(){
		System.out.println("Filmele pe stoc sunt urmatoarele:  ");
		for(Film f : filme) {
			System.out.println(f.denumire);
		}
		
	}
	public Film CautaFilm(String den){
		
		for(Film f : filme) 
			if(f.denumire.equalsIgnoreCase(den))
				return f;
		return null;
		}	

	
	public ArrayList<Film> getFilme() {
		return this.filme;
	}
}
