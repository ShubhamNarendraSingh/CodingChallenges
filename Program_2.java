import java.util.Scanner;

public class Program_2
{
    public static void main (String[] args)
    {
        //Q. With a single integer as the input, generate the following unit a = x
        //[series of numbers as shown in below examples
        //Output: (examples)
        //1) input a = 1, then output: 1
        //2) input a = 2, then output: 1,3
        //3) input a = 3, then output: 1,3,5
        //4) input a = 4, then output: 1,3,5,7
        //        ....
        //x) input a = x, then output: 1,3,5,7,....
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Enter the value of x : ");
        x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            int oddNumber = 2 * i + 1;
            System.out.print(oddNumber);
            if (i < x - 1) {
                System.out.print(", ");
            }
        }
    }
}
