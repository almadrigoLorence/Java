package SpendingApplication;

import java.util.Scanner;
/*
    Spending Application to help examine the spending
    patterns of a user.
    Date: 02/06/2023
 */
public class SpendingApplication {

//    Calculate the expense method
    public static void main(String[] args){
        double food, clothing, entertainment, rent;
        Scanner input = new Scanner(System.in);

//      User must input a number given by the instruction
        System.out.println("Enter the amount spent last month on the following Items");
        System.out.print("Food: ");
        // input 250 for food
        food = input.nextDouble();
        System.out.print("Clothing: ");
        // input 250 for clothing
        clothing = input.nextDouble();
        System.out.print("Entertainment: ");
        // input 250 for entertainment
        entertainment = input.nextDouble();
        System.out.print("Rent: ");
        // input 1250 for rent
        rent = input.nextDouble();
        input.close();

        System.out.print("Overall Total: "+"$"+CalculateExpense.calculateExpense(food, clothing, entertainment, rent));

        System.out.println("");
        CalculateExpense.printTable(food, clothing, entertainment, rent);

    }
}
