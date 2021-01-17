/**
 * Created by Nandan Mankad on 17-01-21.
 */
public class SimpleObserver implements Observer {

    Subject subject;

    SimpleObserver(Subject subject) {
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    public void update(int val) {
        System.out.println("Value updated to " + val);
    }
}
