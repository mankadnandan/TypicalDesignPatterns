import java.awt.Graphics;

public class Triangle extends Shape {

  ColourShape colourShape;

  public Triangle(ColourShape colourShape) {
    this.colourShape = colourShape;
  }

  public void draw(Graphics graphics) {
    int[] x = {200, 250, 150};
    int[] y = {15, 65, 65};
    int n = 3;
    colourShape.setColour(graphics);
    graphics.fillPolygon(x, y, n);
  }

}
