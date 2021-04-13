public class Product {
    private String productCode;
    private double productPrice;
    private int productInv;

    Product(String code, double price, int count) {
        productCode = code;
        productPrice = price;
        productInv = count;
    }

    public void setCode(String code) {
        productCode = code;
    }
    public String getCode() {
        return productCode;
    }
    public void setPrice(double p) {
        productPrice = p;
    }
    public double getPrice() {
        return productPrice;
    }
    public void setCount(int num) {
        productInv = num;
    }
    public int getCount() {
        return productInv;
    }
    public void addInventory(int amt) {
        productInv += amt;
    }
    public void sellInventory(int amt) {
        productInv -= amt;
    }
}
