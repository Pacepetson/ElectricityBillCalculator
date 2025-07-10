import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter total units consumed: ");
        int units = scanner.nextInt();
        scanner.close();

        double bill = 0;

        // TODO: Write the logic to calculate the bill based on units using
        // if, if-else, and if-else-if statements only

        System.out.println("Electricity Bill: ₹" + bill);
    }
}
