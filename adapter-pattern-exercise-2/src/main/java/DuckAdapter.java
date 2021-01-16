import java.util.Random;

public class DuckAdapter implements Drone {
	Duck duck;
	Random rand;

	@Override
	public void beep() {
		duck.quack();
	}

	@Override
	public void spin_rotors() {

	}

	@Override
	public void takeOff() {
		duck.fly();
	}
}
