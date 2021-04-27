import java.io.Serializable;

public class Product implements Serializable {
    String productCode;
    String productName;
    String manufacture;
    double price;
    String description;

    public Product(String productCode, String productName, String manufacture, double price, String description) {
        this.productCode = productCode;
        this.productName = productName;
        this.manufacture = manufacture;
        this.price = price;
        this.description = description;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productCode='" + productCode + '\'' +
                ", productName='" + productName + '\'' +
                ", manufacture='" + manufacture + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
