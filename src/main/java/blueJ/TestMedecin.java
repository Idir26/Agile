package blueJ;


import static org.junit.Assert.*;

import java.util.ArrayList;

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
    private Personne patientUn;
    private Personne patientDeux;
    private Personne patientTrois;
    private Medecin medecinUn;

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
    	patientUn = new Personne("Harb", "Cedric",22);
    	patientDeux = new Personne("Houmel", "Idir",80);
    	patientTrois = new Personne("Simonian", "Charly",22);
    	medecinUn = new Medecin("Messali", "Nassim" , 22);
        
        patientUn.ajoutMedecinTraitant(medecinUn);
        patientDeux.ajoutMedecinTraitant(medecinUn);
        patientTrois.ajoutMedecinTraitant(medecinUn);
        
       
       
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
        assertEquals(90, patientUn.tomberMalade(10));
        assertEquals(100, medecinUn.guerir(patientUn, patientUn.getStrategie()));
    }
    
    @Test
    public void testGetPatients()
    {
    	ArrayList<Personne> patients1 = new ArrayList<Personne>();
    	patients1.add(patientUn);
    	medecinUn.ajoutPatient(patientUn);
        assertEquals(patients1, medecinUn.getPatients());
    }
   
    @Test
    public void testAjoutPatient(){
    	
    	medecinUn.ajoutPatient(patientTrois);
        assertEquals(true, medecinUn.getPatients().contains(patientTrois));
    }
    
   

   
}


