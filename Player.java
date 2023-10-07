public class Player {
    private String name;
    private int lives;
    private int guess;

    public Player() {
        this.name = "";
        this.lives = 0;
    }

    public void setPlayer(String name, int lives) {
        this.name = name;
        this.lives = lives;
    }

    public void setGuess(int guess) {
        this.guess = guess;
    }

    public int getGuess() {
        return guess;
    }

    public String getName() {
        return name;
    }

    public int getLives() {
        return lives;
    }

    public void loseLives() {
        this.lives -=1;
    }
    // public String toString() {
    // return name + "," + lives;
    // }
}