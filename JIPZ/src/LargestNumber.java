import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
       
        int Res = 0 ;
        while (true) {
           
            System.out.println("Enter A Number 1:");
            int V1 = Input.nextInt();
            System.out.println("Enter A Number 2:");
            int V2 = Input.nextInt();

            if (V1 > V2) {
                 Res = V1;
                 System.out.println("Largest Value Is " + Res);
       
                
            }

            if (V2 > V1) {
                Res = V2;
                
                    System.out.println("Largest Value Is "  + Res);
       
                
            }
           
            
        }

        

    }
}
