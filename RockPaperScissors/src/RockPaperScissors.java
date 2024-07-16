import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Rock, Paper, Scissors"};
        while(true) {
            System.out.println("Choose rock, paper or scissors.To exit the game type 'exit");
            String userChoice = scanner.nextLine().toLowerCase();

            if(userChoice.equals("exit")) {
                System.out.println("Exit the game.");
                break;
            }
            int computerChoiceIndex = random.nextInt(3);
            String computerChoice = choices[computerChoiceIndex].toLowerCase();
            System.out.println("The computer is choosing" + choices[computerChoiceIndex]);

            if (userChoice.equals(computerChoice)) {
                System.out.println("Equality!");
            }else if (userChoice.equals("Rock") && computerChoice.equals("Scissors") || userChoice.equals("Paper") && computerChoice.equals("Rock") || userChoice.equals("Scissors") && computerChoice.equals("Paper")) {
                System.out.println("You win!");
            }else if (userChoice.equals("Paper") && computerChoice.equals("Scissors") || userChoice.equals("Rock") && computerChoice.equals("Paper") || userChoice.equals("Scissors") && computerChoice.equals("Rock")) {
                System.out.println("You lose!");
            }else {
                System.out.println("Invalid choice.Please enter again!");
            }
        }
        scanner.close();

    }
}
