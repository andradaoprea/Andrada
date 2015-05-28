package testele;

import static org.junit.Assert.*;

import org.junit.Test;

import filmul.Film;

public class TestSet {

	@Test
	public void testDen() {
	        Film film = new Film();
	        film.setDenumire("Andrada");
	        assertTrue(film.getDenumire() == "Andrada");
	    }
	
	@Test
	public void testLimba() 
	{
    Film film = new Film();
    film.setLimba("Engleza");
    assertTrue(film.getLimba() == "Engleza");
	}
	@Test
	public void testPret() {
    Film film = new Film();
    film.setPret(10);
    assertTrue(film.getPret() == 10);
	}
	@Test
	public void testAnAparitie() {
    Film film = new Film("Ciuleandra",1970,"Romana",12);
    film.getLimba();
    assertTrue(film.getLimba() == "Romana");
	}
	
	
}