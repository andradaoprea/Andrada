package testele;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class TestEmptyF {

	
		@Test
		public void test1() {
			TestEmptyFile teste = new TestEmptyFile();
			File f = new File("temp.txt");
			assertFalse(teste.fileEmpty(f));
		}

		@Test
		public void test2() {
			TestEmptyFile teste = new TestEmptyFile();
			File f = null;
			assertFalse(teste.fileEmpty(f));
		}
		
	}

