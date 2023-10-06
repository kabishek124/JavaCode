import java.util.Scanner;

public class SpiralPattern {
    static void pattern(int [][]a , int n){
        int value=n*n;
        int k=0;
        int l=a.length-1;
        int i;
        int j;
        int i1=0;
        int j1=n-1;
        int j2=0;
        int i2=n-1;
        while(k<=l){
            //first row 
            for( j=j2;j<=j1;j++){
               a[i1][j]= value--;
            }
            i1++;
            //last column
            for(i=i1;i<=i2;i++){
                a[i][j1]=value--;
            }
            j1--;
            //last row
            for(j=j1;j>=j2;j--){
                a[i2][j]=value--;
            }
            i2--;
            //first row
            for(i=i2;i>=i1;i--){
                a[i][j2]=value--;
            }
            j2++;
            k++;
            l--;
        }
        for(int q=0;q<n;q++){
            for(int w=0;w<n;w++){
                System.out.print(a[q][w]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String []args){
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int [][]a=new int[n][n];
        pattern(a,n);
        s.close();
    }
}
