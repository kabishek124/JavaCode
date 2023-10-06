import java.util.Scanner;
public class Patterns {

    static void patternrevrse( int n ){
        int number=0;
        for (int i = 1; i <= n; i++) {
            number = number+i;
            int temp=number;
            for (int j = 1; j <= i; j++) {
                System.out.print(temp-- + " ");
            }
            System.out.println();
        }
    }

    static void pattern2( int n ){
        //int counter=1;
        int count=1;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                int temp=i+count-1;
                for(int j=1;j<=i;j++){
                    System.out.print( temp + " ");
                    temp--;
                    count++;
                }
            }else{
                for(int j=1;j<=i;j++){
                    System.out.print( count + " ");
                    count++;
                }
            }
            System.out.println();
        }
    }

    static void pattern3( int n ){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j*5 + " ");
            }
            System.out.println();
        }
    }
    
    static void pattern4( int n ){
        int c=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(c++ +" ");
            }
            System.out.println();
        }
    }
    
    static void pattern5( int n ){
        // int c=1;
        // int d=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                for(int j=1;j<=i;j++){
                    System.out.print(j%2 + " ");
                }
            }else {
                int a=1;
                for(int j=1;j<=i;j++){
                    if(j%2==0){
                        a=1;
                    }else{
                        a=0;
                    }
                    System.out.print(a + " ");
                }
                
            }
            System.out.println();
        }
    }

    static void downPyramid( int n ){
        for(int i=n;i>=1;i--){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for( int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    static void upPyramid( int n ){
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(j==i || i==n || j==1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }
    }
    
    static void sideTriangle( int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for( int i=n-1;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    static void diamond( int n ){
        for(int i=1;i<=n-1;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=i*2-1;j++){
                    System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=n;i>=1;i--){
            for(int k=1;k<=n-i;k++){
                System.out.print("  ");
            }
            for( int j=1;j<=i*2-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }  
    
    static void plus( int n ){
        int temp=1;
        if( n%2==0){
            temp= n/2;
        }else{
            temp=n/2+1;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==temp|| j== temp){
                    System.out.print("+ ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

    }
    
    static void virtualPascal( int n ){
        
        for (int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print("  ");
            }
            int count=1;
            for(int j=1;j<=i*2-1;j++){
                if(j<i){
                    System.out.print(count++ +" ");
                }else{
                    System.out.print(count-- +" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        virtualPascal( n );
        s.close();
    }
}
