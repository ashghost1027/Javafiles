import java.util.Scanner;
import java.util.Random;

class RockPaperScissors {
    public String GetUserInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice(rock, paper, scissors): ");
        String userInput = scanner.nextLine();
        switch(userInput){
            case "rock": System.out.println("You chose rock!");
            break;
            case "paper": System.out.println("You chose paper!!");
            break;
            case "scissors": System.out.println("You chose scissors");
            break;
            case "Rock": System.out.println("You chose rock!");
            break;
            case "Paper": System.out.println("You chose paper!!");
            break;
            case "Scissors": System.out.println("You chose scissors");
            break;
            default:System.out.println("That option isn't available man");
        }
        scanner.close();
        return userInput.toLowerCase();
    }
    public String GetComputerInput(){
        Random random = new Random();
        String computerInput;
        int randomChoice = random.nextInt(3);
        if (randomChoice == 1){
            computerInput = "rock";
            System.out.println(("Comp chose rock"));
        }
        else if(randomChoice==2){
            computerInput = "paper";
            System.out.println(("Comp chose paper"));
        }
        else{
            computerInput = "scissors";
            System.out.println("Comp chose scissors");
        }
        return computerInput;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press any key to start (q to quit)");
        String user = scanner.nextLine();
        if (user.equalsIgnoreCase("q")){
            System.out.println("Bye bye");
            System.exit(0); 
        }
        else{
            RockPaperScissors function = new RockPaperScissors();
            String playerOne = function.GetUserInput();
            String playerTwo = function.GetComputerInput();
            
            if (playerOne.equalsIgnoreCase(playerTwo)){
                System.out.println("Its a draw. You both chose "+playerOne);
            }
            else if (playerOne.equalsIgnoreCase("rock")&& playerTwo.equalsIgnoreCase("scissors")){
                System.out.println("You won!!");
            }
            else if (playerOne.equalsIgnoreCase("rock")&& playerTwo.equalsIgnoreCase("paper")){
                System.out.println("You lost!!");
            }
            else if (playerOne.equalsIgnoreCase("paper")&& playerTwo.equalsIgnoreCase("scissors")){
                System.out.println("You lost!!");
            }
            else if (playerOne.equalsIgnoreCase("paper")&& playerTwo.equalsIgnoreCase("rock")){
                System.out.println("You won!!");
            }
            else if (playerOne.equalsIgnoreCase("scissors")&& playerTwo.equalsIgnoreCase("rock")){
                System.out.println("You lost!!");
            }
            else if (playerOne.equalsIgnoreCase("scissors")&& playerTwo.equalsIgnoreCase("paper")){
                System.out.println("You won!!");
            }
            System.out.println("Good game");   
                                                                 
        }
        scanner.close();
    }
}
