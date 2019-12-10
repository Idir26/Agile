package blueJ;

@SuppressWarnings("hiding")
public interface Observable<Personne> {
    public void addObserver(Medecin observer);
    public void notifyObservers();
}