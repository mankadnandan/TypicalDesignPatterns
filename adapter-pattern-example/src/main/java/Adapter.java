package main.java;

import org.example.UKCarPriceCalculator;

/**
 * Created by Nandan Mankad on 14-01-21.
 */
public class Adapter implements PriceCalculator {

    UKCarPriceCalculator ukCarPriceCalculator;

    public Adapter(UKCarPriceCalculator ukCarPriceCalculator) {
        this.ukCarPriceCalculator = ukCarPriceCalculator;
    }

    @Override
    public String calculatePrice() {
        return ukCarPriceCalculator.getPrice() + "GBP";
    }
}
