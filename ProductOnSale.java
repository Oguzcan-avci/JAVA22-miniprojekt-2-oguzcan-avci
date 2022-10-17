 class ProductOnSale extends Product{
     double discount;

     public double getDiscount() {
         return discount;
     }

     public void setDiscount(double discount) {
         this.discount = discount;
     }

     ProductOnSale(String name, int amountInStock, double price, double discount) {
         super(name, amountInStock, price);
         this.discount = discount;
     }

     public double newPrice(double price, double discount){
         double newPrice = price*discount;
         return newPrice;
     }

 }
