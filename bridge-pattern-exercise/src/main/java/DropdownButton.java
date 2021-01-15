public class DropdownButton extends Button {

  ButtonSize buttonSize;

  public DropdownButton(ButtonSize buttonSize) {
    this.buttonSize = buttonSize;
  }

  public void draw() {
    buttonSize.setSize();
    System.out.println("Drawing a dropdown button.\n");
  }

}
