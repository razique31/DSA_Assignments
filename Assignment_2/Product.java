

public class Product {
    int prodId;
    double price, quantity;
    static double totalPrice;
    Product(int prodId, double price, double quantity){
        this.prodId = prodId;
        this.price = price;
        this.quantity = quantity;
        totalPrice += price * quantity;
    }
    void display(){
        System.out.println("ProdId = "+prodId);
        System.out.printf("Price = %s$%n",price);
        System.out.println("Quantity = "+quantity);
    }
    static void displayTotalAmount(){
        System.out.printf("Total Amount to be paid: %s$",totalPrice);
    }
    public static void main(String[] args){
        Product product1 = new Product(1, 10.5, 2);
        System.out.println("Product 1 Details:");
        product1.display();

        Product product2 = new Product(2, 15.75, 3);
        System.out.println("\nProduct 2 Details:");
        product2.display();

        Product product3 = new Product(3, 5.25, 1);
        System.out.println("\nProduct 3 Details:");
        product3.display();

        Product product4 = new Product(4, 8.0, 4);
        System.out.println("\nProduct 4 Details:");
        product4.display();

        Product product5 = new Product(5, 12.5, 2);
        System.out.println("\nProduct 5 Details:");
        product5.display();
        Product.displayTotalAmount();
    }
}
