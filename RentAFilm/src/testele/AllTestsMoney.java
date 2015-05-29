package testele;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CalculPretFinal.class, TestDataReturnare.class,
		TestPenalizare.class, TestPret.class })
public class AllTestsMoney {

}
