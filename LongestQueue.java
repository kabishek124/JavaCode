import java.util.Scanner;

public class LongestQueue {
    static int consecutiveones( int[] arr ) {
        //initialize value to zero
        int consecutiveone = 0;
        int res = 0;
        for ( int i = 0; i < arr.length - 1; i++ ) {
            //check for consecutive one
            if ( arr[i] == 1 && arr[i + 1] == 1 ) {
                consecutiveone++;
            } else {//if not consecutive check for greatest length
                if ( consecutiveone > res ) {
                    res = consecutiveone;
                }
            }
        }//to store last consecutive length
        //because it wont come inside else condition
        if ( consecutiveone > res ) {
            res = consecutiveone;
        }
        return res;
    }

    static int longestQueue( int arr[], int m ) {
        int n = arr.length;
        int count = 0;//to track m spells
        int resCount = consecutiveones(arr);//store initial consecutive one length
        for ( int i = 0; i < n; i++ ) {
            if (arr[i] == 0) {
                arr[i] = 1;//change female to male
                count++;//upto spells
            }//check one by one spells
            else if ( count <= m && count!=0) {//if we use all spells
                int k = consecutiveones(arr);//check for if it is longer
                if ( k > resCount ) {
                    resCount = k;//give it to rescount
                }else{
                    arr[i] = 0;//re intialize to track another possible results
                    count = 0;//only if k is the new longest possible result
                }
                
            }
        }//to traverse the last possible result
        if(count <= m && count!=0){
            int k = consecutiveones(arr);
            if(k>resCount){
                resCount=k;
            }
        }
        if(count>m){//to print the used spells
            System.out.println("Used spell:" +m);
        }else{
            System.out.println(" Used spell" +count);
        }
        return resCount + 1;//final result
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int arr[] = new int[n];
        for ( int i = 0; i < n; i++ ) {
            arr[i] = s.nextInt();
        }
        int res = longestQueue(arr, m);//calling the method
        System.out.println(res);//print the final result
        s.close();
    }
}
