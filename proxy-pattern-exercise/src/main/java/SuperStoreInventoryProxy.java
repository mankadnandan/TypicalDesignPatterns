import java.util.ArrayList;

/**
 * Created by Nandan Mankad on 15-01-21.
 */
public class SuperStoreInventoryProxy implements Inventory {
    SuperstoreInventory superstoreInventory;

    @Override
    public ArrayList<Item> getInventory() {
        if (this.superstoreInventory == null) {
            this.superstoreInventory = new SuperstoreInventory();
        }
        return this.superstoreInventory.getInventory();
    }
}
