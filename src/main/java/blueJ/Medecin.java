package blueJ;

import java.util.ArrayList;

/**
 * Write a description of class Medecin here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Medecin  extends Personne  implements Observer<Medecin>, Container
{
    // instance variables - replace the example below with your own
   
    protected ArrayList<Personne> patients;

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
        
        return patient.getPointDeVie();
    }
    
    public void ajoutPatient(Personne p){
    	this.patients.add(p);
    }

	public void update(Personne personne) {
		patients.remove(personne);
		
	}
	
	public void getAllPatients(){
    	for(Iterator iter = this.getIterator(); iter.hasNext();){
	         Personne p = (Personne) iter.next();
	         this.guerir(p, 100-p.getPointDeVie()); //remet les points de vie a 100 (guerir)
	     } 
    }
    
    public Iterator getIterator() {
       return new NameIterator();
    }

    private class NameIterator implements Iterator {

       int index;

       public boolean hasNext() {
       
          if(index < patients.size()){
             return true;
          }
          return false;
       }

       
       public Object next() {
       
          if(this.hasNext()){
             return patients.get(index++);
          }
          return null;
       }		
    }}
