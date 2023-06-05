package SpendingApplication;

import java.util.Scanner;
/*
    Spending Application to help examine the spending
    patterns of a user.
    Date: 02/06/2023
 */
public class SpendingApplication {
    public static void main(String[] args){
        double food, clothing, entertainment, rent, totalExpense;
        Scanner input = new Scanner(System.in);

//      User must input a number given by the instruction
        System.out.println("Enter the amount spent last month on the following Items");
        System.out.print("Food: ");
        food = input.nextDouble();
        System.out.print("Clothing: ");
        clothing = input.nextDouble();
        System.out.print("Entertainment: ");
        entertainment = input.nextDouble();
        System.out.print("Rent: ");
        rent = input.nextDouble();
        input.close();

//      Total Expense:
        totalExpense = food + clothing + entertainment + rent;

//      Calculate the percentage:
        food = (food /= totalExpense) * 100;
        clothing = (clothing /= totalExpense) * 100;
        entertainment = (entertainment /= totalExpense) * 100;
        rent = (rent /= totalExpense) * 100;

//      Table
        System.out.println(" ");
        System.out.format("%-15s %8s", "Category", "Budget\n");
        System.out.format("%-15s %8s", "Food", food + " %\n");
        System.out.format("%-15s %8s", "Clothing", clothing + " %\n");
        System.out.format("%-15s %8s", "Entertainment", entertainment + " %\n");
        System.out.format("%-15s %8s", "Rent", rent + " %\n");
    }
}
