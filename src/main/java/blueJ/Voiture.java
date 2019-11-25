package blueJ;

/**
 * Décrivez votre classe Voiture ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Voiture
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private float capacite;
    private float qtCarburantRestant;
    private Conducteur conducteur;
   
   
   
    

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
    
    public void setConducteur(Conducteur conducteur) {
		this.conducteur = conducteur;
	}

	public Conducteur getConducteur(){
        return this.conducteur;
    }
    
    public void setCapacite(Conducteur conducteur){
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

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public boolean ajouterCarb(int quantite)
    {
        // Insérez votre code ici
        return (this.qtCarburantRestant+quantite<= this.capacite && 
               quantite >= 0);
    }
}
