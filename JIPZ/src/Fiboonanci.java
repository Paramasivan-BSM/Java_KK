import java.util.Scanner;

class Fiboonanci{
    public static void main(String[] args) {


        // In this Program comtain Logocal issues 

        System.out.println("Fiboonaci Calculation");
       Scanner Input = new Scanner(System.in);
       int n = Input.nextInt();
       int a = 0;
       int b = 1;
       int count = 2;

       while (count < n ) {
        int temb = b;
        b = b+a;
        b = temb;
        count++;
        System.out.println(b);
       }
    

       Input.close();





    }
}