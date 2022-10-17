import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(0, 0);
        Product product1 = new Product("Milk", 10, 20);
        Product product2 = new Product("Chocolate", 15, 15);
        ProductOnSale product3 = new ProductOnSale("Soda", 20, 15, 0.2);

        Scanner scanner = new Scanner(System.in);
        boolean shopping = true;
        int itemsShopped = 0;
        double totalPrice = 0;

        while (shopping){
            System.out.println("1. Buy " + product1.getName() + ", " + product1.getPrice() +
                    " SEK" + ", left:" + product1.getAmountInStock());

            System.out.println("2. Buy " + product2.getName() + ", " + product2.getPrice() +
                    " SEK" + ", left:" + product2.getAmountInStock());

            System.out.println("3. Buy " + product3.getName() + ", " + product3.getPrice() +
                    " SEK" + ", left:" + product3.getAmountInStock());

            System.out.println("4. Quit");

            System.out.println("Choose your option");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("You have chosen " + product1.getName() + " there are " +
                            (product1.getAmountInStock()-1) + " left");

                    product1.setAmountInStock(product1.getAmountInStock()-1);
                    itemsShopped++;
                    totalPrice += product1.getPrice();

                    break;

                case 2:
                    System.out.println("You have chosen " + product2.getName() + " there are " +
                            (product2.getAmountInStock() -1) + " left");

                    product2.setAmountInStock(product2.getAmountInStock()-1);
                    itemsShopped++;
                    totalPrice += product2.getPrice();
                    break;
                case 3:
                   product3.setPrice(product3.newPrice(15, 0.2));
                    System.out.println("You have chosen " + product3.getName() + " there are " +
                            (product3.getAmountInStock()-1) + " left");


                    product3.setAmountInStock(product3.getAmountInStock()-1);
                    itemsShopped++;
                    totalPrice += product3.getPrice();
                    break;

                case 4:
                    if (choice == 4){
                        shopping = false;
                        break;
                    }

            }
            System.out.println();
            System.out.println();
        }
        customer.setItemsPurchased(itemsShopped);
        customer.setSumOfItems(totalPrice);
        System.out.println("You have bought " + customer.getItemsPurchased() + " products.");
        System.out.println("Your total cost is " +customer.getSumOfItems() + " SEK.");

        //System.out.println("You have bought " + itemsShopped + " products");
        //System.out.println("Your total price is " + totalPrice + " SEK");
        //System.out.println();




    }



}







