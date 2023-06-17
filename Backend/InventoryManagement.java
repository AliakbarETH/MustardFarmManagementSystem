package Backend;
import java.util.HashMap;
import java.util.Map;

public class InventoryManagement {
    /*
     Features we need:
     1) Maintain an inventory of resources
     2) Track the quantity of each item
     3) Alert when stock levels are low
    */

    // Declare variables
    private Map<String, Integer> inventory;

    // Constructor
    public InventoryManagement() {
        inventory = new HashMap<>();
    }

    // Add item to inventory
    public void addItem(String item, int quantity) {
        inventory.put(item, quantity);
    }

    // Remove item from inventory
    public void removeItem(String item) {
        inventory.remove(item);
    }

    // Update quantity of an item
    public void updateQuantity(String item, int quantity) {
        if (inventory.containsKey(item)) {
            inventory.put(item, quantity);
        } else {
            System.out.println("Item does not exist in the inventory.");
        }
    }

    // Get quantity of an item
    public int getQuantity(String item) {
        if (inventory.containsKey(item)) {
            return inventory.get(item);
        } else {
            System.out.println("Item does not exist in the inventory.");
            return 0;
        }
    }

    // Check if stock levels are low for an item
    public void checkStockLevel(String item, int threshold) {
        if (inventory.containsKey(item)) {
            int quantity = inventory.get(item);
            if (quantity <= threshold) {
                System.out.println("Stock level for " + item + " is low. Current quantity: " + quantity);
            }
        } else {
            System.out.println("Item does not exist in the inventory.");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create an instance of InventoryManagement
        InventoryManagement inventoryManagement = new InventoryManagement();

        // Add items to inventory
        inventoryManagement.addItem("Seeds", 50);
        inventoryManagement.addItem("Fertilizers", 100);
        inventoryManagement.addItem("Pesticides", 25);
        inventoryManagement.addItem("Machinery", 5);

        // Check stock level for an item
        inventoryManagement.checkStockLevel("Seeds", 20);

        // Update quantity of an item
        inventoryManagement.updateQuantity("Fertilizers", 75);

        // Remove an item from inventory
        inventoryManagement.removeItem("Machinery");

        // Get quantity of an item
        int quantity = inventoryManagement.getQuantity("Pesticides");
        System.out.println("Quantity of Pesticides: " + quantity);
    }
}

