package userStory;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


import blueJ.Voiture;
import cucumber.api.java.en.*;

public class AjouterCarbSteps {
	private Voiture voiture;
	private boolean res;
	
	@Given("reservoir de {int} de carburant")
	public void reservoir_de_de_carburant(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		this.voiture = new Voiture(int1);
	
	  
	}
	
	
	
	@When("une certaine {int} de carburant est ajoutee a la voiture")
	public void une_certaine_de_carburant_est_ajoutee_a_la_voiture(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    this.res = this.voiture.ajouterCarb(int1);
	}

	@Then("on verifie que l on peut ajouter cette quantite")
	public void on_verifie_que_l_on_peut_ajouter_cette_quantite() {
	    // Write code here that turns the phrase above into concrete actions
	   assertTrue(this.res);
	}

	@Then("on verifie que l on ne peut pas ajouter cette quantite")
	public void on_verifie_que_l_on_ne_peut_pas_ajouter_cette_quantite() {
	    // Write code here that turns the phrase above into concrete actions
	    assertFalse(this.res);
	}
	

}
