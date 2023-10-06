import java.util.Scanner;
public class Forloop {

    static void process(int n) {
        int sum = 0;
        int out1 = (n * (n + 1)) / 2;
        int res1 = out1 * out1;
        for (int i = 1; i <= n; i++) {
            sum = sum + i * i;
        }
        int res = res1 - sum;
        System.out.println(res);
    }

    static void sequenceSum(int a[], int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                a[j] = a[j] + a[j + 1];
            }
        }
        int sum = a[0];
        System.out.println(sum);
    }

    static void common(int[] a, int[] b) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            boolean temp = true;
            for (int j = 0; j < b.length && temp == true; j++) {
                if (a[i] == b[j]) {
                    temp = false;
                }
            }
            if (temp) {
                System.out.print(a[i] + " ");
                count++;
            }

        }
        if (count == 0) {
            System.out.println("false");
        }
    }

    static void game(int n, int m) {
        // int j = 40;
        for (int i = n, j = m; i <= m && i >= n; i = i + 10, j = j - 10) {
            System.out.print(i + " ");
            System.out.print(j + " ");
            // j=j-10;
        }
    }

    static void game1(int n, int m) {
        for (int i = n; i <= m; i = i * 10 + 1) {
            System.out.print(i + "0" + i + " ");
        }
    }

    static void game2(int n, int m) {
        for (int i = n; i <= m; i += 10) {
            System.out.print(i + " ");
        }
    }

    static void game3(int n, int m) {
        for (int i = n; i <= m; i += 81) {
            System.out.print(+i + " ");
        }
    }

    static int count_one( int n ) {
        //Intialize count_one to keep track of setbits
        int count_one = 1;
        while ( n > 1 ) {
            if ( n == 1 ) {
                count_one++;
            }
            int set_bits = n % 2;
            n = n / 2;
            if ( set_bits == 1 ) {
                count_one++;
            }
            //Below mentioned method is another method for finding setbits
            // n = n & (n-1);
            // count_one++;
        }
        return count_one;
    }

    static void setBits( int n ) {
        //run the for loop N times and call the count_one method for each i
        int count = 0;
        for ( int i = 1; i <= n; i++ ) {
            count = count + count_one(i);
        }
        System.out.println( count );
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        // int m = s.nextInt();
        // int []a =new int[n];
        // for(int i=0;i<n;i++){
        // a[i]=s.nextInt();
        // }
        // int []b =new int[m];
        // for(int i=0;i<m;i++){
        // b[i]=s.nextInt();
        // }
        setBits(n);

        s.close();
    }
}
