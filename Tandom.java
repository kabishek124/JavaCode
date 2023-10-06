import java.util.*;

public class Tandom {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        //s.close();
        //int n=s.nextInt();
        //for(int i=1;i<=n-5;i++){
            Random r=new Random();
            int res=0;
            for(int i=0;i<10;i++){
                res=r.nextInt(1,6);
                System.out.println(res);
            }
            // if(i==1){
            //     if(res<=5&&res>=10){
            //         System.out.println(res);
            //     }else{
            //         System.out.println(res);
            //     }
            // }else{
            //     System.out.println(res);
            // }
        //}
        s.close();
    }
}
