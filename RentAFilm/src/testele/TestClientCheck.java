package testele;

import static org.junit.Assert.*;

import org.junit.Test;

import filmul.Client;

public class TestClientCheck {

	@Test
	public void testNume() {
	        Client c = new Client();
	        c.setClient("Gigi");
	        assertTrue(c.getClient() == "Gigi");
	    }
	
	@Test
	public void testCard() 
	{
    Client ci = new Client();
    ci.setCard_fidelitate(true);
    assertTrue(ci.isCard_fidelitate()== true);
	}

}
