import java.util.Scanner;

public class SudokuSolver {
    static Scanner s = new Scanner(System.in);
    // static int n=s.nextInt();
    static int n = 9;
    // static int a[][]=new int[n][n];
    static int[][] a = {
            { 1, 0, 0, 0, 0, 0, 8, 0, 0 },
            { 0, 0, 0, 0, 6, 0, 0, 0, 0 },
            { 0, 0, 7, 0, 0, 2, 0, 0, 6 },
            { 8, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 2, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 3, 0, 0 },
            { 0, 5, 0, 0, 0, 1, 0, 0, 0 },
            { 0, 6, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 9 } };

    static boolean rowCheck(int row, int column, int value) {
        for (int i = 0; i < n; i++) {
            if (a[row][i] == value) {
                return false;
            }
        }
        return true;
    }

    static boolean columnCheck(int row, int column, int value) {
        for (int i = 0; i < n; i++) {
            if (a[i][column] == value) {
                return false;
            }
        }
        return true;
    }

    static int squareRoot(int n) {
        for (int i = 1; i <= n; i++) {
            if (i * i == n) {
                return i;
            }
        }
        return -1;
    }

    static int rowGridTracker(int row) {
        int temp = n;
        int sNum = squareRoot(n);
        int xTemp = row;
        while (temp > 0) {
            temp = temp - sNum;
            row = xTemp;
            for (int i = 1; i <= sNum; i++) {
                if (row == temp) {
                    return row;
                } else {
                    row--;
                }
            }
        }
        return -1;
    }

    static int columnGridTracker(int column) {
        int temp = n;
        int sNum = squareRoot(n);
        int xTemp = column;
        while (temp > 0) {
            temp = temp - sNum;
            column = xTemp;
            for (int i = 1; i <= sNum; i++) {
                if (column == temp) {
                    return column;
                } else {
                    column--;
                }
            }
        }
        return -1;
    }

    static boolean gridCheck(int row, int column, int value) {
        int sr = rowGridTracker(row);
        int cr = columnGridTracker(column);
        for (int i = sr; i < sr + squareRoot(n); i++) {
            for (int j = cr; j < cr + squareRoot(n); j++) {
                if (value == a[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter row and column between 0 to 8");
        System.out.println("Enter the row and column ");
        int row = s.nextInt();
        int column = s.nextInt(); 
        System.out.println("Please enter the value range between 1 to 9");
        System.out.println("Enter the value to be stored");
        int value = s.nextInt();
        if (rowCheck(row, column, value) && columnCheck(row, column, value)
                && gridCheck(row, column, value)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
        s.close();
    }
}
