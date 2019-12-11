package userStory;

import static org.junit.Assert.assertEquals;

import blueJ.*;
import cucumber.api.java.en.*;

public class notifierGuerisonSteps {
	
	private Personne patient1;
	private Medecin medecin1;
	
	@Given("l {int} de la personne")
	public void l_de_la_personne(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    patient1 = new Personne ("toto", "titi", int1);
	    medecin1 = new Medecin("Messali", "Nassim" , 22);
	    
	    patient1.ajoutMedecinTraitant(medecin1);
	}

	@When("elle tombe malade avec des {int} a enlever")
	public void elle_tombe_malade_avec_des_a_enlever(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    patient1.tomberMalade(int1);
	}

	@When("je la gueris")
	public void je_la_gueris() {
	    // Write code here that turns the phrase above into concrete actions
	    medecin1.guerir(patient1, patient1.getStrategie());
	}

	@Then("je suis notifie de sa guerison et elle ne se trouve plus dans ma liste de patient")
	public void je_suis_notifie_de_sa_guerison_et_elle_ne_se_trouve_plus_dans_ma_liste_de_patient() {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(false, medecin1.getPatients().contains(patient1));
	}


	

}
