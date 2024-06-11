import java.util.Scanner;

public class CaseChecker {
    public static void main(String[] args) {
        System.out.println();
        Scanner Input = new Scanner(System.in);
        char Letter = Input.next().trim().charAt(0);
        if(Letter >= 'a' && Letter <= 'z'){
            System.out.println("LowerCase");
        }
        else{
            System.out.println("UpperCase");
        }
        Input.close();
    }
}
