package testele;

import static org.junit.Assert.*;

import org.junit.Test;

import filmul.Inchiriere;

public class TestDataReturnare {

	@Test
	public void DataReturn() {
		Inchiriere inc = new Inchiriere();
		inc.setData_inchiriere("06/10/2015");
		inc.CalculDataReturnare(10);
		assertTrue(inc.getData_returnare().equalsIgnoreCase("06/20/2015"));
	}

}
