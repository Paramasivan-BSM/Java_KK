import java.util.Scanner;

public class GreetingName {
    public static void main(String[] args) {


        System.out.println("\n Enter Your Fav Name");
       
              Scanner Input = new Scanner(System.in);
        while (true) {
      
            String Name = Input.nextLine();
            System.out.println("Hello" + " " + Name);

            Input.close();
        }
        

    }
}
