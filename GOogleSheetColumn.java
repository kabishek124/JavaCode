import java.util.Scanner;

public class GOogleSheetColumn {
    static int columnNo( String s){
        int res=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) >= 'A' && s.charAt(i) <='Z'){
                res=res*26;
                res=res+s.charAt(i)-'A'+1; 
            }else{
                return -1;
            } 
        }
        return res ;
    }

    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        String str=s.next();
        if(columnNo(str)!=-1){
            System.out.println(columnNo(str));
        }else{
            System.out.println("Error");
        }
        s.close();
    }
}
