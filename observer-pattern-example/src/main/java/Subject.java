
/**
 * Created by Nandan Mankad on 17-01-21.
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
