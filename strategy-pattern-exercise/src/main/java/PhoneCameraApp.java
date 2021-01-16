/**
 * Created by Nandan Mankad on 16-01-21.
 */
public abstract class PhoneCameraApp {

    private ShareStrategy shareStrategy;

    public PhoneCameraApp(ShareStrategy shareStrategy) {
        this.shareStrategy = shareStrategy;
    }

    public void take() {
        System.out.println("Taking Photo!");
    }

    public abstract void edit();

    public void save() {
        System.out.println("Saving Photo!");
    }

    public void share() {
        shareStrategy.share();
    }


    public void setShareStrategy(ShareStrategy shareStrategy) {
        this.shareStrategy = shareStrategy;
    }

}
