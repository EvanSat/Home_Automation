import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ JUnitInsideLights.class, JUnitOutsideLights.class,
			   JUnitShades.class, JUnitWindows.class, JUnitCmd.class})
public class AllTests {
	
}
