 class Product {
    private String name;

    private int amountInStock;
    private double price;


    Product (String name, int amountInStock, double price){
        this.setName(name);
        this.setAmountInStock(amountInStock);
        this.setPrice(price);
    }
    public String getName(){
        return name;
    }
    public int getAmountInStock(){
        return amountInStock;
    }

    public double getPrice(){
        return price;
    }

    public void setName(String name){
        this.name = name;
    }

     public void setAmountInStock(int amountInStock) {
         this.amountInStock = amountInStock;
     }

     public void setPrice(double price) {
         this.price = price;
     }


 }
