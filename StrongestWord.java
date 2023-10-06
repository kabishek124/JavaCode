import java.util.*;

public class StrongestWord {
    
    static boolean isEmpty(String s) {
        //Check for empty string
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                //even a single character is present return false
                return false;
            }
        }
        return true;
    }

    static String toLowerCase(String s) {
        //Empty string to concatinate
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            //Check for uppercase letter
            if (c >= 'A' && c <= 'Z') {
                //conversion
                c = (char) (c + 32);
            }
            res = res + c;
        }
        return res;
    }

    static int compare(String s, String q) {
        String s1 = toLowerCase(s);
        String s2 = toLowerCase(q);
        //store the length of the string
        int l1 = s1.length();
        int l2 = s2.length();
        int l3 = 0;
        //check for minimum length
        if (l1 > l2) {
            l3 = l2;
        } else {
            l3 = l1;
        }
        //run the loop to minimum length
        for (int i = 0; i < l3; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            //if not equal return the ascii value
            if (c1 != c2) {
                return c1 - c2;
            }
        }
        //if all are same return difference between the lengths
        return l1 - l2;
    }

    static void strongestWord(String sentences) {
        //initialize variables to store temporaray and permanent values
        int countS = 0;
        int tempCount = 0;
        String word = "";
        String strongWord = "";
        String tempSword = "";
        String tempHSMPL = "";
        int len = sentences.length();
        //loop for traverse the sentences/paragraph
        for ( int i = 0; i < len-1; i++ ) {
            char ch = sentences.charAt(i);
            if (ch != ' ') {
                //if space occurs we will get a word
                word = word + ch;
            } else if ( ch == ' ' && sentences.charAt(i + 1) != ' ' ) {
                //check the word for strongest word
                for ( int j = 0; j < word.length(); j++ ) {
                    char c = word.charAt(j);
                    //check for "HSMLP" characters
                    if (c == 'H' || c == 'M' || c == 'P' || c == 'L' || c == 'S' ||
                            c == 'h' || c == 'm' || c == 'p' || c == 'l' || c == 's') {
                        tempCount++;//increase the tempCount
                        tempHSMPL = tempHSMPL + c;//keep track of "HSMLP" characters
                    }
                }//store the maximum count
                if ( tempCount > countS ) {
                    countS = tempCount;
                    strongWord = word;
                    tempSword = tempHSMPL;
                } else if ( countS == tempCount && countS != 0 ) {
                    //If two or more words occurs , we have to check for "HLMPS" order
                    int compare = compare( tempHSMPL, tempSword );//give which is greater/lesser
                    if ( compare < 0 ) {
                        countS = tempCount;
                        strongWord = word;
                        tempSword = tempHSMPL;
                    }
                }//re-initialize to original values
                tempCount = 0;
                word = "";
                tempHSMPL = "";
            }
        }//check for no strongest word
        if (countS == 0) {
            System.out.println("There is no strongest word");
        } else {
            System.out.println("The strongest word is:" + " "+strongWord);
        }
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        if (isEmpty(str)) {//check for empty string
            System.out.println("Please enter the valid string");
        } else {
            strongestWord(str);
        }
        s.close();
    }
}
