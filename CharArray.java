import java.util.Arrays;
import java.util.Scanner;

public class CharArray {
    static char[] alphabet = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
            'S', 'T',
            'U', 'V', 'W', 'X', 'Y', 'Z' };

    static java.lang.String toString(char[] c) {
        java.lang.String s = "";
        for (int i = 0; i < c.length; i++) {
            s = s + c[i];
        }
        return s;
    }

    static char[] charArray(String s) {
        char[] c = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            c[i] = s.charAt(i);
        }
        return c;
    }

    static int compareTo(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();
        int l3 = 0;
        if (l1 > l2) {
            l3 = l2;
        } else {
            l3 = l1;
        }
        for (int i = 0; i < l3; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if (c1 != c2) {
                return c1 - c2;
            }
        }
        return l1 - l2;
    }

    static void toLowerCase(String s) {
        char c[] = charArray(s);
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                c[i] = (char) ((int) s.charAt(i) + 32);
            }
        }
        String res = toString(c);
        System.out.println(res);
    }

    static void mergeTwo(char[] a, char[] b, int r1, int r2) {
        for (int i = 0; i < r1; i++) {
            // int flag =1;
            for (int j = 0; j < r2; j++) {
                if (a[i] > b[j]) {
                    char temp = a[i];
                    a[i] = b[j];
                    b[j] = temp;
                    // flag=0;
                }
            }
        }
        for (int i = 0; i < r1; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        Arrays.sort(b);
        for (int i = 0; i < r2; i++) {
            System.out.print(b[i] + " ");
        }
    }

    static void duplicateChar(char[] a, int r1) {
        for (int i = 0; i < r1 - 1; i++) {
            for (int j = i + 1; j < r1; j++) {
                if (a[i] == a[j]) {
                    System.out.print(a[i] + " ");
                }
            }
        }
    }

    static void missingChar(char[] a, int r1) {
        int i = 0;
        while (i < r1) {
            if (a[i] != alphabet[i]) {
                System.out.println(alphabet[i]);
            }
            i++;
        }
    }

    static void lcs(String s1, String s2) {
        int count = 0;
        String subStr = "";
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    int tempCount = 0;
                    String tempSubStr = "";
                    int k = i;
                    int l = j;
                    while (s1.charAt(k) == s2.charAt(l) && k < s1.length() && l < s2.length()) {
                        tempSubStr += s1.charAt(k);
                        tempCount++;
                        k++;
                        l++;
                    }
                    if (tempCount > count) {
                        count = tempCount;
                        subStr = tempSubStr;
                    }
                }
            }
        }
        System.out.println(count);
        System.out.println(subStr);
    }

    static void compressedSpace(String s) {
        String encode = "";
        String decode = "";
        // For encode
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == ' ' && s.charAt(i + 1) == ' ') {
                encode += ' ';
                i++;
            } else {
                encode += s.charAt(i);
            }
        }
        // As we check for i+1 index so last element will be neglected so to store last
        // element
        // This line is implemented
        encode += s.charAt(s.length() - 1);
        System.out.println("Encode:" + encode);
        // For decode
        for (int i = 0; i < encode.length(); i++) {
            if (encode.charAt(i) == ' ') {
                decode += ' ';
            } else {
                decode = decode + s.charAt(i);
            }
        }
        System.out.println("Decode:" + decode);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // int n=s.nextInt();
        // //int m=s.nextInt();
        // char []a=new char[n];
        // //char []b=new char[m];
        // for(int i=0;i<n;i++){
        // a[i]=s.next().charAt(0);
        // }
        // for(int i=0;i<m;i++){
        // b[i]=s.next().charAt(0);
        // }
        // mergeTwo(a, b, n, m);
        // String str1 = s.next();
        String str2 = s.nextLine();
        compressedSpace(str2);
        s.close();
    }
}
