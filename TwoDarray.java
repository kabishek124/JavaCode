import java.util.Scanner;

public class TwoDarray {
    static void printArray(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void multiply(int a[][], int b[][]) {
        int r1 = a.length;
        //int c1 = a[0].length;
        int r2 = b.length;
        int c2 = b[0].length;
        int c[][] = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < r2; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
    }

    static void zeroRep1(int a[][]) {
        int o = 0;
        int e = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == 0) {
                    o = i;
                    e = j;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == o || j == e) {
                    a[i][j] = 0;
                }
            }
        }
        printArray(a);
    }

    static void zeroRep2(int a[][]) {
        int[] a1 = new int[a.length];
        int[] a2 = new int[a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == 0) {
                    a1[i] = 1;
                    a2[j] = 1;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a1[i] == 1 || a2[j] == 1) {
                    a[i][j] = 0;
                }
            }
        }
        printArray(a);
    }

    static void pattern(int a[][]) {
        for (int i = 0; i < 4; i++) {
            for (int j = i; j >= 0; j--) {
                System.out.print(a[i - j][j] + " ");
            }
            System.out.println();
        }
        int k = 0;
        for (int i = 0; i < 4; i++) {
            k = i;
            for (int j = 4; j >= i + 1; j--) {
                System.out.print(a[k++][j] + " ");
            }
            System.out.println();
        }
    }

    static void missingelementinTwoD(int a[][]) {
        int difference;
        for (int i = 0; i < a.length; i++) {
            int h=a[i][1]-a[i][0];
            difference=h;
            int j = 0;
            int s = a[i][0];
            int e = a[i][a[i].length - 1];
            for (int l = s; l <= e; l += difference) {
                if (a[i][j] == l) {
                    j++;
                } else {
                    System.out.print(l + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = s.nextInt();
            }
        }
        // int l=s.nextInt();
        // int k=s.nextInt();
        // int b[][]=new int[l][k];
        // for(int i=0;i<l;i++){
        // for(int j=0;j<k;j++){
        // b[i][j]=s.nextInt();
        // }
        // }
        //missingelementinTwoD(a);
        zeroRep2(a);
        s.close();
    }
}
