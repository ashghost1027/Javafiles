import java.util.Scanner;

public class Game {
    private static int answer = 5;

    public Player getPlayer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the player: ");
        String name = scanner.nextLine();
        String mode = chooseMode();
        int lives = getLives(mode);
        Player player = new Player();
        player.setPlayer(name, lives);
        return player;
    }

    public Player[] getPlayersCount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of players: ");
        int numberOfPlayers = scanner.nextInt();
        scanner.nextLine();
        Player[] players = new Player[numberOfPlayers];
        for (int i = 0; i < numberOfPlayers; i++) {
            players[i] = getPlayer();
        }
        return players;
    }

    public int getLives(String mode) {
        switch (mode) {
            case "H":
            case "h":
                return 5;
            case "E":
            case "e":
                return 15;
            default:
                return 10;
        }
    }

    public String chooseMode() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("H for hard, E for easy, any key for normal. ");
        return scanner.nextLine();
    }

    void getGuesses(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter the guess of player %s: ", player.getName());
        int guess = scanner.nextInt();
        scanner.nextLine();
        player.setGuess(guess);
    }

    String higherLower(Player player) {
        if (player.getGuess() > answer) {
            return "Go lower " + player.getName();
        } else if (player.getGuess() < answer) {
            return "Go higher " + player.getName();
        } else {
            return "You won " + player.getName();
        }
    }

    boolean giveResults(Player player) {
        return player.getGuess() == answer;
    }

    void gameTime() {
        Player[] players = getPlayersCount();
        for (Player player : players) {
            int lives = player.getLives();
            boolean playerWon = false;
            for (int j = 0; j < lives; j++) {
                getGuesses(player);
                System.out.println(higherLower(player));
                if (giveResults(player)) {
                    playerWon = true;
                    break;
                }
            }
            if (!playerWon) {
                System.out.println(player.getName() + " ran out of lives!");
            }
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.gameTime();
    }
}
