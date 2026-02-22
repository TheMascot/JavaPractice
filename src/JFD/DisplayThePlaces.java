package JFD;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DisplayThePlaces {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner disc = new Scanner(new File("src/JFD/Places.txt"));
        Scanner keyboard = new Scanner(System.in);
        int userInputCost;
        for (int place = 1; place <= 3; place++) {
            PlaceToLive currentPlace = displayAPlace(disc);
            System.out.println("How much is the cost of living here?");
            userInputCost = keyboard.nextInt();
            displayTheCostOfLiving(userInputCost, currentPlace);
        }
        disc.close();
        keyboard.close();
    }

    public static PlaceToLive displayAPlace(Scanner scanner){
        PlaceToLive aPlace = new PlaceToLive();
        aPlace.setAddress(scanner.nextLine());
        aPlace.setNumberOfBedrooms(scanner.nextInt());
        aPlace.setTotalArea(scanner.nextInt());
        aPlace.displayPlace();
        if(scanner.hasNextLine()){
        scanner.nextLine();
        }
        return aPlace;
    }
    public static void displayTheCostOfLiving(int cost, PlaceToLive place){
        System.out.print("Cost based on bedrooms: ");
        System.out.printf("%.2f",(double) cost / place.getNumberOfBedrooms());
        System.out.println("$ per bedroom");
        System.out.print("Cost based on area: ");
        System.out.printf("%.2f", (double) cost / place.getTotalArea());
        System.out.println("$ per square meter");
        System.out.println();
        }
    }




