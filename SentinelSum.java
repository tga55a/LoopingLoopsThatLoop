import java.util.Scanner;

public class SentinelSum {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.println("Enter a number to add to the total.");
            int userInput = input.nextInt();
            if (userInput == 0) {
                break;
            } else {
                sum += userInput;
            }
        }

        System.out.println("Your grand total is: " + sum);


    }
}
