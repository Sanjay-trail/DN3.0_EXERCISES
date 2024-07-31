public class Product implements Comparable<Product>{
    private int productId;
    private String productName;
    private String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductId() {
        return productId;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Override
    public int compareTo(Product o) {
        return Integer.compare(this.productId,o.productId);
    }

    @Override
    public String toString() {
        return "Product Details:" +
                "\n\tproductId=" + productId +
                "\n\tproductName='" + productName  +
                "\n\tcategory='" + category ;
    }
}
