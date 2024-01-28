//Programmers: Claudia and Shane
//Course: CS212, Mr. John
//Due Date: 1/28/23
//Lab Assignment: 1
//Problem Statement: This program calculates the two items you got from the grocery store.
//It output each total based on the number of units, and cost per unit. In the end, gives the user the total cost
//from the items combined.
//Data In: The name of the product, the cost per unit, the quantity of the item they bought.
//Data Out: The total of each item, and the total cost of everything.
//Credits: Class note #2 and #3.

import java.util.Scanner;

public class GroceryShopping{
    // Create a scanner object for user input
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initalize variables
        String itemName1, itemName2;
        int units1, units2;
        double costPerUnit1, costPerUnit2, TotalCost;

        // Input for the first item
        System.out.println("Welcome to Shop'n'Save'n'Enjoy!");
        System.out.println("What was the first item that you purchased?");
        itemName1 = scanner.nextLine();

        System.out.println("How many units of " + itemName1 + " did you buy?");
        units1 = scanner.nextInt();

        System.out.println("How much did " + itemName1 + " cost per unit?");
        costPerUnit1 = scanner.nextDouble();

        // Input for the second item
        System.out.println("What was the second item that you purchased?");
        scanner.nextLine();
        itemName2 = scanner.nextLine();

        System.out.println("How many units of " + itemName2 + " did you buy?");
        units2 = scanner.nextInt();

        System.out.println("How much did " + itemName2 + " cost per unit?");
        costPerUnit2 = scanner.nextDouble();

        // Calculate total cost for act item and round them to the nearest hundredths
        double TotalCost1 = Math.round(units1 * costPerUnit1 * 100.0) / 100.0;
        double TotalCost2 = Math.round(units2 * costPerUnit2 * 100.0) / 100.0;
        
        // Calculate overall total cost and round to the nearest hundrdths
        TotalCost = Math.round((TotalCost1 + TotalCost2) * 100.0) / 100.0;
        
    
        // Output recepit
        System.out.print("\nHere is your receipt:\n ");
        System.out.print("\n" +itemName1 + " " + units1 + " @ " + costPerUnit1 + ": " + TotalCost1 + "\n");
        System.out.print("\n" +itemName2 + " " + units2 + " @ " + costPerUnit2 + ": " + TotalCost2 + "\n");
        System.out.print("\nTOTAL: " + TotalCost);

        System.out.println("\nThanks for your visit. Have a great day!");
    }
}
