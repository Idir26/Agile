package blueJ;

import java.util.*;

public class Personne implements Observable<Personne> {
	
	    public Voiture voiture; 
	    private String nom;
	    private String prenom;
	    private int pointDeVie = 100;
	    private boolean malade = false;
	    private Medecin medecinTraitant;
	    protected List<Medecin> observers = new ArrayList<Medecin>();
	    
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
	    	this.medecinTraitant.patients.add(this);
	    	this.addObserver(this.medecinTraitant);
	        this.malade = true;
	        return this.pointDeVie;
	    }
	    
	    public void ajoutMedecinTraitant(Medecin m){
	    		
	    		this.medecinTraitant = m;
	    		

	    }
	    
	    public void setPointDeVie(int p){
	        this.pointDeVie = p;
	        
	        if(this.pointDeVie == 100){
	            this.setMalade(false);
	            this.notifyObservers();
	        }
	    }

		public void addObserver(Medecin observer) {
			observers.add(observer);
			
		}

		public void notifyObservers() {
			for (Medecin observer : observers) {
				observer.update(this);
			}
		}
			
		}

