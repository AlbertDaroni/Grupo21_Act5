package grupo21_act;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({grupo21_act.DivisionTest.class, grupo21_act.ParameterTest.class, grupo21_act.CalculadoraTest.class})
public class MiSweetSuite {
    @BeforeClass
    public static void setUpClass() throws Exception {}

    @AfterClass
    public static void tearDownClass() throws Exception {}

    @Before
    public void setUp() throws Exception {}

    @After
    public void tearDown() throws Exception {}
}