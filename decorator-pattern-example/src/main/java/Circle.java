import java.awt.Graphics;

public class Circle implements Component {

  private int x;
  private int y;

  public Circle(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public void draw(Graphics graphics) {
    graphics.drawOval(x, y, 50, 50 );
  }

}
