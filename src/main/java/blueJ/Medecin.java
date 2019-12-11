package blueJ;

import java.util.ArrayList;

/**
 * Write a description of class Medecin here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Medecin  extends Personne  implements Observer, Container
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
	
	public void guerirAllPatients(){
    	for(Iterator iter = this.getIterator(); iter.hasNext();){
	         Personne p = (Personne) iter.next();
	         this.guerir(p, p.getStrategie()); //remet les points de vie a 100 (guerir)
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
    }
    
    public ArrayList<Personne> getPatients() {
		return patients;
	}

}
