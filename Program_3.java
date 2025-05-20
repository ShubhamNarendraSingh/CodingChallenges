import java.util.Scanner;

public class Program_3
{
    public static void main (String[] args)
    {
        //Q. With a single integer as the input, generate the following until a = x[series of numbers as shown in below examples
        //Output: (examples)
        //1) input a = 1, then output: 1
        //2) input a = 2, then output: 1
        //3) input a = 3, then output: 1,3,5
        //4) input a = 4, then output: 1,3,5
        //5) input a = 5, then output: 1,3,5,7,9
        //6) input a = 6, then output: 1,3,5,7,9
        //.
        //.
        //x) input a = x, then output: 1,3,5,7,....
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Enter the value of x : ");
        x = sc.nextInt();
        int count;
        if (x % 2 == 0) {
            count = x - 1;
        } else {
            count = x;
        }

        for (int i = 0; i < count; i++) {
            int oddNumber = 2 * i + 1;
            System.out.print(oddNumber);
            if(i < count - 1) {
                System.out.print(", ");
            }
        }
    }
}
