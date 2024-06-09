import java.util.Scanner;

public class PTRCalculation {
    public static void main(String[] args) {


while (true) {
    System.out.println();
Scanner Input = new Scanner(System.in);
System.out.println("Enter Amount");
  int Amount = Input.nextInt();
  System.out.println("Enter Your Intrest Rate");
  int Rate = Input.nextInt();
  System.out.println("Enter A year");
  int Year = Input.nextInt();


System.out.println((Amount * Rate * Year) / 100);
  
    
}

      
    }
}
