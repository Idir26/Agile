package blueJ;

public class Personne {
	
	    public Voiture voiture; 
	    private String nom;
	    private String prenom;
	    private int pointDeVie = 100;
	    private boolean malade = false;
	    private Medecin medecinTraitant;
	    
	    /**
	     * Constructeur d'objets de classe Personne
	     */
	    public Personne(Voiture voiture, String nom, String prenom)
	    {
	        // initialisation des variables d'instance
	    	this.nom = nom;
	        this.prenom = prenom;
	        this.voiture = voiture;
	        voiture.setConducteur(this);
	    }
	    
	    public Personne(String nom, String prenom)
	    {
	        // initialisation des variables d'instance
	    	this.nom = nom;
	        this.prenom = prenom;
	    }

	    public float faireLePlein()
	    {
	        // Insérez votre code ici
	        float qtCarbDepart = this.voiture.getQtCarburantRestant();
	        float qtCarbAjoute = 0;
	        while(this.voiture.ajouterCarb(1)){
	            qtCarbAjoute = updateCarb(qtCarbDepart, qtCarbAjoute);
	            
	        }
	        
	        return qtCarbAjoute;
	        
	    }

		private float updateCarb(float qtCarbDepart, float qtCarbAjoute) {
			qtCarbAjoute = qtCarbAjoute+1;
			this.voiture.setQtCarburantRestant(qtCarbDepart+ qtCarbAjoute);
			return qtCarbAjoute;
		}
	    
	    
	    public void changementCarteGrise(Personne acheteur) {
	    	acheteur.voiture.setConducteur(null);
	    	this.voiture.setConducteur(acheteur);
	    	acheteur.setVoiture(this.voiture);
	    	this.setVoiture(null);
	    }

		public Voiture getVoiture() {
			return voiture;
		}

		public void setVoiture(Voiture voiture) {
			this.voiture = voiture;
		}
		
		public int getPointDeVie(){
	        return this.pointDeVie;
	    }
	    
	    public void setPointDeVie(int p){
	        this.pointDeVie = p;
	    }
	    
	    public Medecin getMedecinTraitant(){
	    	return this.medecinTraitant;
	    }
	    
	    public void setMalade(boolean b){
	        this.malade = b;
	    }
	    
	    public int tomberMalade(int pointDeMaladie){
	    	if(this.pointDeVie - pointDeMaladie > 0){
	    		this.pointDeVie = this.pointDeVie - pointDeMaladie;
	    	}else{
	    		this.pointDeVie = 0;
	    	}
	        this.malade = true;
	        return this.pointDeVie;
	    }
	    
	    public boolean ajoutMedecinTraitant(Medecin m){
	    	if(medecinTraitant == null){
	    		this.medecinTraitant = m;
	    		m.ajoutPatient(this);
	    		return true;
	    	}
	    	return false;
	    }
}
