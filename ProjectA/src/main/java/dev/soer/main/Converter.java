package dev.soer.main;

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int menuSelection = 0;
		while(menuSelection != 4) {
			menu();
			menuSelection = sc.nextInt(); 
			switch(menuSelection) {
				case 1: {
					System.out.println("Enter number of cups: ");
					int cups = sc.nextInt();
					int teaspoons = cupsToTeaspoons(cups);
					System.out.println(cups + " cup(s) is " + teaspoons + " teaspoons");
					break;
				}
				case 2: {
					System.out.println("Enter number of miles: ");
					int miles = sc.nextInt();
					double kilometers = milesToKilometers(miles);
					System.out.println(miles+ " mile(s) is " + kilometers + " kilometers");
					break;
				}
				case 3: {
					System.out.println("Enter number of gallons(US)s: ");
					int usGallons = sc.nextInt();
					double imperialGallons = usGallonsToImperial(usGallons);
					System.out.println(usGallons + " US gallon(s) is " + imperialGallons + " imperiald gallons");
					break;
				}
				case 4: {
					break;
				}
				default: {
					System.out.println("Please enter a correct number from the menu...");
				}
			}	
		}
		sc.close();
	}
	public static void menu() {
		System.out.println("Please select an option:");
		System.out.println("1. Cups to Teaspoons");
		System.out.println("2. Miles to Kilometers");
		System.out.println("3. US Gallons to Imperial Gallons");
		System.out.println("4. Quit");
	}
	
	public static int cupsToTeaspoons(int cups) {
		return cups * 48;
	}
	
	public static double milesToKilometers(int miles) {
		return miles * 1.60934;
	}
	
	public static double usGallonsToImperial(int usGallons) {
		return usGallons * .832674;
	}
}
