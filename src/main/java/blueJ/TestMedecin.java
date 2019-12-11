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
        
        medecinUn.ajoutPatient(patientUn);
        medecinUn.ajoutPatient(patientDeux);
        medecinUn.ajoutPatient(patientTrois);
       
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
    public void testGuerirAllPatients(){
	   patientUn.tomberMalade(20); //80 points de vie restants
	   int n2 =  patientDeux.tomberMalade(50); //60 points de vie restants
	   int n3 = patientTrois.tomberMalade(10); //90 points de vie restants
    	
	   	//devrait remettre tous les points de vie a 100
	    medecinUn.guerirAllPatients();
    	
    	assertEquals(100, patientUn.getPointDeVie());
    	assertEquals(70, patientDeux.getPointDeVie());
    	assertEquals(100, patientTrois.getPointDeVie());
    	
    	
   
    	
    }
   

   
}


