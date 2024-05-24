public class Game {
    public static Maze maze = new game.getMaze;



    public void display() {

        feast();

        String dspString = "";

        for (int y = 0; y < maze.getHeight(); y++) {

            for (int x = 0; x < maze.getWidth(); x++) {

                String point = ";" + pointString(x, y) + ";";

                if (point.equals(";" + player.getPosition() + ";" ))

                    dspString += " C ";

                else if (point.equals(";" + redGhost.getPosition() + ";" )) {

                    if (redGhost.getIsVulnerable())

                        dspString += " r ";

                    else

                        dspString += " R ";

                }

                else if (point.equals(";" + blueGhost.getPosition() + ";"))

                {

                    if (redGhost.getIsVulnerable())

                        dspString += " b ";

                    else

                        dspString += " B ";

                }

                else if (pellets.hasPellet(x, y))

                    dspString += " o ";

                else

                    dspString += "   ";

            }

            dspString += "\n";

        }

        System.out.println(dspString);

    }





    public static void main(String[] args) {

        Game game = new Game();

        game.display();



        String input = "0";

        char cmd = '0'; // you can use String's charAt command to get the first char...



        // Think of how you can use loops to repeatedly call the display() method

        // and then allow the user enter a command:

        // a: go left one

        // d: go right one

        // s: go down one

        // w: go up one

        // q: quit the game



    }

}
