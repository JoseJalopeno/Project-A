package dev.soer.main;

import java.util.Scanner;

public class Converter {
	public static void main(String[] args) {
		
		int menuSelection = 0;
		while(menuSelection != 4) {
			Scanner sc = new Scanner(System.in);
			menu();
			if(sc.hasNextInt()) {
				menuSelection = sc.nextInt();
				switch(menuSelection) {
					case 1: {
						System.out.println("Enter number of cups: ");
						double cups = sc.nextDouble();
						double teaspoons = cupsToTeaspoons(cups);
						System.out.println(cups + " cup(s) is " + teaspoons + " teaspoons");
						System.out.println();
						break;
					}
					case 2: {
						System.out.println("Enter number of miles: ");
						double miles = sc.nextDouble();
						double kilometers = milesToKilometers(miles);
						System.out.println(miles+ " mile(s) is " + kilometers + " kilometers");
						System.out.println();
						break;
					}
					case 3: {
						System.out.println("Enter number of gallons(US)s: ");
						double usGallons = sc.nextDouble();
						double imperialGallons = usGallonsToImperial(usGallons);
						System.out.println(usGallons + " US gallon(s) is " + imperialGallons + " imperiald gallons");
						System.out.println();
						break;
					}
					case 4: {
						System.out.println("Thank you for using this conversion program!");
						sc.close();
						break;
					}
				}
			}
			else {
				System.out.println("Please enter a correct number from the menu...");
			}
		}
		
	}
	public static void menu() {
		System.out.println("Please select an option:");
		System.out.println("1. Cups to Teaspoons");
		System.out.println("2. Miles to Kilometers");
		System.out.println("3. US Gallons to Imperial Gallons");
		System.out.println("4. Quit");
	}
	
	public static double cupsToTeaspoons(double cups) {
		return cups * 48;
	}
	
	public static double milesToKilometers(double miles) {
		return miles * 1.60934;
	}
	
	public static double usGallonsToImperial(double usGallons) {
		return usGallons * .832674;
	}
}
