/**
 * Created by Nandan Mankad on 16-01-21.
 */
public class CameraPlusApp extends PhoneCameraApp {

    public CameraPlusApp() {
        super(new Email());
    }

    @Override
    public void edit() {
        System.out.println("Opening Plus Editor!!");
    }
}
