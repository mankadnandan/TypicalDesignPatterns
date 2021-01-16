/**
 * Created by Nandan Mankad on 16-01-21.
 */
public class BasicCameraApp extends PhoneCameraApp {

    public BasicCameraApp() {
        super(new Text());
    }

    @Override
    public void edit() {
        System.out.println("Opening a simple editor!!");
    }
}
