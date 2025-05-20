import java.util.Scanner;

public class Program_1
{
    public static void main (String[] args)
    {
        System.out.println("Hello World");
        //Q. Create a small calculator which performs operation such as Addition, Subtraction, Multiplication and Division using class
        // Calculator inputs : a, b and type of operation. Datatype a=double,b=double,type of operation=string
        Scanner sc = new Scanner(System.in);
        double num1, num2;
        String oper;
        System.out.println("Enter the first Number: ");
        num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        num2 = sc.nextInt();
        System.out.println("Enter the operation to perform: ");
        oper = sc.next();

        System.out.println("Answer after operation is : " + calculator(num1,num2,oper));
    }

    public static double calculator(double a, double b, String operator_type) {
        double ans = 0;
        switch(operator_type){
        case "+":
            ans = a + b;
            break;
        case "-":
            ans = a - b;
            break;
        case "*":
            ans = a * b;
            break;
        case "/":
            ans = a / b;
            break;
        default:
            System.out.println("Invalid operator type cannot perform");
        }
        return -1;
    }
}
