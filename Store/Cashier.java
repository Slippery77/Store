package test.Store;

public class Cashier {private String name;
    InventoryCart ic;
    public Cashier(String n){
        setName(n);
    }

    public void printReceipt(InventoryCart ic){
        double total=0;
        boolean []check = new boolean[ic.getProductAll().length]; // เช็ค
        
        Product p ;
        System.out.println("\tPumpkin Shop ("+name+")");
        for(int i = 0;i<ic.getProductAll().length;i++){
            p = ic.getProductAt(i);
            if(p!=null&&!check[i]){
                int count = 1; //ตั้ง count ให้เป็น 1 เมื่อจบการทำงานในการวนloopจะresetค่าเป็น1ใหม่
            for(int j = i+1;j<ic.getProductAll().length;j++){
                if(ic.getProductAt(j)!=null&&p.getName().equals(ic.getProductAt(j).getName())){
                    count = ic.getAmount(p.getName());
                    check[j]=true; // เช็คว่าถ้านับแล้วให้ check[j] ที่index นั้นเป็น true แล้วหลุดเงื่อนไขนี้
                }
            }
            if(p.getName().equals("Milk")){
                System.out.println(count+" x \t"+p.getName()+"\t"+p.getVolumn()+" cc"+"\t\t"+p.getPrice());
            }
            else
            System.out.println(count+" x \t"+p.getName()+"\t"+p.getWeight()+" gram"+"\t\t"+p.getPrice());
            total +=count*p.getPrice();
            check[i]=true; //เช็คว่าถ้านับ check[i] ที่index พิมไปแล้วจะขึ้นเป็น true และหลุด loop 
        }  
    }
        System.out.println("\t--------------------");
        System.out.printf("\tTotal\t%.0f$",total);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}
