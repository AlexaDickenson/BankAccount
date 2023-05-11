public class Product {
    private double productCost;
    private double productQuantity;
    private String productName;

    public Product(double productCost, double productQuantity, String productName) {
        this.productCost = productCost;
        this.productQuantity = productQuantity;
        this.productName = productName;
    }
    public void totalCost(){
    double total= productCost * productQuantity;
    System.out.printIn("The total for this product is:" + total);
    }
    public void printProduct(){
    System.out.println("The cost of one" + productName + "is" + productCost+ "." + productQuantity+ "were purchased.");
    }

}
