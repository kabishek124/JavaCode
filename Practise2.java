import java.util.*;
public class Practise2{
    static void sMax( int[] a ){
        int max = a[0];
        int sMax = a[1];
        //int tmax = 0;
        for ( int i=0 ; i< a.length ; i++){
            if( a[i] > max){
                sMax = max;
                max =  a[i];
            }else if ( a[i] > sMax && a[i] != max){
                //tmax=sMax;
                sMax = a[i];
            }
        }
        if( max == sMax){
            System.out.println("The first largest number is:" + max);
            System.out.println("The scond maximum number is not available");
        }else{
            System.out.println("The first largest number is:" + max);
            System.out.println("The second maximum number is :" + sMax);
        }
        //System.out.println("The second maximum number is :" + tmax);
    }


    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        int []a =new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        sMax(a);
        s.close();
    }
}