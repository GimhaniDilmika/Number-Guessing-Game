import java.util.*;
class NumberGassingGame{
    public static void main(String arg[]){
        Scanner input=new Scanner(System.in);
        System.out.print(" **Welcome to the Number Gussing Game**");
        int lowBound=1;
        int upperBound=100;
        int maxAttempts=10;
        int rounds=0;
        int totalScore=0;
        int attempts=0;
        boolean bool=true;
        Random random = new Random();
        System.out.println();
        while (bool) {
            System.out.print("Do you want play Game (Y/N):");
            String playAgain=input.next();
            int targetNumber = random.nextInt(100) + 1;
            System.out.println();
         switch (playAgain) {
            case "Y":
            System.out.println("Guess the Number Between  "+lowBound+" and  "+upperBound+"  !");
            System.out.println("**You have "+maxAttempts+"  attempts to guess the number.** ");
            boolean guessedCorrectly = false;
            while (attempts<maxAttempts) {
                System.out.println("Attemp "+(attempts+1));
                System.out.println();
                System.out.print("Enter your Guess number:");
                int guess=input.nextInt();
                attempts++;
                System.out.println();
                if(guess<targetNumber)
                {
                    System.out.println("Too low! try again.");
                }
                else if(guess<targetNumber){
                    System.out.println("Too high! try again.");   

                }
                
                else{
                    System.out.println("Congratulation! YOU WINN THE GAME**");
                    guessedCorrectly = true;
                    totalScore += (maxAttempts - attempts + 1);
                }
                System.out.println();
            }
            if (!guessedCorrectly) {
                System.out.println("Sorry, you've used all your attempts. The correct number was " + targetNumber + ".");
            }
            System.out.println();
            System.out.println("*************************");
            System.out.println("Your current score is: " +totalScore);
            System.out.println();

                break;
         
            case "N":
            System.out.println("Game over!");
            System.out.println("Thank for playing!");
               return;
         }

            
        }

    }
}