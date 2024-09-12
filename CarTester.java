import java.util.Scanner;

public class CarTester{
    
    public static Car addCar(){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter the car's name:");
        String addCarName = scan.nextLine();
        
        System.out.println("Please enter cars miles:");
        double addCarMiles = scan.nextDouble();
        
        System.out.println("Please enter cars gallons:");
        double addCarGallons = scan.nextDouble();
        
        Car car = new Car(addCarName, addCarMiles, addCarGallons);
        return car;
        
    }
    
    public static void main(String[] args){

    System.out.println(addCar());
    System.out.println("----- NEXT CAR -----");
    System.out.println(addCar());

        
    }
}

/*
    -   Output:
    
Please enter the car's name:
Honda Civic
Please enter cars miles:
234
Please enter cars gallons:
100
Honda Civic averaged 2.3 m/g
----- NEXT CAR -----
Please enter the car's name:
Toad Mobile
Please enter cars miles:
13
Please enter cars gallons:
7
Toad Mobile averaged 1.9 m/g
 */
