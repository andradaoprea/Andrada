package testele;

import static org.junit.Assert.*;

import org.junit.Test;

import filmul.Inchiriere;

public class TestCheck {


	@Test
	public void testDen() {
	        Inchiriere inchi = new Inchiriere();
	        inchi.setId_inchiriere(10);
	        assertTrue(inchi.getId_inchiriere() == 10);
	    }
	
	@Test
	public void testPret() 
	{
    Inchiriere inch = new Inchiriere();
    inch.setPret_final(54);
    assertTrue(inch.getPret_final() == 54);
	}
	

}
