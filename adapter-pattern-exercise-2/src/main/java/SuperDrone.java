/**
 * Created by Nandan Mankad on 17-01-21.
 */
public class SuperDrone implements Drone {
    @Override
    public void beep() {
        System.out.println("Beep beep beep");
    }

    @Override
    public void spin_rotors() {
        System.out.println("Rotors are spinning");
    }

    @Override
    public void takeOff() {
        System.out.println("Taking off");
    }
}
