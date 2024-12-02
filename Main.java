public class Main{
    public static void main(String[] args) {


    Customer customer = new Customer("Raj", "raj@gmail.com", "password123");
    customer.displayCustomer();

    Products product = new Products("P1", "Smartphone", 50000.0);
    product.displayProduct();

    Order order = new Order("O001", customer, product, 2);  

    double result = Products.getDiscount(50000,15);
    System.out.println(result);

    Customer.emailVerify("xyz@gmail.com");

    order.displayOrder();
    


    }
}