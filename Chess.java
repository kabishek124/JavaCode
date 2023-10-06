import java.util.Scanner;

public class Chess {
    // Function for check whether the range is in the matrix boundary or not
    static boolean isValidMove( int row, int column ) {
        if ( row >= 0 && row <= 7 && column >= 0 && column <= 7 ) {
            return true;
        }
        return false;
    }

    // function to check whether bishop cuts the horse or not
    static boolean bishopMove( int[][] chess, int r2, int c2 ) {
        // for restoring the row and column values after increment/decrement
        int i = r2;
        int j = c2;
        // right diagonal
        //Move the bishop until its next move is invalid
        while ( isValidMove( r2, c2 ) ) {
            // check for presence of horse
            if ( chess[r2][c2] == 1 ) {
                return true;
            }
            //Move the bishop to next possible moves
            r2--;
            c2++;
        }
        // leftdiagonal
        //same as right diagonal
        r2 = i;
        c2 = j;
        while ( isValidMove(r2, c2) ) {
            if ( chess[r2][c2] == 1 ) {
                return true;
            }
            r2--;
            c2--;
        }
        // bottomleft
        //same as right diagonal
        r2 = i;
        c2 = j;
        while ( isValidMove(r2, c2) ) {
            if ( chess[r2][c2] == 1 ) {
                return true;
            }
            r2++;
            c2--;
        }
        // bottomright
        //same as right diagonal
        r2 = i;
        c2 = j;
        while ( isValidMove(r2, c2) ) {
            if ( chess[r2][c2] == 1 ) {
                return true;
            }
            r2++;
            c2++;
        }
        //if bishop can not cut the horse in its all possible moves return false
        return false;
    }

    static boolean horseMove( int[][] chess, int r1, int c1 ) {
        int i = r1, j = c1;
        int flag = 0;
        // 1st possibility
        //unlike bishop horse moves differently
        //so there are 8 possible moves for horse 
        //intialize the flag to check for one possible move
        r1++;
        c1 = c1 - 2;
        //check for one possible move
        while ( isValidMove(r1, c1) && flag == 0 ) {
            if ( chess[r1][c1] == 1 ) {
                return true;
            }
            flag = 1;
        }
        // 2nd possibility
        //same as 1st possibility
        r1 = i;
        c1 = j;
        flag = 0;
        r1++;
        c1 = c1 + 2;
        while ( isValidMove(r1, c1) && flag == 0 ) {
            if ( chess[r1][c1] == 1 ) {
                return true;
            }
            flag = 1;
        }
        // 3rd possibility
        //same as 1st possibility
        r1 = i;
        c1 = j;
        flag = 0;
        r1 = r1 + 2;
        c1 = c1 - 1;
        while ( isValidMove(r1, c1) && flag == 0 ) {
            if ( chess[r1][c1] == 1 ) {
                return true;
            }
            flag = 1;
        }
        // 4th possibility
        //same as 1st possibility
        r1 = i;
        c1 = j;
        flag = 0;
        r1 = r1 + 2;
        c1 = c1 + 1;
        while ( isValidMove(r1, c1) && flag == 0 ) {
            if ( chess[r1][c1] == 1 ) {
                return true;
            }
            flag = 1;
        }
        // 5th possibility
        //same as 1st possibility
        r1 = i;
        c1 = j;
        flag = 0;
        r1--;
        c1 = c1 - 2;
        while ( isValidMove(r1, c1) && flag == 0 ) {
            if ( chess[r1][c1] == 1 ) {
                return true;
            }
            flag = 1;
        }
        // 6th possibility
        //same as 1st possibility
        r1 = i;
        c1 = j;
        flag = 0;
        r1--;
        c1 = c1 + 2;
        while ( isValidMove(r1, c1) && flag == 0 ) {
            if ( chess[r1][c1] == 1 ) {
                return true;
            }
            flag = 1;
        }
        // 7th possibility
        //same as 1st possibility
        r1 = i;
        c1 = j;
        flag = 0;
        r1 = r1 - 2;
        c1--;
        while ( isValidMove(r1, c1) && flag == 0 ) {
            if ( chess[r1][c1] == 1 ) {
                return true;
            }
            flag = 1;
        }
        // 8th possibility
        //same as 1st possibility
        r1 = i;
        c1 = j;
        flag = 0;
        r1 = r1 - 2;
        c1++;
        while ( isValidMove(r1, c1) && flag == 0) {
            if ( chess[r1][c1] == 1 ) {
                return true;
            }
            flag = 1;
        }
        //if horse can not cut the bishop in its all possible moves return false
        return false;
    }
    //main method to control enter
    public static void main(String args[]) {
        //To get input from user
        Scanner s = new Scanner(System.in);
        //Intialize and instantiate and declare the array
        //chess board of row length 8 and column length 8
        int[][] chess = new int[8][8];
        //Get the position of bishop and horse from the user
        int r1 = s.nextInt();
        int c1 = s.nextInt();
        int r2 = s.nextInt();
        int c2 = s.nextInt();
        //check for value pair are same
        if ( r1 == r2 && c1 == c2 ) {
            System.out.println(" Both piece can not be placed in same box");
        } else if (!isValidMove(r1, c1) || !isValidMove(r2, c2)) {
            //checks for value is out of range
            System.out.println("Enter the value in the range of 0 to 7");
        } else {//If there is no negative case perform the function
            //intialize the position of the horse as 1
            chess[r1][c1] = 1;
            if (bishopMove(chess, r2, c2)) {//calls the bishopmove function
                System.out.println("Bishop cuts the horse");
            } else {//if return false
                System.out.println("Bishop does not cut the horse");
            }//initialize the bishop as 1 and re intialize the horse as 0 to avoid ambiguity
            chess[r2][c2] = 1;
            chess[r1][c1] = 0;
            if (horseMove(chess, r1, c1)) {//calls the horsemove method
                System.out.println("Horse cuts the bishop");
            } else {
                System.out.println("Horse does not cut the bishop");
            }//finally return the possiblity
        }
        s.close();
    }

}
