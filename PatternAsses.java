import java.util.Scanner;

public class PatternAsses {
    //function for pattern to print
    static void pattern( int n ) {
        //Pattern for upside triangle
        int count = 0; //Initialize count variable to print
        for ( int i = 0; i < n; i++ ) {
            if ( i % 2 == 0 ) { //check for even or odd index
                //If even calculate i plus one square and subtract one from it
                count = (i + 1) * (i + 1) - 1;
            } else {
                //if odd calculate i plus one square and add one to it
                count = (i + 1) * (i + 1) + 1;
            }
            for ( int k = 0; k < n - i - 1; k++ ) {//k loop for spacing
                System.out.print("  ");
            }
            for ( int j = 0; j < (i * 2) + 1; j++ ) {//j loop for printing
                //Check for mid position
                if ( j < i ) {
                    System.out.print(count + " ");
                    count = count - ( i + 1 );
                } else {   // upgrade the count value
                    System.out.print(count + " ");
                    count = count + ( i + 1 );
                }
            }
            System.out.println();// for control to come next line
        }
        // Pattern for downside triangle
        for ( int i = n - 2; i >= 0; i-- ) {// i loop for row printing
            if ( i % 2 == 0 ) {
                //If even calculate i plus one square and subtract one from it
                count = (i + 1) * (i + 1) - 1;
            } else {
                //if odd calculate i plus one square and add one to it
                count = (i + 1) * (i + 1) + 1;
            }
            for ( int k = n - i - 1; k > 0; k-- ) {//For space printing
                System.out.print(" ");
            }
            for ( int j = i * 2 + 1; j > 0; j-- ) {
                //check for mid position
                if ( j > i + 1 ) {
                    System.out.print( count + " " );
                    count = count - ( i + 1 );
                } else {
                    System.out.print( count + " " );
                    count = count + ( i + 1 );
                }
            }
            System.out.println();
        }
    }
//Main method where program starts
    public static void main(String args[]) {
        //To get input from user
        Scanner s = new Scanner(System.in);
        //Size of pattern  
        int n = s.nextInt();
        //calling the method
        pattern(n);
        s.close();
    }
}
