package testele;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import filmul.Client;
import filmul.Film;
import filmul.Inchiriere;

public class CalculPretFinal {

	@Test
	public void test() {
		ArrayList<Film> fi = new ArrayList<Film>();
		Film f1 = new Film("Anna",2010,"Franceza",15);
		Film f2 = new Film("Up in the air!",2008,"Engleza",20);
		Film f3 = new Film("Jango",2014,"Engleza",20);
		Film f4 = new Film("Rio",2014,"Engleza",12);
		fi.add(f1);
		fi.add(f2);
		fi.add(f3);
		fi.add(f4);
		Client cl = new Client("Ionel", true);
		Inchiriere inc = new Inchiriere();
		inc.setFilmeInchiriate(fi);
		inc.setCliente(cl);
		inc.setData_inchiriere("06/10/2015");
		inc.setData_returnare_reala("06/22/2015");
		inc.CalculDataReturnare(10);
		inc.CalculPretFinal(10, 10);
		assertTrue(inc.pret_final==80.3);
	}

}
