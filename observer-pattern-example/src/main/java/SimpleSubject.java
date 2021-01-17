import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nandan Mankad on 17-01-21.
 */
public class SimpleSubject implements Subject {

    List<Observer> observers;

    private int value = 0;

    SimpleSubject() {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer o: observers) {
            o.update(value);
        }
    }

    public void setValue(int value) {
        this.value = value;
        notifyObservers();
    }
}
