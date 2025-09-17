
import java.util.Scanner;
public class MenuRepetition {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        boolean cycling = true;
        do {
            System.out.println("MAIN MENU\n================================\nCHOOSE OPTION:\n");
            System.out.println("1. SAY HELLO\n2. DISPLAY TIME\n3. EXIT");

            int input = scanner.nextInt();
            System.out.println(input);
            System.out.print("RESULT: ");
            if (input == 1) {
                    System.out.println("HELLO!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            } else if(input == 2) {
                    System.out.println("It is currently September 17th in the Year 3025 in the Common Era");
            } else if (input == 3) {
                System.out.println("EXITED.");
                cycling = false;
                break;
            }

            System.out.println("\n");
        } while(cycling);

    }

}