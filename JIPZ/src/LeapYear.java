
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		
		while(true) {
			
			System.out.println("Enter A Year!");
			
			Scanner Input = new Scanner(System.in);
			float Year = Input.nextFloat();
			
	
			//Step ->1
//			if(Year%4 == 0 && Year%100 != 0 || Year%400== 0) {
//				
//				System.out.println(" Leap Year");
//				
//			}
//			else {
//				System.out.println("It Not Leap Year!");
//			}
			
			
			
			
			//Step->2
			 if (Year % 4 == 0) {
		            if (Year % 100 != 0 || Year % 400 == 0) {
		                System.out.println("Leap Year!");
		            } else {
		                System.out.println("It's Not a Leap Year!");
		            }
		        } else {
		            System.out.println("It's Not a Leap Year!");
		            Input.close();
		        }
			
			
			
			
		}
		
		
		
		
		

	}

}