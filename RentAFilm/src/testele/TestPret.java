package testele;

import static org.junit.Assert.*;

import org.junit.Test;

import filmul.Client;
import filmul.Inchiriere;

public class TestPret {

	@Test
	public void testPret() {
		Inchiriere i = new Inchiriere();
		Client cl = new Client("Ion",true);
		i.setCliente(cl);
		double rezultat=i.AplicareFidelitate(0.1, 12);
		assertTrue(rezultat == 11.988);
	}

}
