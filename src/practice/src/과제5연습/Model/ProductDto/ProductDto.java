package 과제5연습.Model.ProductDto;

public class ProductDto {
    private String title;
    private String ProductName;
    private int price;

    private ProductDto() { }
    public ProductDto(String title, String ProductName, int price) {
        this.title = title;
        this.ProductName = ProductName;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProductDto{" +
                "title='" + title + '\'' +
                ", ProductName='" + ProductName + '\'' +
                ", price=" + price +
                '}';
    }
}
