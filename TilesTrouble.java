import java.util.Scanner;

public class TilesTrouble {
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        System.out.println("Welcome to the game" +" "  +":"+" " + "Trouble and tiles");
        System.out.println("Player 1 enter your name");
        String name1=s.next();
        System.out.println("Player 2 enter your name");
        String name2=s.next();
        System.out.println("Player 1 choose your mark");
        char ch1= s.next().charAt(0);
        System.out.println("Player 2 choose your mark");
        char ch2=s.next().charAt(0);
        HumanPlayer p1=new HumanPlayer(name1, ch1);
        HumanPlayer p2=new HumanPlayer(name2, ch2);
        HumanPlayer cp;
        cp=p1;
        while(true){
            System.out.println("Enter to roll dice");
            System.out.println(cp.name + " " + "Your turn");
            char as= s.next().charAt(0);
            cp.makeMove(2);
            System.out.println(cp.name + " " + "Your turn");
            if(cp.winConditions()){
                System.out.println(cp.name + "Wins the game");
                break;
            }else{
                if(cp==p1){
                    cp=p2;
                }else{
                    cp=p1;
                }
            }
        }
        s.close();
    }
}
