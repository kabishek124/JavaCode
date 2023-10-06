import java.util.Random;

public class HumanPlayer {
    String name;
    char pointer;
    public int count = 25;
    public int diceValue = 0;
    public int ladderValue1 = 5;
    public int ladderValue2 = 10;
    public int snakeValue1 = 23;
    public int snakeValue2 = 16;
    boolean isStarted=false;

    public HumanPlayer(String name, char pointer) {
        this.name = name;
        this.pointer = pointer;
    }

    public void makeMove(int lucky_number) {
        Random rand = new Random();
        int random = rand.nextInt(1, 6);
        processMove(random);
    }

    public void processMove(int random) {
        //System.out.println(diceValue);
        diceValue = diceValue + random;
        if (diceValue == snakeValue1) {
            diceValue = diceValue - 22;
        } else if (diceValue == snakeValue2) {
            diceValue = diceValue - 7;
        } else if (diceValue == ladderValue1) {
            diceValue = diceValue + 8;
        } else if (diceValue == ladderValue2) {
            diceValue = diceValue + 11;
        }
        if( diceValue%4==0){
            makeMove(diceValue);
        }
        printBoard( diceValue);
    }

    public void printBoard(int diceValue) {   
        int index =25;
        System.out.println(diceValue);
        System.out.println("------------------------");
        for(int i=0;i<5;i++){
            System.out.print(" | ");
            if( i%2!=0){
                for(int j=0;j<5;j++){
                    if(diceValue == index){
                        System.out.print( '#' + " " + " | ");

                    }else{

                        System.out.print( index + " " + " | ");
                    }
                    index--;
                }
            }else{
                for( int j=5-1;j>=0;j--){
                    if(diceValue == index){
                        System.out.print( '#' + " " + " | ");

                    }{
                    System.out.print( index + " "+ " | ");
                    }
                    index--;
                }
            }
            
            System.out.println();
            System.out.println("------------------------");
        }

    }

    public boolean winConditions(){
        if( diceValue >=25){
            return true;
        }
        return false;
    }


}
