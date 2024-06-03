package flowchart_and_pseudocode;

import java.util.Scanner;

public class Multiplication_Table {

	public static void main(String[] args) {
		System.out.println("Enter Your Table");
		Scanner Input = new Scanner(System.in);
		// TODO Auto-generated method stub
		int Table = Input.nextInt();
		for(int n = 1;n<=10;n++) {
			System.out.println(n +"*" + Table + "=" + n*Table);
			
		}
		

	}

}
