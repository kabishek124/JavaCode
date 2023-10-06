import java.util.Arrays;
import java.util.Scanner;

public class SecondMostOccured {
    static void secondMostOccured( int [] a , int k ){
        int count=1;
        //int si=0;
        int temp[]=new int[a.length];
        int counter=0;
        // int s=0;
        // int e=0;
        for(int i=0;i<a.length-1;i++){
            int ei=-1;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                    ei=j;
                }
            }
            if(count==k&&ei>0){
                //si=i;
                temp[counter++]=ei;
            }
            count=1;
        }
        Arrays.sort(temp);
        for(int i=0;i<temp.length;i++){
            System.out.print(temp[i]);
        }
        System.out.print(a[temp[1]]);
    }

    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []a=new int[n];
        int k=s.nextInt();
        for(int i=0;i<a.length;i++){
            a[i]=s.nextInt();
        }
        
        secondMostOccured(a, k);
        s.close();
    }
}
