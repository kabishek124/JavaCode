public class Sudoku {
    static void fillArray( boolean temp[]){
        for( int i=0;i<temp.length;i++){
            temp[i]=false;
        }
    }

    static boolean validation( int [][]a , int n , int m){
        boolean temp[]=new boolean[ n+1];
        //Check for row
        for(int i=0;i<n;i++){
            fillArray(temp);
            for(int j=0;j<m;j++){
                int z= a[i][j];
                if(temp[z]){
                    return false;
                }
                temp[z]=true;
            }
        }

        //Check for column
        for(int i=0;i<n;i++){
            fillArray(temp);
            for(int j=0;j<m;j++){
                int y=a[j][i];
                if(temp[y]){
                    return false;
                }
                temp[y]=true;
            }
        }

        //Check for blocks
        //fillArray(temp);
        //Traverse corresponding blocks
        for( int i=0;i<n-2;i+=3){
            for(int j=0;j<n-2;j+=3){
                fillArray(temp);
                //traverse the blocks
                for(int l=i;l<i+3;l++){
                    for(int k=j;k<j+3;k++){
                        int x=a[l][k];
                        if(temp[x]){
                            return false;
                        }
                        temp[x]=true;
                    }
                }
            }
        }
        //if satisfies all condition return true;
        return true;
    }

    public static void main (String args[]){
        int[][]a= { { 7, 9, 2, 1, 5, 4, 3, 8, 6 },
                    { 6, 4, 3, 8, 2, 7, 1, 5, 9 },
                    { 8, 5, 1, 3, 9, 6, 7, 2, 4 },
                    { 2, 6, 5, 9, 7, 3, 8, 4, 1 },
                    { 4, 8, 9, 5, 6, 1, 2, 7, 3 },
                    { 3, 1, 7, 4, 8, 2, 9, 6, 5 },
                    { 1, 3, 6, 7, 4, 8, 5, 9, 2 }, 
                    { 9, 7, 4, 2, 1, 5, 6, 3, 8 },
                    { 5, 2, 8, 6, 3, 9, 4, 1, 7 } };
        // int [][]a={ {2,1,3,4},
        //             {4,3,1,2},
        //             {3,2,4,1},
        //             {1,4,2,3}};
        int n=a.length;
        int m=a[0].length;            
        //Check for valid
        if(validation(a,n,m)){
            System.out.println("Sudoku is valid");
        }else{
            System.out.println("Suduko is not valid");
        }
    }
}
