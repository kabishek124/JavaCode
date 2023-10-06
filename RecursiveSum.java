import java.util.*;
public class RecursiveSum {
    static int recursiveSum(int n ){
        if(n<0){
            System.out.println("Enter positive value");
            return 0;
        }
        String s =Integer.toString(n);
        String temp="";
        String temp2="";
        int i=0;
        if(s.length()%2==0){
            while(i<s.length()/2){
                temp=temp+s.charAt(i);
                i++;
            }
        }else{
            while(i<s.length()/2+1){
                temp=temp+s.charAt(i);
                i++;
            }
        }
        while(i<s.length()){
            temp2=temp2+s.charAt(i);
            i++;
        }
            

        long res1=Long.parseLong(temp);
        long res2=Long.parseLong(temp2);
        System.out.println(res1);
        System.out.println(res2);
        int out=process(res1);
        int out2=process(res2);
        System.out.println(out);
        System.out.println(out2);
        return recursiveSum(out) + recursiveSum(out2);
    }

    static int process(long res){
        long sum=0;
        while(res>0 || sum>9){
            if(res==0){
                res=sum;
                sum=0;
            }
            
            sum=sum+res%10;
            res=res/10;
        }
        return (int)sum;
    }
  
    // static int process2(int res){
    //     if(res< 10){
    //         return res;
    //     }else{
    //         int sum=1;
    //         while(res>0){
    //             int digit=res%10;
    //             if(digit!=0){
    //                 sum=sum*digit;
    //             }
    //             res=res/10;
    //         }
    //         return process2(sum);
    //     }
    // }

    public static void main(String args []){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        //int k=s.nextInt();
        //long res=recursiveSum(n);
        System.out.println("Sum is:" +process(n));
        // int res=0;
        // for(int i=0;i<k;i++){
        //     int res1= process2(n);
        //     res=res*res1;
        // }
        //System.out.println(process2(n));
        s.close();
    }

}
