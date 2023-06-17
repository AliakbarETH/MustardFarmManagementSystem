package Backend;

import java.util.ArrayList;
import java.util.List;

public class FinancialTracking {
    /*
     Features we need:
     1) Keep track of income and expenses
     2) Generate reports and summaries
     3) Monitor profitability
    */

    // Declare variables
    private double totalIncome;
    private double totalExpenses;
    private List<Double> incomeList;
    private List<Double> expensesList;

    // Constructor
    public FinancialTracking() {
        totalIncome = 0;
        totalExpenses = 0;
        incomeList = new ArrayList<>();
        expensesList = new ArrayList<>();
    }

    // Add income
    public void addIncome(double amount) {
        incomeList.add(amount);
        totalIncome += amount;
    }

    // Add expense
    public void addExpense(double amount) {
        expensesList.add(amount);
        totalExpenses += amount;
    }

    // Calculate profit
    public double calculateProfit() {
        return totalIncome - totalExpenses;
    }

    // Generate income report
    public void generateIncomeReport() {
        System.out.println("Income Report:");
        System.out.println("---------------");
        for (int i = 0; i < incomeList.size(); i++) {
            System.out.println("Income #" + (i + 1) + ": $" + incomeList.get(i));
        }
        System.out.println("Total Income: $" + totalIncome);
    }

    // Generate expenses report
    public void generateExpensesReport() {
        System.out.println("Expenses Report:");
        System.out.println("----------------");
        for (int i = 0; i < expensesList.size(); i++) {
            System.out.println("Expense #" + (i + 1) + ": $" + expensesList.get(i));
        }
        System.out.println("Total Expenses: $" + totalExpenses);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create an instance of FinancialTracking
        FinancialTracking financialTracking = new FinancialTracking();

        // Add income
        financialTracking.addIncome(1000.0);
        financialTracking.addIncome(2000.0);

        // Add expenses
        financialTracking.addExpense(500.0);
        financialTracking.addExpense(800.0);

        // Generate reports
        financialTracking.generateIncomeReport();
        financialTracking.generateExpensesReport();

        // Calculate profit
        double profit = financialTracking.calculateProfit();
        System.out.println("Profit: $" + profit);
    }
}

