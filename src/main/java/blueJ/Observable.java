package blueJ;

@SuppressWarnings("hiding")
public interface Observable<Personne> {
    public void addObserver(Observer<Medecin> observer);
    public void notifyObservers();
}