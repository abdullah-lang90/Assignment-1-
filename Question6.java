import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter length of first parallel side: ");
        double a = sc.nextDouble();

        System.out.print("Enter length of second parallel side: ");
        double b = sc.nextDouble();
    
        System.out.print("Enter height (perpendicular distance): ");
        double h = sc.nextDouble();
        
        double area = h * (a + b) / 2;

        System.out.println("Area of the trapezoid = " + area);

        sc.close();
    }
}
