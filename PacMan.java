public class PacMan {
    private int numLives = 4;
    private int xPos = 0;
    private int yPos = 0;
    Game game = new Game();

    public void move(int x, int y) {
        xPos = x;
        yPos = y;
    }

    public void eat(String item) {

    }

    public String getPosition() {
        return xPos + " " + yPos;
    }

    public void move(char c);{
        if (c == "u") {
            yPos++;
        } else if (c == "d") {
            yPos--;
        } else if (c == "l") {
            xPos--;
        } else if (c == "r") {
            xPos++;
        }
    }

    public void avoidCollision() {
        // Skibidi?
    }

    public void eat(Ghost ghost) {
        if (Ghost.isVulnerable == true) {
            Ghost.hurtPacman();
            loseALife();
        } else {
            Ghost.isAlive = false;
        }
    }

    public void loseALife() {
        numLives--;
    }
}
