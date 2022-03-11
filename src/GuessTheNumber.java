import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        int firstNumber = 1;
        int secondNumber = 20;
        boolean playAgain = true;

        Scanner input = new Scanner(System.in);
        System.out.println("What is your Name?");
        String nameInput = input.next();

        while(playAgain) {
            System.out.println("Well," + nameInput + ", I am thinking of a number between 1 and 20. Take a guess. You have 6 tries. Enjoy!");
            int storeVal = (secondNumber - firstNumber) + 2;
            double randomNumDouble = Math.floor((Math.random()) * storeVal);
            int systemGuessNum = (int) randomNumDouble;

            for (int i = 1; i <= 6; i++) {
                try {
                    String guessInputString = input.next();
                    int guessInput = Integer.parseInt(guessInputString);

                    if (guessInput == systemGuessNum) {
                        System.out.println("Good Job " + nameInput + " ! You guessed my number in " + i + " guesses!");
                        break;
                    }
                    else if(guessInput > 20 || guessInput < 1){
                        System.out.println("Please enter a number between 1 and 20");
                    } else if (guessInput > systemGuessNum) {
                        System.out.println("Your guess is too high");
                    } else {
                        System.out.println("Your guess is too low");
                    }
                }
                catch(Exception e){
                    System.out.println("Please input number between 1 and 20");
                }
            }

            System.out.println("Would you like to play again? (y or n)");
            String playAgainAnswer = input.next();
            if (!playAgainAnswer.equals("y")) {
                playAgain = false;
            }
        }
    }
}

