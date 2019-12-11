package blueJ;

public class Voiture
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private float capacite;
    private float qtCarburantRestant;
    private Personne conducteur;
   
    /**
     * Constructeur d'objets de classe Voiture
     */
    public Voiture(float qtCarburantRestant)
    {
        // initialisation des variables d'instance
        this.capacite = 100;
        this.qtCarburantRestant =  (qtCarburantRestant >=0 && qtCarburantRestant <= this.capacite) ?  qtCarburantRestant : 0;
        this.conducteur = null;
        
    }
    
    public void setConducteur(Personne conducteur) {
		this.conducteur = conducteur;
	}

	public Personne getConducteur(){
        return this.conducteur;
    }
    
    public void setCapacite(Personne conducteur){
         this.conducteur = conducteur;
    }
    
    public float getCapacite(){
        return this.capacite;
    }
    
    public void setCapacite(float capacite){
         this.capacite = capacite;
    }
    
    public float getQtCarburantRestant(){
        return this.qtCarburantRestant;
    }
    
    public void setQtCarburantRestant(float qtCarburantRestant){
        this.qtCarburantRestant = qtCarburantRestant;
    }

    
    public boolean ajouterCarb(int quantite)
    {
        return (this.qtCarburantRestant+quantite<= this.capacite && quantite >= 0);
    }
    
    public void accident(int pVie, Medecin m ) {
        int n = this.conducteur.getPointDeVie()-pVie ;
        this.conducteur.setPointDeVie(n);
        this.conducteur.setMalade(true);
        m.ajoutPatient(this.conducteur);
        this.conducteur.ajoutMedecinTraitant(m);
        }

}
