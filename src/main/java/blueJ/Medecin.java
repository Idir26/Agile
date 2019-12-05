package blueJ;

import java.util.ArrayList;

/**
 * Write a description of class Medecin here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Medecin extends Personne
{
    // instance variables - replace the example below with your own
    private String nom;
    private String prenom;
    private ArrayList<Personne> patients;

    /**
     * Constructor for objects of class Medecin
     */
    public Medecin(String nom, String prenom)
    {
        // initialise instance variables
    	super(nom,prenom);
        patients = new ArrayList<Personne>();
    }

    public int guerir(Personne patient, int pointDeVie){
        if(patient.getPointDeVie() + pointDeVie <= 100){
            patient.setPointDeVie(patient.getPointDeVie() + pointDeVie);
        }
        if(patient.getPointDeVie() == 100){
            patient.setMalade(false);
        }
        return patient.getPointDeVie();
    }
    
    public void ajoutPatient(Personne p){
    	this.patients.add(p);
    }
}
