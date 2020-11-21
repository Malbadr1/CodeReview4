public class Product {

    private int productId;
    private String productName;
    private String productDescription;
    private double productPrice;
    private ProductCategory productCategory;
    private static int IdIncrement = 1;
    private int stock;

    public Product(String productName, String productDescription, double productPrice, ProductCategory productCategory) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
        this.productCategory = productCategory;
        this.productId = IdIncrement++;
        this.stock = 5;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public int getStock() {

        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "productId is : " + productId +
                "| productName is : " + productName + '\'' +
                "| productDescription is : " + productDescription + '\'' +
                "| productPrice is : " + productPrice +"\'"+
                "| productCategory is : " + productCategory +"\'"+
                "| stock :" + stock ;
    }
}