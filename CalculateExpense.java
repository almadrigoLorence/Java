package SpendingApplication;

public class CalculateExpense {
     static double calculateExpense(double food, double clothing, double entertainment, double rent){
         return food + clothing + entertainment + rent;
    }

    static void printTable(double food, double clothing, double entertainment, double rent){
        double totalExpense = food + clothing + entertainment + rent;

        food = food / totalExpense * 100;
        clothing = clothing / totalExpense * 100;
        entertainment = entertainment / totalExpense * 100;
        rent = rent / totalExpense * 100;

        System.out.println(" ");
        System.out.format("%-15s %8s", "Category", "Budget\n");
        System.out.format("%-15s %8s", "Food", food + " %\n");
        System.out.format("%-15s %8s", "Clothing", clothing + " %\n");
        System.out.format("%-15s %8s", "Entertainment", entertainment + " %\n");
        System.out.format("%-15s %8s", "Rent", rent + " %\n");
    }
}
