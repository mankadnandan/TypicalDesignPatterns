/**
 * Created by Nandan Mankad on 16-01-21.
 */
public class Email implements ShareStrategy {
    @Override
    public void share() {
        System.out.println("Sharing via Email!");
    }
}
