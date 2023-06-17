package Backend;

import java.util.ArrayList;
import java.util.List;

public class ReportingAndAnalytics {
    /*
     Features we need:
     1) Generate reports on crop yields, expenses, revenue, etc.
     2) Provide insights into farm operations
    */

    // Declare variables
    private List<Double> cropYields;
    private List<Double> expenses;
    private List<Double> revenue;

    // Constructor
    public ReportingAndAnalytics() {
        cropYields = new ArrayList<>();
        expenses = new ArrayList<>();
        revenue = new ArrayList<>();
    }

    // Add crop yield
    public void addCropYield(double yield) {
        cropYields.add(yield);
    }

    // Add expense
    public void addExpense(double amount) {
        expenses.add(amount);
    }

    // Add revenue
    public void addRevenue(double amount) {
        revenue.add(amount);
    }

    // Generate crop yield report
    public void generateCropYieldReport() {
        System.out.println("Crop Yield Report:");
        System.out.println("------------------");
        for (int i = 0; i < cropYields.size(); i++) {
            System.out.println("Crop Yield #" + (i + 1) + ": " + cropYields.get(i));
        }
    }

    // Generate expenses report
    public void generateExpensesReport() {
        System.out.println("Expenses Report:");
        System.out.println("----------------");
        for (int i = 0; i < expenses.size(); i++) {
            System.out.println("Expense #" + (i + 1) + ": $" + expenses.get(i));
        }
    }

    // Generate revenue report
    public void generateRevenueReport() {
        System.out.println("Revenue Report:");
        System.out.println("---------------");
        for (int i = 0; i < revenue.size(); i++) {
            System.out.println("Revenue #" + (i + 1) + ": $" + revenue.get(i));
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create an instance of ReportingAndAnalytics
        ReportingAndAnalytics reportingAndAnalytics = new ReportingAndAnalytics();

        // Add crop yields, expenses, and revenue
        reportingAndAnalytics.addCropYield(1000.0);
        reportingAndAnalytics.addCropYield(1500.0);

        reportingAndAnalytics.addExpense(500.0);
        reportingAndAnalytics.addExpense(800.0);

        reportingAndAnalytics.addRevenue(2000.0);
        reportingAndAnalytics.addRevenue(3000.0);

        // Generate reports
        reportingAndAnalytics.generateCropYieldReport();
        reportingAndAnalytics.generateExpensesReport();
        reportingAndAnalytics.generateRevenueReport();
    }
}
