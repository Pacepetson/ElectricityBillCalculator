import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter total units consumed: ");
        int units = scanner.nextInt();
        scanner.close();

        double bill = 0;
        if(unit<=100){
            bill=units*1.5;
        }elseif(unit<=300){
            bill=units*2.5;
        }elseif(unit<=500){
            bill=unit*4.0;
        }else{
            bill=unit*6.0;
        }

        System.out.println("Electricity Bill: ₹" + bill);
    }
}
