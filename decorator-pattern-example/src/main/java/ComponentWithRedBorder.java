import java.awt.*;

/**
 * Created by Nandan Mankad on 15-01-21.
 */
public class ComponentWithRedBorder implements Component {
    Component decoratedComponent;

    public ComponentWithRedBorder(Component decoratedComponent) {
        this.decoratedComponent = decoratedComponent;
    }

    public void draw(Graphics graphics) {
        graphics.setColor(Color.RED);
        this.decoratedComponent.draw(graphics);
        graphics.setColor(Color.BLACK);
    }
}
