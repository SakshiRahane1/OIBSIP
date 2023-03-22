import java.util.Scanner;
public class NumberGuessing {
	
	public static void main(String[] args) {
        int start = 0;
        int end = 200;
        int attempt= 5;
        Scanner sc=new Scanner(System.in);

        System.out.println("\t\tGuess the Number Game!!! ");

        while (true) {
            System.out.println();
            System.out.println("1. ## START ##");
            System.out.println("2. Change start (" + start + ")");
            System.out.println("3. Change end (" + end + ")");
            System.out.println("4. Change chance amount (" + attempt + ")");
            System.out.println("5. ## EXIT ##");
            System.out.println("\nEnter your choice: ");
            int choice=sc.nextInt();
            

            switch (choice) {
                case 1:
                    int number = sc.nextInt();
                    int currentAttempts = attempt;
                    System.out.println("Guess the number between " + start + " and " + end + "!");
                    while (currentAttempts > 0) {
                        System.out.println(currentAttempts-- + " attempts left:");
                        int input = sc.nextInt();
                        if (input == number)
                            break;
                        else
                            System.out.println("The number is " + (input < number ? "greater" : "less") + " than yours.");
                    }
                    if (currentAttempts > 0)
                        System.out.println(" Congratulations!...  YOU WIN ");
                    else {
                        System.out.println("You loose! Better luck next time!");
                        System.out.println("The number was " + number);
                    }
                    break;
                case 2:
                     {
                        System.out.println("Enter new start:");
                        int newstart = sc.nextInt();
                        if (newstart< end) {
                            start = newstart;
                            break;
                        } else
                            System.out.println("Start should be less than bound. Try again.");
                    }
                    break;
                case 3:
                     {
                        System.out.println("Enter new end:");
                        int newend =sc.nextInt();
                        if (newend > end) {
                            end= newend;
                            break;
                        } else
                            System.out.println("End should be greater than origin. Try again.");
                    }
                    break;
                case 4:
                     {
                        System.out.println("Enter new attempts amount:");
                        int newAttempts = sc.nextInt();
                        if (newAttempts > 0) {
                        	attempt= newAttempts;
                            break;
                        } else
                            System.out.println("Attempts amount should be greater than 0. Try again.");
                    }
                    break;
                case 5:
                    System.out.println("Bye!");
                    return;
            }
        }
    }

}
