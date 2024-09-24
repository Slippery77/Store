package test.Store;

public class Product {
    private String name;
    private int volumn;
    private double price;
    private int weight;
   
    public Product(String n,double p){
        setName(n);
        setPrice(p);
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
}
    public void setVolumn(int v){
        this.volumn = v;
    }
    public int getVolumn() {
       return this.volumn;
    }
}
