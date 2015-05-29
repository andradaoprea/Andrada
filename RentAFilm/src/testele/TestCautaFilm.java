package testele;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import filmul.Film;
import filmul.FilmController;

public class TestCautaFilm {

	@Test
	public void test() {
		ArrayList<Film> filme= new ArrayList<Film>();
		Film f1 = new Film("Titanic",1999,"Engleza",15);
		Film f2 = new Film("300",2002,"Engleza",12);
		Film f3 = new Film("Up!",2012,"Engleza",11);
		Film f4 = new Film("ToyStory",2006,"Engleza",10);
		filme.add(f1);
		filme.add(f2);
		filme.add(f3);
		filme.add(f4);
		FilmController fc = new FilmController();
		for(Film f : fc.filme){
			if(f.equals(fc.CautaFilm("Up!")))
			assertTrue("Exista filmul",true);
			else
				fail("Nu merge metoda!");
		}	
	}

}
