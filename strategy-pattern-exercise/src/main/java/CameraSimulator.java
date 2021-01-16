/**
 * Created by Nandan Mankad on 16-01-21.
 */
public class CameraSimulator {
    public static void main(String[] args) {
        PhoneCameraApp basicCameraApp = new BasicCameraApp();
        basicCameraApp.take();
        basicCameraApp.save();
        basicCameraApp.edit();
        basicCameraApp.share();

        System.out.println();

        PhoneCameraApp cameraPlusApp = new CameraPlusApp();
        cameraPlusApp.take();
        cameraPlusApp.save();
        cameraPlusApp.edit();
        cameraPlusApp.share();
        cameraPlusApp.setShareStrategy(new SocialMedia());
        cameraPlusApp.share();
    }
}