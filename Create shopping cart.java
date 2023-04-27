import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> cart;

    private class Item {
        public String name;
        public double price;
        public int count;

        public Item(String name, double price, int count) {
            this.name = name;
            this.price = price;
            this.count = count;
        }
    }

    public ShoppingCart() {
        cart = new ArrayList<Item>();
    }

    public void addItemToCart(String name, double price, int count) {
        for (Item item : cart) {
            if (item.name.equals(name)) {
                item.count += count;
                return;
            }
        }
        Item item = new Item(name, price, count);
        cart.add(item);
    }

    public void setCountForItem(String name, int count) {
        for (Item item : cart) {
            if (item.name.equals(name)) {
                item.count = count;
                return;
            }
        }
    }

    public void removeItemFromCart(String name) {
        for (Item item : cart) {
            if (item.name.equals(name)) {
                item.count--;
                if (item.count == 0) {
                    cart.remove(item);
                }
                return;
            }
        }
    }

    public void removeItemFromCartAll(String name) {
        cart.removeIf(item -> item.name.equals(name));
    }

    public void clearCart() {
        cart.clear();
    }

    public int totalCount() {
        int totalCount = 0;
        for (Item item : cart) {
            totalCount += item.count;
        }
        return totalCount;
    }

    public double totalCart() {
        double totalCart = 0;
        for (Item item : cart) {
            totalCart += item.price * item.count;
        }
        return totalCart;
    }

    public List<Item> listCart() {
        List<Item> cartCopy = new ArrayList<Item>();
        for (Item item : cart) {
            Item itemCopy = new Item(item.name, item.price, item.count);
            itemCopy.total = item.price * item.count;
            cartCopy.add(itemCopy);
        }
        return cartCopy;
    }
}
