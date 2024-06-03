package flowchart_and_pseudocode;

import java.util.Scanner;

public class Print_sum_of_all {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		int Result=0;
		while(true) {
			String UserInput = Input.nextLine();
			if(UserInput.equalsIgnoreCase("x")) {
				break;
				
			}
			
			try {
				int Num = Integer.parseInt(UserInput);
				Result += Num;
			}
			catch(Exception e) {
				
				System.out.println("You Can\'t Give Other Alphapetic Value, It Accept Only X");
				
			}
			
	}
		System.out.println("Your Total Value Is: " + Result);
		Input.close();

}
}
