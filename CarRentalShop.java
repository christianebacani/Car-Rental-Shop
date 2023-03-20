import java.util.Scanner;
public class CarRentalShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String car[] = {"BMW","Chevrolet","Bentley","Alfa Romeo","Cadillac"};
        int price[] = {100000,110000,120000,130000,140000,150000};
        int number[] = {5,6,7,8,9,10};
        
        System.out.print("Welcome to Bacani`s Car Rental Shop!\n");
        
        System.out.print("Username : ");
        String username = input.nextLine();
        
        System.out.print("Password : ");
        String password = input.nextLine();
        
        System.out.print("1.) Rent a car\n2.) Return a car\n3.) Exit\n");
        System.out.print("Enter your choice : ");
        String userChoose = input.nextLine();
        
        if(userChoose.equals("1")){
        
        int num = 1;
        System.out.print("CAR / PRICE / QUANTITY\n");
        for(int i = 0 ; i < car.length ; i++){
            System.out.print(num + ") " + car[i] + " / P " + price[i] + " per day / " + number[i] + "\n");
            num++;
        }
        
        System.out.print("Enter your choice : ");
        int choice = input.nextInt();
        
        System.out.print("You`ve chose : " + car[choice - 1] + " / P " + price[choice - 1] + " per day" + "\n");
        
        System.out.print("Enter how many day/s you want to rent the car : ");
        int days = input.nextInt();
        
        int total = price[choice - 1] * days;
        
        System.out.print("\nThe total is : " + total);
        
        System.out.print("\nPlease enter your payment : ");
        int payment = input.nextInt();
        
        int change = payment - total;
        
        System.out.print("Change : " + change);
        
        System.out.print("\nTHANK YOU FOR RENTING!\n");
        
        }
        
        else if(userChoose.equals("2")){
            System.out.print("Enter the car number you want to return : ");
            int carNum = input.nextInt();
            
            System.out.print(car[carNum - 1] + " is successfully returned!\n");
            
            System.out.print("THANK YOU FOR RENTING!\n");
            
        }
        
        else if(userChoose.equals("3")){
            System.out.print("THANK YOU FOR VISITING OUR APP!\n");
        }
        
        else{
            System.out.print("INVALID CHOICE!");
        }
        
       
    }
}
