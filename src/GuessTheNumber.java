import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        int firstNumber = 1;
        int secondNumber = 20;
        boolean playAgain = true;
        String setBold = "\033[0;1m";
        String setPlain = "\033[0;0m";

        Scanner input = new Scanner(System.in);
        System.out.println("What is your Name?");
        String nameInput = input.next();

        while(playAgain) {
            System.out.println("......................");
            System.out.println("Well, " + setBold+ nameInput + setPlain+ ", I am thinking of a number between 1 and 20. Take a guess. You have 6 tries. Enjoy!"+ "\n");

            int storeVal = (secondNumber - firstNumber) + 2;
            double randomNumDouble = Math.floor((Math.random()) * storeVal);
            int systemGuessNum = (int) randomNumDouble;

            for (int i = 1; i <= 6; i++) {
                try {
                    System.out.println("Your Choice Number " + i + " is:" );
                    String guessInputString = input.next();
                    int guessInput = Integer.parseInt(guessInputString);

                    if (guessInput == systemGuessNum) {
                        System.out.println("Good Job " + setBold+ nameInput + setPlain + " ! You guessed my number in " + setBold+ i + setPlain+ " guesses!" + "\n");
                        break;
                    }
                    else if(guessInput > 20 || guessInput < 1){
                        System.out.println("Please enter a number between 1 and 20");
                    } else if (guessInput > systemGuessNum) {
                        System.out.println(setBold + guessInput + setPlain+ " is higher than the number of my choice." + "\n");
                    } else {
                        System.out.println(setBold + guessInput + setPlain+ " is lower than the number of my choice" + "\n");
                    }
                    if(i==6){
                        System.out.println("You couldn't guess my number this time...Better luck next time..........!!!" + "\n");
                    }
                }
                catch(Exception e){
                    System.out.println("Please input number between 1 and 20" + "\n");
                }
            }

            System.out.println("Would you like to play again?" + setBold+ "(y or n)" + setPlain);
            String playAgainAnswer = input.next();
            if (!playAgainAnswer.equals("y")) {
                playAgain = false;
            }
        }
    }
}

