import java.util.Scanner;

public class Question1 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter obtained marks: ");
        double obtainedMarks = sc.nextDouble();

        
        System.out.print("Enter maximum marks: ");
        double maximumMarks = sc.nextDouble();

        
        double percentage = (obtainedMarks / maximumMarks) * 100;

        
        System.out.println("Percentage = " + percentage + "%");

        sc.close();
    }
}
