import creator.LogisticsCreator;
import creator.RoadLogistics;
import creator.SeaLogistics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This is Factory design pattern main");
        System.out.println("Would you like to deliver via \n1. sea\n2. road");
        int choice = scanner.nextInt();
        switch (choice) {


            case 1:

                LogisticsCreator sea = new SeaLogistics();
                sea.planDelivery();
                break;
            case 2:
                LogisticsCreator road = new RoadLogistics();
                road.planDelivery();
                break;
        }
        System.out.println("Thank you for using our logistic service");

    }
}
/*
factory dp: is used to delegate object creation to a specific class -Factory- and its factory method.
it's used to encapsulate unnecessary details into single function that will return an interface-object.
consists of: creator-factory- and product(s) interface.
each creator must implement their own logic based on a Product object.

 */