import java.util.*;
public class Demo2{
    static int[] quadraple(int []a, int sum){
        int st[]=new int[4];
        //sorting the array
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }

        //remove the duplicates
        for(int i=0;i<a.length-3;i++){
            if(a[i]==a[i+1]){
                continue;
            }
            for(int j=i+1;j<a.length-2;j++){
                if(a[j]==a[j+1]){
                    continue;
                }

                //Intialising pointers for another two numbers
                int left=j+1;
                int right=a.length-1;
                while(left<right){
                    long res= (long)(a[i] + a[j] + a[left] + a[right]);
                    if(sum==res){
                        st[0]=a[i];
                        st[1]=a[j];
                        st[2]=a[left];
                        st[3]=a[right];
                        while(left<right && a[left]==a[left+1]){
                            left++;
                        }
                        while(left<right && a[right]==a[right-1]){
                            right--;
                        }
                        left++;
                        right++;
                    }else if(res>sum){
                        right--;
                    }else{
                        left++;
                    }
                }
            }
        }
       return st;

    }
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        // int n=s.nextInt();
        // int[]a=new int[n];
        // for(int i=0;i<n;i++){
        //     a[i]=s.nextInt();
        // }
        // int add=s.nextInt();
        // int [] res=quadraple(a, add);
        // for(int i=0;i<res.length;i++){
        //     System.out.print(res[i] +" ");
        // }
        char c='B';
        int i= (int)(c+1);
        System.out.println(i);
        s.close();
    }
}