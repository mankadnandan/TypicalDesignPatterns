import java.util.ArrayList;

/**
 * Created by Nandan Mankad on 15-01-21.
 */
public class PizzaWithExtraCheese implements Pizza {
    Pizza decoratedPizza;

    public PizzaWithExtraCheese(Pizza decoratedPizza) {
        this.decoratedPizza = decoratedPizza;
    }

    public ArrayList getToppings() {
        decoratedPizza.getToppings().add("extra cheese");
        return decoratedPizza.getToppings();
    }

    public String getName() {
        return decoratedPizza.getName();
    }
}
