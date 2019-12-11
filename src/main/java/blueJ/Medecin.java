package blueJ;

import java.util.ArrayList;

/**
 * Write a description of class Medecin here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Medecin  extends Personne  implements Observer
{
    // instance variables - replace the example below with your own
   
    private ArrayList<Personne> patients = new ArrayList<Personne>();
    

	/**
     * Constructor for objects of class Medecin
     */
    public Medecin(String nom, String prenom, int age)
    {
        // initialise instance variables
    	super(nom,prenom,age);
        
    }

    public int guerir(Personne patient, GuerirStrategy g ){
        if(patient.getPointDeVie() + g.PointDeVieAAjouter()<= 100){
            patient.setPointDeVie(patient.getPointDeVie() + g.PointDeVieAAjouter());
        }else {patient.setPointDeVie(100) ;}
      
        return patient.getPointDeVie();
    }
    
    public void ajoutPatient(Personne p){
    	this.patients.add(p);
    }

	public void update(Personne personne) {
		patients.remove(personne);
		
	}
	
    public ArrayList<Personne> getPatients() {
		return patients;
	}

}
