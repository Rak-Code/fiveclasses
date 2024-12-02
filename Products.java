public class Products{
    public String productId;
    public String name;
    public double price;

    
    public Products(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public static double getDiscount(double original_price, double discount_percentage) {
        double discount = original_price - (original_price * discount_percentage / 100);
        return discount;
    }

   
    public void displayProduct() {
        System.out.println("Product ID: " + productId + ", Name: " + name + ", Price: ₹" + price);
    }
}
