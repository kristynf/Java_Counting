import java.util.Scanner;

public class Main  {

    public void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int num, total = 0;

        System.out.println("This is a counting program");
        // Loop should start here
        for (num = 0; num < 9; num++) {
            System.out.println("Please enter a number you want to add: ");
            num = keyboard.nextInt();

            total += num;
            // Loop should end here

            System.out.println("The total of all 10 numbers is " + total);

        }

    }
}
// The following program should allow the users to input 10 integers and output the total. Please finish it.