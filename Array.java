import java.util.Arrays;
import java.util.Scanner;

public class Array {
    static void reverse(int[] a) {
        int i = 0;
        int j = a.length - 1;
        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        for (int l = 0; l < a.length; l++) {
            System.out.print(a[l] + " ");
        }
    }

    static void sortDesc(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int l = 0; l < a.length; l++) {
            System.out.print(a[l] + " ");
        }
    }

    static void averageSum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        int avg = sum / a.length;
        System.out.println(avg);
    }

    static void duplicateRemove(int[] a) {
        int count = 1;// int unique=0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(a[i] + " ");
            }
            count = 1;
        }
        if (count == 1) {
            System.out.print(a[a.length - 1] + " ");
        }

    }

    static void unique(int[] a) {
        int count = 1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j] && i != j) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(a[i] + " ");
            }
            count = 1;
        }
    }

    static void mergeTwo(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        int[] c = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                k++;
                i++;
            } else {
                c[k] = b[j];
                k++;
                j++;
            }
        }
        while (i < a.length) {
            c[k++] = a[i++];
        }
        while (j < b.length) {
            c[k++] = b[j++];
        }
        duplicateRemove(c);
        // for(int l=0;l<c.length;l++){
        // System.out.print(c[l] + " ");
        // }
    }

    static void duplicate(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.print(a[i] + " ");
                }
            }
        }
    }

    static void rotation(int[] a) {
        int k = 2;
        for (int i = 0; i < k; i++) {
            int temp = a[0];
            for (int j = 0; j < a.length - 1; j++) {
                a[j] = a[j + 1];
            }
            a[a.length - 1] = temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    static void intersection(int a[], int b[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    System.out.print(a[i] + " ");
                }
            }
        }
    }

    static void productSelf(int[] a) {
        long pro = 1;
        for (int i = 0; i < a.length; i++) {
            pro = pro * a[i];
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(pro / a[i] + " ");
        }
    }

    static void missingElement(int[] a) {
        // int sum1=0;
        // for(int i=0;i<a.length;i++){
        // sum1=sum1+a[i];
        // }
        // int n=a.length+1;
        // int sum2=n*(n+1)/2;
        int s = a[0];
        int e = a[a.length - 1];
        // int sum2=0;
        int j = 0;
        for (int i = s; i <= e; i++) {
            if (a[j] == i) {
                j++;
            } else {
                System.out.print(i + " ");
            }
        }
        // System.out.print(sum2-sum1);
    }

    static void majorityElement(int[] a) {
        int k = a.length / 2;
        int count = 1;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            if (count == k) {
                System.out.print(a[i] + " ");
            }
            count = 1;
        }
    }

    static void zerosoneS(int[] a) {
        int zero = 0;
        int one = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                one++;
            } else if (a[i] == 0) {
                zero++;
            }
        }
        if (one == 0) {
            System.out.print("Number of 1's:" + "Not available");
        } else if (zero == 0) {
            System.out.print("Number of 0's:" + "Not available");
        } else {
            System.out.print("Number of 1's:" + one);
            System.out.print("Number of 0's:" + zero);
        }
    }

    static void longrepeated1(int[] a) {
        int count = 1;
        int cMax = 1;
        int res = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) {
                count++;
            } else {
                if (count > cMax) {
                    cMax = count;
                    res = i;
                }
                count = 1;
            }
        }
        System.out.print(a[res]);
    }

    static void consecutive(int[] a) {
        int ei = 0;
        int si = 0;
        int s = 0;
        int e = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1] - 1) {
                ei++;
            } else {
                if ((ei - si) > (e - s)) {
                    s = si;
                    e = ei;
                }
                si = i + 1;
                ei = i + 1;
            }
        }
        if ((ei - si) > (e - s)) {
            s = si;
            e = ei;
        }

        int len = e - s + 1;
        System.out.println(" Length of the longest consecutive sequence:" + len);
        for (int i = s; i <= e; i++) {
            System.out.print(a[i] + " ");
        }
    }

    static void rearrangeAlter(int[] a, int n) {
        // Clone the array
        int temp[] = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = a[i];
        }
        // Intialize s snd l for to traverse
        int s = 0;
        int l = n - 1;
        // Intialize flag to perform one function at an iteration
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            if (flag) {
                a[i] = temp[l--];
            } else {
                a[i] = temp[s++];
            }
            flag = !flag;
        }
        // Print the modified array
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    static int sumOfArray(int a[]) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return sum;
    }

    static int swapSum(int a[], int b[]) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                int temp = a[i];
                a[i] = b[j];
                b[j] = temp;
                count++;
                // System.out.println(sumOfArray(a));
                // System.out.println(sumOfArray(b));
                if (sumOfArray(a) == sumOfArray(b)) {
                    // System.out.println("Ki");
                    return count;
                } else {
                    int temp1 = b[j];
                    b[j] = a[i];
                    a[i] = temp1;
                    count--;
                }
            }
        }
        return count;
    }

    static int equilibrium(int a[]) {
        for (int i = 1; i < a.length; i++) {
            int leftSum = 0;
            int rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum = leftSum + a[j];
            }

            for (int k = i + 1; k < a.length; k++) {
                rightSum = rightSum + a[k];
            }

            if (leftSum == rightSum) {
                return i + 1;
            }
        }
        return -1;
    }

    static void lastsumGame(int a[]) {
        int count = 1;
        int tracker = 0;
        for ( int i = 0; i < a.length - 1; i++ ) {
            for ( int j = i + 1; j < a.length; j++ ) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            if ( count > 2 ) {
                // System.out.println(a[i]);
                tracker++;
            }
            count = 1;
        }
        if ( tracker == 2 ) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        // int m=s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        // int []b=new int[m];
        // for(int i=0;i<m;i++){
        // b[i]=s.nextInt();
        // }
        // mergeTwo(a,b);
        // rotation(a);
        // intersection(a, b);
        // duplicateRemove(a);
        // missingElement(a);
        // majorityElement(a);
        // rearrangeAlter(a, n);
        // System.out.println(equilibrium(a));
        lastsumGame(a);
        s.close();
    }
}
