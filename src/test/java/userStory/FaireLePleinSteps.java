package userStory;

import cucumber.api.java.en.*;

import static org.junit.Assert.assertEquals;


import blueJ.Personne;
import blueJ.Voiture;


public class FaireLePleinSteps {
	private Voiture voiture;
	private Personne conducteur;
	private float res;
	@Given("{int} de carburant")
	public void de_carburant(Integer int1) {
		this.voiture = new Voiture(int1);
		this.conducteur = new Personne(this.voiture, "toto", "titi");
	  
	}

	@When("le conducteur fait le plein")
	public void le_conducteur_fait_le_plein() {
	   this.res = this.conducteur.faireLePlein();
	}
	

	@Then("la {int} de carburant est automatique calcule")
	public void la_de_carburant_est_automatique_calcule(Integer int1) {
		assertEquals(this.res, int1,0.1);
	}
	
	@Then("la {int} de carburant est automatique calcule avec quantite initiale est egale a zero")
	public void la_de_carburant_est_automatique_calcule_avec_quantite_initiale_est_egale_a_zero(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(this.res, int1,0.1);
	}



}
