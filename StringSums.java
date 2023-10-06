import java.util.Scanner;

public class StringSums {
    static boolean palindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    static String longestPalindromicSubstring(String s) {
        for (int k = s.length() - 1; k > 0; k--) {
            for (int i = 0; i <= s.length() - k; i++) {
                String temp = "";
                for (int j = i; j < i + k; j++) {
                    temp = temp + s.charAt(j);
                }
                if (palindrome(temp)) {
                    return temp;
                }
            }
        }
        return "There is no palindromic substring";
    }

    static void enlargeString(String s, int k) {
        String temp = "";
        String res = "";
        int count = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            // char c=;
            res = res + s.charAt(i);
            if (s.charAt(i) + 1 == s.charAt(i + 1)) {
                count++;
                temp = temp + s.charAt(i) + (s.charAt(i + 1));
                System.out.println(temp);
            } else {
                if (count == k) {
                    res = res + temp;
                    temp = "";
                    count = 1;
                }
                // res=res+c;
            }
        }
        res = res + s.charAt(s.length() - 1);
        if (count == k) {
            res = res + temp;
        }
        System.out.println(res);
    }

    static void dateYearmonthFormat(String s) {
        String temp = "HMS";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                temp = temp + s.charAt(i);
            }
        }
        System.out.println(temp);
    }

    static String registerId(String s) {
        String temp = "";
        if (s.charAt(0) == '0') {
            return "S0001";
        } else {
            String num = "";
            // Separate numbers and characters
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    num = num + s.charAt(i);
                } else {
                    temp = temp + s.charAt(i);
                }
            }
            int n = Integer.parseInt(num);
            if (n > 9998) {
                return "Invalid";
            }
            num = "";
            // Addition of numbers
            n = n + 1;
            num = Integer.toString(n);
            int a = 0;
            int count = 0;
            while (n > 0) {
                a = n % 10;
                count++;
                num = Integer.toString(a) + num;
                n = n / 10;
            }
            // Add zeros to the string
            for (int i = 1; i <= (s.length() - 1 - count); i++) {
                temp = temp + '0';
            }
            // result string
            temp = temp + num;
        }
        return temp;

    }

    static void vowelsAndConso(String input_string) {
        int n = input_string.length();
        int vowels = 0;
        int consonents = 0;
        for (int i = 0; i < n; i++) {
            char ch = input_string.charAt(i);
            // Check for Alphabets
            if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
                // Check for vowels
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    vowels++;
                } else {
                    consonents++;
                }
            }
        }
        System.out.println("Vowels:" + vowels);
        System.out.println("Consonents:" + consonents);
    }

    static void wordCount(String paragraph, int n) {
        int words = 0;
        for (int i = 0; i < n - 1; i++) {
            if (paragraph.charAt(i) == ' ' && paragraph.charAt(i + 1) != ' ') {
                words++;
            }
        }
        if (words > 0) {
            System.out.println(words + 1);
        } else {
            System.out.println(words);
        }
    }

    static void sentenceCount(String paragraph, int n) {
        int sentences = 0;
        for (int i = 0; i < n; i++) {
            if (paragraph.charAt(i) == '.' || paragraph.charAt(i) == '!' || paragraph.charAt(i) == '?') {
                sentences++;
            }
        }
        System.out.println(sentences);
    }

    static char lastUnique( String s ) {
        int n = s.length();
        int count = 1;
        for ( int i = n - 1; i >= 0; i-- ) {
            for ( int j = n - 1; j >= 0; j-- ) {
                if ( s.charAt(i) == s.charAt(j) && i != j ) {
                    count++;
                }
            }
            if ( count == 1 ) {
                return s.charAt(i);
            }
            count = 1;
        }
        return '0';
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        // int n=s.nextInt();
        String str = s.nextLine();
        //int n = str.length();
        // dateYearmonthFormat(str);
        System.out.println(lastUnique(str));
        s.close();
    }
}
