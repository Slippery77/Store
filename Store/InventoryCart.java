package test.Store;

public class InventoryCart {
    Product[] products;
    int index = 0;

    public InventoryCart(int i){
        products = new Product[i];
    }
    public void add(Product p){
        products[index++]=p;
    }
    public Product getProductAt(int i){
        return products[i];
    }
    public Product[] getProductAll(){
        return products;
    }
    public int getAmount(String pn) {
        int amount=0;
        for(int i = 0 ; i<products.length;i++){
            if(products[i]!=null&&products[i].getName().equals(pn)){
                    amount++;
                    }
                }
        return amount;
    }
}
