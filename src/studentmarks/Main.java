ackage studentmarks;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Scanner sc = new Scanner(System.in);

		        System.out.print("Enter Student Name: ");
		        String name = sc.nextLine();

		        int total = 0;

		        for (int i = 1; i <= 5; i++) {
		            System.out.print("Enter Subject " + i + " Marks: ");
		            int marks = sc.nextInt();
		            total += marks;
		        }

		        double percentage = total / 5.0;

		        System.out.println("\nStudent Name: " + name);
		        System.out.println("Total Marks: " + total);
		        System.out.println("Percentage: " + percentage);

		        if (percentage >= 90) {
		            System.out.println("Grade: A");
		        } else if (percentage >= 75) {
		            System.out.println("Grade: B");
		        } else if (percentage >= 60) {
		            System.out.println("Grade: C");
		        } else {
		            System.out.println("Grade: D");
		        }

		        sc.close();
		    }
		}
