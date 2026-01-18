import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter discounted selling price: ");
        double discountedPrice = sc.nextDouble();
        
        System.out.print("Enter discount percentage: ");
        double discountPercent = sc.nextDouble();
        
        double originalPrice = discountedPrice / (1 - discountPercent / 100);

        System.out.println("Original Selling Price = " + originalPrice);

        sc.close();
    }
}
