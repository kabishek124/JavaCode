import java.util.*;
public class Prime {
    static String process(int n){
        if(n==0 || n==1){
            return"Not prime";
        }
        else if(n==2 || n==3){
            return"Prime";
        }
        else if( n%2==0 || n%3==0){ 
            return"Not prime";
        }
        for(int i=5;i*i<=n;i=i+6){
            if(n%i==0 || n%i+2==0){
                return "Not prime";
            }
        }return "Prime";
        
    }
    
    static void printing(int  n){
        if(n<=1){
            System.out.println("Range is invalid");
        }else{
            int start=2;
            for(int i=start;i<=n;i++){
                if(process(i) == "Prime"){
                System.out.print(i+" ");
                }
            }
        }
        
    }
    
    static void firstN(int n){
        if(n<=0){
            System.out.println("Enter the valid number");
        }else{
            int i=2;
            int count=1;
            while(count<=n){
                if(process(i)=="Prime"){
                System.out.print(i+" ");
                count++;
                }
            i++; 
            }
        }
        
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        // String res=process(n);
        // System.out.print(res);
        printing(n);
        //firstN(n);
        s.close();
    }
}
