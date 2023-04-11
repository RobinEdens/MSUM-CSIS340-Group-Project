import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Item> items;
    
    public ShoppingCart() {
        items = new ArrayList<Item>();
    }
    
    public void addItem(Item item) {
        items.add(item);
    }
    
    public void removeItem(Item item) {
        items.remove(item);
    }
    
    public double getTotalCost() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }
    
    public void displayCart() {
        System.out.println("Items in cart:");
        for (Item item : items) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
        System.out.println("Total cost: $" + getTotalCost());
    }
}
