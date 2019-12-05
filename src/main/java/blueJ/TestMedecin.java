package blueJ;


import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MedecinTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestMedecin
{
    private Personne patient1;
    private Medecin medecin1;

    /**
     * Default constructor for test class MedecinTest
     */
    public TestMedecin()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        patient1 = new Personne("Harb", "Cedric");
        medecin1 = new Medecin("Messali", "Nassim");
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testGuerir()
    {
        assertEquals(90, patient1.tomberMalade(10));
        assertEquals(100, medecin1.guerir(patient1, 10));
    }
}

