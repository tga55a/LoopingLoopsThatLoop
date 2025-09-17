import java.util.Scanner;
public class RightAlignedStairs {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a character: ");
        String character = input.nextLine();

        System.out.println("Enter number of levels: ");
        int levels = input.nextInt();

        for (int i = 0; i <= levels; i++) {
            System.out.println( " ".repeat( levels - i ) + character.repeat(i) );
        }


    }
}
