import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter voltage (Volts): ");
        double voltage = sc.nextDouble();
        
        System.out.print("Enter current (Amperes): ");
        double current = sc.nextDouble();

        double power = voltage * current;

        System.out.println("Power Consumption = " + power + " Watts");

        sc.close();
    }
}
