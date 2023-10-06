import java.util.Scanner;

public class AscendingCheck {
    static boolean colCheck( int [][]a){
        int i=0;
        while(i<a[0].length){
            for(int column =0;column<a.length-1;column++){
                if(a[column][i] > a[column+1][i]){
                    return false;
                }
            }
            i++;
        }
        return true;
    }

    static boolean rowCheck( int [][]a){
        int j=0;
        while(j<a.length){
            for(int row=0;row<a[0].length-1;row++){
                if(a[j][row] > a[j][row+1]){
                    return false;
                }
            }
            j++;
        }
        return true;
    }

    static void rearrange( int [][]a){ 
        int i=0;
        while(i<a[0].length){
            for(int column =0;column<a.length-1;column++){
                for(int j=column+1;j<a.length;j++){
                    if(a[column][i] > a[j][i]){
                        int temp=a[column][i];
                        a[column][i]=a[j][i];
                        a[j][i]=temp;
                    } 
                }
            }
            i++;    
        }
        for(int l=0;l<a.length;l++){
            for(int j=0;j<a[l].length;j++){
                System.out.print(a[l][j] +" ");
            }
            System.out.println();
        } 
    }
    
    static boolean validation ( int [][]a){
        rearrange(a);
        if(rowCheck(a)){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=s.nextInt();
            }
        } 
        System.out.println(validation(a));
s.close();
    }
}
