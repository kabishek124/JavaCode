import java.util.Scanner;

public class Square {
    static Scanner s = new Scanner(System.in);
    static int n = s.nextInt();
    static int[][] a = new int[n][n];

    static int isValid(int num) {
        if (num >= n) {
            num = num - n;
            return num;
        } else if (num < 0) {
            num = num + n;
            return num;
        }else{
            return num;
        }
        
    }

    static void process(int[][] a) {
        int mid = n / 2;
        int i = mid;
        int j = mid;
        int count = 1;
        while (count < n * n + 1) {
            i = isValid(i);
            j = isValid(j);
            //Check for occupied
            if (a[i][j] != 0) {
                //If occupied go to down box
                i++;
                i = isValid(i);
                a[i][j] = count++;
            } else {
                //So the box is empty
                a[i][j] = count++;
            }
            //Movement of the pointer 'L' shape
            i--;
            j++;
            int t1 = isValid(i);
            int t2 = isValid(j);
            //to check whether the occupied value down hAS VALUE SO we hav to place that in corresponding box down
            if (a[t1][t2] != 0) {
                i++;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        process(a);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
