package testele;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.Test;

import filmul.Client;
import filmul.Film;
import filmul.Inchiriere;

public class TestDataReturnare {

	@Test
	public void DataReturn() {
		Inchiriere inc = new Inchiriere();
		inc.setData_inchiriere("06/10/2015");
		//assertTrue(inc.getData_inchiriere().equalsIgnoreCase("06/10/2015"));
		inc.CalculDataReturnare(10);
		//inc.getData_inchiriere();
		System.out.println(inc.getData_returnare());
		assertTrue(inc.getData_returnare().equalsIgnoreCase("06/20/2015"));
	}
}
