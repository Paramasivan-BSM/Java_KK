import java.util.Scanner;

public class USDConvertor {
    public static void main(String[] args) {
        System.out.println();
        Scanner Input = new Scanner(System.in);
        int USD;
        System.out.println("Enter Your Amount:");
        while (true) {
            int INR =  Input.nextInt();
            USD = INR / 75;
            System.out.println(USD);
            Input.close();            
        }
        
       
    }

}
