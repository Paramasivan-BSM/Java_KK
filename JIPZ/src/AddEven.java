import java.util.Scanner;

class AddEven{
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        while (true) {
            int Num = Input.nextInt();
            if (Num%2==0) {
                System.out.println("Even");
                
            }
            else{
                System.out.println("Odd");
            }
            Input.close();
        }
        
    }
}