package test.Store;

public class Product {
    private String code;
    private String name;
    private double price;
    

    public Product(String c, String n, double p){
        setCode(c);
        setName(n);
        setPrice(p);
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

}
