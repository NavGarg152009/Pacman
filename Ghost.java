public class Ghost{
    public static void main(String[] args){
        System.out.println("Welcome");
    }
    public static void ghost(){
        int rand = CustomP.randInt(1, 5);
        String color = "";
        if (rand == 1){
            color += "Red";
        }
        else if (rand == 2){
            color += "Pink";
        }
        else if (rand == 3){
            color += "Cyan";
        }
        else{
            color += "Orange";
        }
        boolean dead = false;
        int yPos = 0;
        int xPos = 0;

        while (dead == false){
            int randomInt = CustomP.randInt(1, 5);
            if (randomInt == 1){
                yPos++;
            }
            else if (randomInt == 2){
                xPos++;
            }
            else if (randomInt == 3){
                yPos --;
            }
            else{
                xPos --;
            }
            boolean vulnerable = false;
            boolean touching = false;
            if (vulnerable){
                if(touching){
                    dead = true;
                }
            }
        }
    }
}
