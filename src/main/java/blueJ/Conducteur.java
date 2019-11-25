package blueJ;

/**
 * Décrivez votre classe Conducteur ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Conducteur
{
    // variables d'instance - remplacez l'exemple qui suit par le votre
    
    
    public Voiture voiture; 

    /**
     * Constructeur d'objets de classe Conducteur
     */
    public Conducteur(Voiture voiture)
    {
        // initialisation des variables d'instance
        this.voiture = voiture;
        voiture.setConducteur(this);
    }

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
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
    
    
    public void changementCarteGrise(Conducteur acheteur) {
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
	
	
	
	
	
	
	
	/**/
}
