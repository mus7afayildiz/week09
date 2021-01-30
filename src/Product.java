import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/*-- Product
    + productName, productPrice, createDate, stockVolume bilgilerini tutacaktir.*/

public class Product {
    private String productName;
    private LocalDate createDate=null;
    private int productPrice;
    private int stockVolume;
    List<Product> productList = new ArrayList<Product>()
    {String productName; int productPrice; int stockVolume; LocalDate createDate;};



    public LocalDate getCreateDate() {
        createDate = LocalDate.now();
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public int getStockVolume() {
        return stockVolume;
    }

    public void setStockVolume(int stockVolume) {
        this.stockVolume = stockVolume;
    }

      Product (String productName,int productPrice, int stockVolume,LocalDate createDate ){

    this.productName=productName;
    this.productPrice=productPrice;
    this.stockVolume=stockVolume;
    this.createDate=createDate;


     }

    Product(){

    }
}
