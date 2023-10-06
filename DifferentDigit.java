import java.util.Scanner;

public class DifferentDigit {
    static boolean isDifferent(int num) {
        // conver the number to string
        String number = Integer.toString(num);
        int len = number.length();
        for ( int i = 0; i < len - 1; i++ ) {
            for ( int j = i + 1; j < len; j++ ) {
                // if there is any one repeated elemnts return false
                if ( number.charAt(i) == number.charAt(j) ) {
                    return false;
                }
            }
        }
        return true;
    }

    // Main process
    static void process(int start, int end) {
        // if both are same
        if ( start == end ) {
            if ( isDifferent(start) ) {
                System.out.println(start);
            } else {
                System.out.println("There is no different number");
            }
        } else if (start < end) {// if start is lesser than end traverse the loop normally
            for ( int i = start; i <= end; i++ ) {
                if (i < 0) {// if negative number
                    i = i * (-1);// convert to postive
                    if ( isDifferent(i) ) {
                        System.out.print(i * (-1) + " ");// then convert to negative
                        i = i * (-1);// reinitialize to original form
                    }
                } else {
                    if ( isDifferent(i) ) {// for positivecase
                        System.out.print(i + " ");
                    }
                }
            }
        } else if ( start > end ) {
            // we have to run loop reversely
            for ( int j = start; j >= end; j-- ) {
                // same procedure
                if (j < 0) {
                    j = j * (-1);
                    if ( isDifferent(j) ) {
                        System.out.print(j * (-1) + " ");
                        j = j * (-1);
                    }
                } else {
                    if ( isDifferent(j) ) {
                        System.out.print(j + " ");
                    }
                }
            }
        }
    }

    public static void main(String arge[]) {
        Scanner s = new Scanner(System.in);
        int start = s.nextInt();
        int end = s.nextInt();
        process(start, end);// call the method to print different digits
        s.close();
    }

}
