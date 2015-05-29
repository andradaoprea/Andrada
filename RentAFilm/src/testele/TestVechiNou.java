package testele;

import static org.junit.Assert.*;

import org.junit.Test;

import filmul.Film;

public class TestVechiNou {

	@Test
	public void test() {
		Film ff = new Film();
		ff.setAn_aparitie(1990);
		assertFalse(ff.FilmVechiNou(2009));
	}

}
