public class PacMan {
    private int numLives = 3;
    private int xPos = 2;
    private int yPos = 1;
    char sprite = 'C';
    Game game;

    PacMan(Game g) {
        game = g;
    }
    public void move(int x, int y) {
        xPos = x;
        yPos = y;
    }

    public void eat(String item) {
        if (item == 'pellet') {
            game.pellets.removePellet(xPos, yPos);
        }
    }

    public String getPosition() {
        return xPos + " " + yPos;
    }

    public void move(char c);{
        if (c == "w") {
            yPos++;
            updateSprite(3);
        } else if (c == "s") {
            yPos--;
            updateSprite(1);
        } else if (c == "a") {
            xPos--;
            updateSprite(2);
        } else if (c == "d") {
            xPos++;
            updateSprite(0);
        }
    }

    public void avoidCollision() {
        if (xPos >= Maze.getWidth()) {
            xPos--;
        } else if (xPos < 0) {
            xPos++;
        }
        
        if (yPos < 0) {
            yPos++;
        } else if (yPos >= Maze.getLength()) {
            yPos--;
        }
    }

    public void eat(Ghost ghost) {
        
    }

    public void loseALife() {
        numLives--;
    }

    public void updateSprite(int x) {
        if (x == 0) {
            sprite = 'C';
        } else if (x == 1) {
            sprite = 'X'
        } else if (x == 2) {
            sprite = 'D';
        } else if (x == 3) {
            sprite = 'U';
        }
    }
}
