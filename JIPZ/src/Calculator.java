import java.util.Scanner;

 class Calulator {
    public static void main(String[] args) {
        System.out.println("\n");
        Scanner Input = new Scanner(System.in);
        int Result ;

while (true) {
    System.out.println("Enter The Operator :");

    String Operator = Input.next();
     
   


if (Operator.equals("+") || Operator.equals("-") || Operator.equals("*") || Operator.equals("%")) {

    int Value1 = Input.nextInt();
     int Value2 = Input.nextInt();

    if(Operator == "+"){
       
        Result = Value1 + Value2;
        
        

     }

     else if (Operator == "-" ){
        Result = Value1 - Value2;
        
     }
    else if (Operator == "*") {
        Result = Value1 * Value2;

     }
     else if (Operator == "%") {
        Result = Value1 % Value2;
        
     }
     System.out.println("Result: " + Result);
    
}
else{
   
    System.out.println("Invalid Operator");
    break;
}


    

     
     
     

    
}


    }
    
}

// import java.util.Scanner;

// public class Calculator {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int result = 0; // Initialize the result variable

//         while (true) {
//             System.out.println("Enter the Operator (+, -, *, %):");
//             String operator = input.next();

//             if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("%")) {
//                 int value1 = input.nextInt();
//                 int value2 = input.nextInt();

//                 if (operator.equals("+")) {
//                     result = value1 + value2;
//                 } else if (operator.equals("-")) {
//                     result = value1 - value2;
//                 } else if (operator.equals("*")) {
//                     result = value1 * value2;
//                 } else if (operator.equals("%")) {
//                     result = value1 % value2;
//                 }

//                 System.out.println("Result: " + result);
//             } else {
//                 System.out.println("Invalid Operator. Please enter a valid operator.");
//             }
//         }
//     }
// }
