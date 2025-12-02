public class Product {
    private String name;
    private  double price;
    private int quantity;


    void setPrice(double price){
        if(price<0){
            System.out.println("Цена не может быть отрицательной");
        }
        else{
            this.price=price;
        }
    }
String getName(){
return name;
 }
    double getPrice(){
        return price;
    }
    int getQuantity(){
        return quantity;
    }
    Product(String name, double price, int quantity){
        this.name=name;
       setPrice(price);
        this.quantity=quantity;
    }
    public double totalCost(){
        return price*quantity;
    }
    void print(){
        System.out.println(name);
        System.out.println(price);
        System.out.println(quantity);
        System.out.println(totalCost());
    }

}
