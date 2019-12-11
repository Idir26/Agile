package userStory;

import static org.junit.Assert.assertEquals;

import blueJ.Medecin;
import blueJ.Personne;
import cucumber.api.java.en.*;

public class strategieGuerisonSteps {
	
	private Personne patient1;
	private Personne patient2;
	private Medecin medecin1;
	
	
	@Given("l {int} de la personne inferieur a cinquante ans")
	public void l_de_la_personne_inferieur_a_cinquante_ans(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		patient1 = new Personne ("toto", "titi", int1);
	    medecin1 = new Medecin("Messali", "Nassim" , 22);
	    
	    patient1.ajoutMedecinTraitant(medecin1);
	}

	@Given("l {int} de la personne superieur ou egal a cinquante ans")
	public void l_de_la_personne_superieur_ou_egal_a_cinquante_ans(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		patient2 = new Personne ("momo", "mimi", int1);
	    medecin1 = new Medecin("Messali", "Nassim" , 22);
	    
	    patient2.ajoutMedecinTraitant(medecin1);
	}

	@When("elles tombent malade avec des {int} a enlever")
	public void elles_tombent_malade_avec_des_a_enlever(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    patient1.tomberMalade(int1);
	    patient2.tomberMalade(int1);
	}

	@Then("je les gueris en ajoutant quarante aux {int} de la personne jeune et vingt aux {int} de la personne vieille")
	public void je_les_gueris_en_ajoutant_quarante_aux_de_la_personne_jeune_et_vingt_aux_de_la_personne_vieille(Integer int1, Integer int2) {
	    // Write code here that turns the phrase above into concrete actions
	    medecin1.guerir(patient1, patient1.getStrategie());
	    medecin1.guerir(patient2, patient2.getStrategie());
	    
	    assertEquals(patient1.getPointDeVie(), int1,0.1);
	    assertEquals(patient2.getPointDeVie(), int2,0.1);
	}

	
	
}
