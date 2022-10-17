import java.util.Scanner;

class Customer {
    Scanner scanner = new Scanner(System.in);
    private int itemsPurchased;
    private double sumOfItems;



    Customer(int itemsPurchased, double sumOfItems){
        this.setItemsPurchased(itemsPurchased);
        this.setSumOfItems((int) sumOfItems);
    }
    public int getItemsPurchased(){
        return itemsPurchased;
    }

     public double getSumOfItems(){
         return sumOfItems;
     }

     public void setItemsPurchased(int itemsPurchased){
        this.itemsPurchased = itemsPurchased;
     }

     public void setSumOfItems(double sumOfItems) {
         this.sumOfItems = sumOfItems;
     }



 }
