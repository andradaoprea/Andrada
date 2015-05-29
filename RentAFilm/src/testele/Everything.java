package testele;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CalculPretFinal.class, TestCautaFilm.class, TestCheck.class,
		TestClientCheck.class, TestDataReturnare.class, TestEmptyF.class,
		TestPenalizare.class, TestPret.class, TestSet.class, TestVechiNou.class })
public class Everything {

}
