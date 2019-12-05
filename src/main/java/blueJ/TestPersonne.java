package blueJ;


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Classe-test TestConducteur.
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
public class TestPersonne
{
    private Voiture clio;
    private Voiture ferrari;
    private Personne idir;
    private Personne charly;
    private Personne patient1;
    private Personne patient2;
    private Medecin medecin1;

    // Définissez ici les variables d'instance nécessaires à vos engagements;
    // Vous pouvez également les saisir automatiquement du présentoir
    // à l'aide du menu contextuel "Présentoir --> Engagements".
    // Notez cependant que ce dernier ne peut saisir les objets primitifs
    // du présentoir (les objets sans constructeur, comme int, float, etc.).
    
    

    /**
     * Constructeur de la classe-test TestConducteur
     */
    public TestPersonne()
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
        clio = new Voiture(55);
        idir = new Personne(clio, "idir", "houmel");
        
        ferrari = new Voiture(20);
        charly = new Personne(ferrari, "charly", "simonian");
        
        patient2 = new Personne("c", "c");
        patient1 = new Personne("Harb", "Cedric");
        medecin1 = new Medecin("Messali", "Nassim");
        
   

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
    public void proprietaireTest()
    {
    	assertEquals(idir,clio.getConducteur());
    	assertEquals(charly,ferrari.getConducteur());
    	assertEquals(idir.getVoiture(),clio);
    	assertEquals(charly.getVoiture(),ferrari);
    	
    	charly.changementCarteGrise(idir);
    	
    	assertEquals(null,clio.getConducteur());
    	assertEquals(idir,ferrari.getConducteur());
    	assertEquals(idir.getVoiture(),ferrari);
    	assertEquals(charly.getVoiture(),null);
    }

    @Test
    public void faireLePleinTest()
    {
    	assertEquals(45, idir.faireLePlein(), 0.1);
    }
    
    @Test
    public void testTomberMalade()
    {
       
        assertEquals(90, patient2.tomberMalade(10));
    }
    
    @Test
    public void testAjoutMedecinTraitant(){
    	
        
        patient1.ajoutMedecinTraitant(medecin1);
        assertEquals(medecin1, patient1.getMedecinTraitant());
    }
    
    /**/
}

