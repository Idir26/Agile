package blueJ;


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Classe-test TestVoiture.
 *
 * @author  (votre nom)
 * @version (un numéro de version ou une date)
 *
 * Les classes-test sont documentées ici :
 * http://junit.sourceforge.net/javadoc/junit/framework/TestCase.html
 * et sont basées sur le document Š 2002 Robert A. Ballance intitulé
 * "JUnit: Unit Testing Framework".
 *
 * Les objets Test (et TestSuite) sont associés aux classes à tester
 * par la simple relation yyyTest (e.g. qu'un Test de la classe Name.java
 * se nommera NameTest.java); les deux se retrouvent dans le męme paquetage.
 * Les "engagements" (anglais : "fixture") forment un ensemble de conditions
 * qui sont vraies pour chaque méthode Test à exécuter.  Il peut y avoir
 * plus d'une méthode Test dans une classe Test; leur ensemble forme un
 * objet TestSuite.
 * BlueJ découvrira automatiquement (par introspection) les méthodes
 * Test de votre classe Test et générera la TestSuite conséquente.
 * Chaque appel d'une méthode Test sera précédé d'un appel de setUp(),
 * qui réalise les engagements, et suivi d'un appel à tearDown(), qui les
 * détruit.
 */
public class TestVoiture
{
    // Définissez ici les variables d'instance nécessaires à vos engagements;
    // Vous pouvez également les saisir automatiquement du présentoir
    // à l'aide du menu contextuel "Présentoir --> Engagements".
    // Notez cependant que ce dernier ne peut saisir les objets primitifs
    // du présentoir (les objets sans constructeur, comme int, float, etc.).

    private Voiture ferrari;
    private Voiture lambo;
    private Medecin medecin1;
    private Personne charly;

    /**
     * Constructeur de la classe-test TestVoiture
     */
    public TestVoiture()
    {
    }

    /**
     * Met en place les engagements.
     *
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @Before
    public void setUp() // throws java.lang.Exception
    {
        // Initialisez ici vos engagements
        medecin1 = new Medecin("Messali", "Nassim",22);
        ferrari = new Voiture(20);
        lambo = new Voiture(30);
        charly = new Personne(ferrari, "charly", "simonian",23);
    }

    /**
     * Supprime les engagements
     *
     * Méthode appelée après chaque appel de méthode de test.
     */
    @After
    public void tearDown() // throws java.lang.Exception
    {
        //Libérez ici les ressources engagées par setUp()
    }
    
    
    @Test 
    public void testGetConducteur() {
    	assertEquals(charly, ferrari.getConducteur());
    	assertEquals(null, lambo.getConducteur());
    }
    
    @Test 
    public void testGetCapacite() {
    	assertEquals(100, ferrari.getCapacite(),0.1);
    	assertEquals(100, lambo.getCapacite(),0.1);
    }
    
    @Test 
    public void testGetQtCarburantRestant() {
    	assertEquals(20, ferrari.getQtCarburantRestant(),0.1);
    	assertEquals(30, lambo.getQtCarburantRestant(),0.1);
    }

    
    @Test 
    public void testSetConducteur() {
    	assertEquals(charly, ferrari.getConducteur());
    	ferrari.setConducteur(medecin1);
    	assertEquals(medecin1, ferrari.getConducteur());
    	
    }
    
    @Test 
    public void testSetQtCarburantRestant() {
    	assertEquals(30, lambo.getQtCarburantRestant(),0.1);
    	lambo.setQtCarburantRestant(25);
    	assertEquals(25, lambo.getQtCarburantRestant(),0.1);
    	
    }

    @Test
    public void testAjoutCarb()
    {
        
        Voiture myCar = new Voiture(60);
        assertEquals(null, myCar.getConducteur());
    }
    
    @Test
    public void testAccident()
    {
    
        ferrari.accident(30, medecin1);
        assertEquals(70,ferrari.getConducteur().getPointDeVie() );
        assertEquals(true,ferrari.getConducteur().getMalade() );
        assertEquals(true, medecin1.getPatients().contains(charly) );
        assertEquals(medecin1, charly.getMedecinTraitant());

        
    }

}

