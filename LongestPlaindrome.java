import java.util.Scanner;

public class LongestPlaindrome {
    //check for palindrome
    static boolean isPalindrome(String s) {
        //pointers from start index to last index
        int i = 0;
        int j = s.length() - 1;
        while ( i < j ) {
            if ( s.charAt(i) != s.charAt(j) ) {//if not equal return false
                return false;
            }
            i++;
            j--;
        }//elsereturn true
        return true;
    }

    static void longestPalindrome( int n ){
        //check for negative numbers
        if(n<0){
            n=n*(-1);//convert to positive numbers
        }//convert integers to string
        String number=Integer.toString(n);
        int len=number.length();
        if(len==1){//if length is 1 return the same string
            System.out.println("longest palindromic subnumber is:" + number);
        }else{
            String temp="";
            String restemp="";
            int longest=0;//track the lenght of the subnumber
            for(int k=1;k<=len;k++){//loop for size determination
                for(int i=0;i<=len-k;i++){//loop for possible sunumbers
                    for(int j=i;j<i+k;j++){//track and print hte subnumbers
                        temp=temp+number.charAt(j);
                    }
                    if(isPalindrome(temp)){
                        if(k>longest){//check for longest
                            longest=k;
                            restemp=temp;
                        }
                    }
                    temp="";//re intialize
                }
                longest=0;
            }
            System.out.println( "longest palindromic subnumber is:"+" "+restemp);
        }
    }
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        longestPalindrome(n);
        s.close();
    }
}
