package com.skilldistillery.foodtruck.app;

import java.util.Iterator;
import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {

	// declare array of food trucks to use
	private FoodTruck[] fleet = new FoodTruck[5];

	public static void main(String[] args) {

		FoodTruckApp fta = new FoodTruckApp();
		fta.run();
	}

	public void run() {
		// call method to get user input to make trucks
		makingTrucks();
		// call menu to get user input to display information
		menu();

	}

	public void makingTrucks() {
		Scanner kb = new Scanner(System.in);
		
		String namingTrucks;
		String foodType;
		int rating;

		for (int i = 0; i < fleet.length; i++) {

			System.out.print("Please enter a Truck or Quit: ");
			namingTrucks = kb.nextLine();

			if (namingTrucks.equals("Quit")) {
				break;
			}

			System.out.print("What food type does this food truck make: ");
			foodType = kb.nextLine();

			System.out.print("What rating would you give this food truck: ");
			rating = kb.nextInt();

			kb.nextLine();

			FoodTruck ft = new FoodTruck(namingTrucks, foodType, rating);

			fleet[i] = ft;
			

		}

	}

	public void menu() {

		int input = 0;
		while (input != 4) {
			Scanner kb = new Scanner(System.in);

			System.out.println("-----------MENU-----------");
			System.out.println("-1:List food trucks-------");
			System.out.println("-2: Average Rating--------");
			System.out.println("-3: Winner Chicken dinner-");
			System.out.println("-4: Quit -----------------");

			System.out.println("Please, enter a number option: ");
			input = kb.nextInt();
			
			kb.nextLine();

			if (input == 1) {
				for( FoodTruck truck : fleet ) {
					if (truck != null) {
						System.out.println(truck);
					}
				}
				
			} else if (input == 2) {
				//calculate average or set to method to calculate average
				//set variables outside for and nested if statements to not be re-written.
				int sum = 0;
				int numOfTrucks = 0;
				
				//forEach loop to calculate average.
				for (FoodTruck truck : fleet) {
					
					if(truck != null) {
						// calculating sum of ratings and increment number of trucks.
						sum += truck.getRating();
						numOfTrucks++;
					}
				}
				//print out average.
				System.out.println((double)sum / numOfTrucks);

			} else if (input == 3) {
				//print highest rated food truck 
				FoodTruck highestRTruck = new FoodTruck();
				
				for (FoodTruck truck : fleet) {
					if(truck != null) {
						if(truck.getRating() >= highestRTruck.getRating()) {
							highestRTruck = truck;
						}
					}
				}
				System.out.println(highestRTruck);

			} else if (input == 4) {
				System.out.println("Ta Ta For Now.");
				
			} else {
				System.out.println("Wrong! Bad Llama, enter valid input.");
			}
		}
	}
}
