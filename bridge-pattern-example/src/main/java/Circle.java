import java.awt.Graphics;

public class Circle extends Shape {

    ColourShape colourShape;

    public Circle(ColourShape colourShape) {
        this.colourShape = colourShape;
    }

    public void draw(Graphics graphics) {
        colourShape.setColour(graphics);
        graphics.fillOval(75, 15, 50, 50);
    }
}
