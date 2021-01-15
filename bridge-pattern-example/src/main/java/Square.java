import java.awt.Graphics;

public class Square extends Shape {

  ColourShape colourShape;

  public Square(ColourShape colourShape) {
    this.colourShape = colourShape;
  }

  public void draw(Graphics graphics) {
    colourShape.setColour(graphics);
    graphics.fillRect(5, 15, 50, 50);
  }

}
