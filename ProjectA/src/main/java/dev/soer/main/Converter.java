package dev.soer.main;

import java.util.Scanner;

public class Converter {
	public static void main(String[] args) {
		
		int menuSelection = 0;
		while(menuSelection != 5) {
			Scanner sc = new Scanner(System.in);
			menu();
			if(sc.hasNextInt()) {
				menuSelection = sc.nextInt();
				switch(menuSelection) {
					case 1: {// Length conversions
						lengthMenu();
						int lengthMenuSel = sc.nextInt();
						switch(lengthMenuSel) {
							case 1: {// mile -> kilometer
								System.out.println("Enter number of miles: ");
								double input = sc.nextDouble();
								double result = milesToKilometers(input);
								System.out.println(input + " mile(s) is " + result + " kilometers");
								System.out.println();
								break;
							}
							case 2: {// kilometer to light year
								System.out.println("Enter number of kilometers: ");
								double input = sc.nextDouble();
								double result = kilometerToLightYear(input);
								System.out.println(input + " kilometers(s) is " + result + " light years");
								System.out.println();
								break;
							}
							case 3: {// inch to yard
								System.out.println("Enter number of inches: ");
								double input = sc.nextDouble();
								double result = inchToYard(input);
								System.out.println(input + " inches(s) is " + result + " yards");
								System.out.println();
								break;
							}
							case 4: {// exit submenu
								break;
							}
						}
						break;
					}
					case 2: {// temperature menu
						tempMenu();
						int tempMenuSel = sc.nextInt();
						switch(tempMenuSel) {
							case 1: {// fahrenheit -> celsius
								System.out.println("Degrees in fahrenheit: ");
								double input = sc.nextDouble();
								double result = fahrenheitToCelsius(input);
								System.out.println(input + " fahrenheit is " + result + " celsius");
								System.out.println();
								break;
							}
							case 2: {// fahrenheit -> kelvin
								System.out.println("Degrees in fahrenheit: ");
								double input = sc.nextDouble();
								double result = fahrenheitToKelvin(input);
								System.out.println(input + " fahrenheit is " + result + " kelvin");
								System.out.println();
								break;
							}
							case 3: {// celsius -> kelvin
								System.out.println("Degrees in celsius: ");
								double input = sc.nextDouble();
								double result = celsiusToKelvin(input);
								System.out.println(input + " celsius is " + result + " kelvin");
								System.out.println();
								break;
							}
							case 4: {
								break;
							}
						}
						break;
					}	
					case 3: {
						weightMenu();
						int weightMenuSel = sc.nextInt();
						switch(weightMenuSel) {
							case 1: {// gram -> ounce
								System.out.println("Enter number in grams: ");
								double input = sc.nextDouble();
								double result = gramToOunce(input);
								System.out.println(input + " grams is " + result + " ounces");
								System.out.println();
								break;
							}
							case 2: {// pound -> kilogram
								System.out.println("Enter number in pounds: ");
								double input = sc.nextDouble();
								double result = poundToKilogram(input);
								System.out.println(input + " pounds is " + result + " kilograms");
								System.out.println();
								break;
							}
							case 3: {// kilogram -> atomic mass unit
								System.out.println("Enter number in kilograms: ");
								double input = sc.nextDouble();
								double result = kilogramToAtomicMass(input);
								System.out.println(input + " kilograms is " + result + " atomic mass units");
								System.out.println();
								break;
							}
							case 4: {
								break;
							}
						}
						break;
					}
					case 4: {
						volumeMenu();
						int volumeMenuSel = sc.nextInt();
						switch(volumeMenuSel) {
							case 1: {// cups -> teaspoons
								System.out.println("Enter number in cups: ");
								double input = sc.nextDouble();
								double result = cupsToTeaspoon(input);
								System.out.println(input + " cups is " + result + " teaspoons");
								System.out.println();
								break;
							}
							case 2: {// liter -> gallon
								System.out.println("Enter number in liters: ");
								double input = sc.nextDouble();
								double result = literToGallon(input);
								System.out.println(input + " liters is " + result + " gallons");
								System.out.println();
								break;
							}
							case 3: {// us gallon -> imperial gallon
								System.out.println("Enter number in gallons(US): ");
								double input = sc.nextDouble();
								double result = usGallonsToImperial(input);
								System.out.println(input + " gallons(US) is " + result + " imperial gallons");
								System.out.println();
								break;
							}
							case 4: {
								break;
							}
						}
						break;
					}
					case 5: {
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
	// Menus
	public static void menu() {
		System.out.println("Please select an option:");
		System.out.println("1. Length");
		System.out.println("2. Temperature");
		System.out.println("3. Weight");
		System.out.println("4. Volume");
		System.out.println("5. Quit");
	}
	public static void lengthMenu() {
		System.out.println("1. Mile to Kilometer");
		System.out.println("2. Kilometer to Light Year");
		System.out.println("3. Inch to Yard");
		System.out.println("4. Quit");
	}
	public static void tempMenu() {
		System.out.println("1. Fahrenheit to Celsius");
		System.out.println("2. Fahrenheit to Kelvin");
		System.out.println("3. Celsius to Kelvin");
		System.out.println("4. Quit");
	}
	public static void volumeMenu() {
		System.out.println("1. Cups to Teaspoon");
		System.out.println("2. Liter to Gallon");
		System.out.println("3. Us Gallon to Imperial Gallon");
		System.out.println("4. Quit");
	}
	public static void weightMenu() {
		System.out.println("1. Gram to Ounce");
		System.out.println("2. Pound to Kilogram");
		System.out.println("3. Kilogram to Atomic Mass Unit");
		System.out.println("4. Quit");
	}
	// length methods
	public static double milesToKilometers(double x) {
		return x * 1.60934;
	}
	public static double kilometerToLightYear(double x) {
		return x / (9.46*Math.pow(10, 12));
	}
	public static double inchToYard(double x) {
		return x / 36;
	}
	
	// temperature methods
	public static double fahrenheitToCelsius(double x) {
		return ((x - 32) * (5.0/9.0));
	}
	public static double fahrenheitToKelvin(double x) {
		return ((x - 32) * (5.0/9.0)) + 273.15;
	}
	public static double celsiusToKelvin(double x) {
		return x + 273.15;
	}
	
	// volume methods
	public static double cupsToTeaspoon(double x) {
		return x * 48;
	}
	public static double literToGallon(double x) {
		return x / 3.785;
	}
	public static double usGallonsToImperial(double x) {
		return x * .832674;
	}
	
	// weight methods
	public static double gramToOunce(double x) {
		return x / 28.35;
	}
	public static double poundToKilogram(double x) {
		return x / 2.205;
	}
	public static double kilogramToAtomicMass(double x) {
		return x * (9.223*Math.pow(10, 18));
	}
	
}
