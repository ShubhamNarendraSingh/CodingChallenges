import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program_4
{
    public static void main (String[] args)
    {
        //Q. Get the total count of number listed in the dictionary which is multiple of [1,2,3,4,5,6,7,8,9]
        // (examples) Input: [1,2,8,9,12,46,76,82,15,20,30]
        // Output: {1: 11, 2: 8, 3: 4, 4: 4, 5: 3, 6: 2, 7: 0, 8: 1, 9: 1}
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>  numbers = new ArrayList<>();
        System.out.println("Enter the total numbers to add in list to check: ");
        int tot = sc.nextInt();
        System.out.println("Start adding numbers one by one");
        for (int i = 0; i < tot; i++) {
            numbers.add(sc.nextInt());
        }
        System.out.println("Added numbers are: "+numbers);

        Map<Integer, Integer> multiplesMap = new HashMap<>();
        for (int i = 1; i <= 9; i++) {
            multiplesMap.put(i, 0);
        }

        for (int j = 0; j < tot; j++) {
            int num = numbers.get(j);
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    multiplesMap.put(i, multiplesMap.get(i) + 1);
                }
            }
        }

        System.out.print("Final multiples map is : " + multiplesMap);
    }
}
