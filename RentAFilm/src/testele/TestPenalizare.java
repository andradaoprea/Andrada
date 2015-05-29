package testele;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import filmul.Client;
import filmul.Film;
import filmul.Inchiriere;

public class TestPenalizare {

	@Test
	public void test() {
		ArrayList<Film> fi = new ArrayList<Film>();
		Film f1 = new Film("Anna",2010,"Franceza",15);
		Film f2 = new Film("Up in the air!",2008,"Engleza",20);
		fi.add(f1);
		fi.add(f2);
		Client cl = new Client("Ionel", true);
		Inchiriere inc = new Inchiriere(1,fi,"06/05/2015","06/15/2015","06/20/2015",cl,35);
		double penalizare = inc.CalculPenalizare(10);
		assertTrue(penalizare==50);
	}

}
