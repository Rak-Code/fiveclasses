public class Order {
    public String orderId;
    public Customer customer;
    public Products product;
    public int quantity;

   
    public Order(String orderId, Customer customer, Products product, int quantity) {
        this.orderId = orderId;
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
    }

    
    public double calculateTotal() {
        return product.price * quantity;
    }

    
    public void displayOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: ₹" + calculateTotal());
    }
}
