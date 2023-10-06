import java.util.Scanner;

public class LongestDigit {
    //Function for getting count of digits
    static int countDigits( int number ) {
        // Intialize a variable to count he digits
        int countDigit = 0;
        //If and only number is greater than zero go into loop
        while ( number > 0 ) {
            //Separate the last digit
            int digit = number % 10;
            // check for 0,5,9
            if ( digit != 0 && digit != 5 && digit != 9 ) {
                //If not count the digit
                countDigit++;
            }
            //Truncate the last digit
            number = number / 10;
        }
        // return the digit count
        return countDigit;
    }
    //function for getting longestDigit
    static void longestDigit( int[] array, int length ) {
        // Intialize variables for holding longestdigits , length and its position
        int position = 0;
        int longestDigit = 0;
        int count = 0;
        for ( int i = 0; i < length; i++ ) {//Traverse the array from start to its length 
            // pass the array value to the countDigit method for digit counts
            int digitCount = countDigits( array[i] );
            //Check for maximum and also check for duplicate
            if ( digitCount > count && digitCount != count ) {// for to calculate the first
                // appeared longest digit
                count = digitCount;
                longestDigit = array[i];
                position = i;
            }
        }

        if ( count == 0 ) {// If count is zero invalid
            System.out.println("There is no longest digit");
        } else {
            System.out.println("Longest digit is:" + longestDigit + "," + " "
                    + "Its position is:" + position);
        }
    }
    //Main method where program starts
    public static void main( String args[] ) {
        //To get input from user
        Scanner s = new Scanner( System.in );
        //To get the array length
        int length = s.nextInt();
        //Intialize and instantiate and declare the array
        int[] array = new int[length];
        for ( int i = 0; i < length; i++ ) {
            array[i] = s.nextInt();
        }
        //Calling the method
        longestDigit( array, length );
        //to close the scanner
        s.close();
    }
}
