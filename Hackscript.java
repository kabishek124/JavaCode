import java.util.*;
import java.util.regex.Pattern;
public class Hackscript {
    //Check for blank statement
    static boolean blankSatement(String s){
        for(int i=0;i<s.length();){
            if(s.charAt(i)!=' ');
            return false;
        }
        return true;
    }

    //Check for comments
    static boolean comment(String s){
        for(int i=0;i<s.length()-2;i++){
            if(s.charAt(i)=='?' && s.charAt(i+1)=='?' && s.charAt(i+2)=='?'){
                return true;
            }
        }
        return false;
    }

    //Check for operators
    static boolean operators(String s){
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(c==':' || c=='_' || c=='^' || c=='@' || c=='~'){
                return true;
            }
        }
        return false;
    }

    //Check for keywords
    static boolean keywords(String s){
        if(s=="take" || s=="banish"){
            return true;
        }
        return false;
    }
    
    //Check for separators
    static boolean separators(String s){
        if(Pattern.matches("[/^<--.*-->$/]" , s)){
            return true;
        }
        return false;
        // if(s=="<--" || s1=="-->"){
        //     return true;
        // }
        // return false;

    }
    
    //Check for identifiers
    static boolean identifiers(String s){
        // if(Pattern.matches("[a-zA-Z]?" , s)){
        //     return true;
        // }
        // return false;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) >= '0' && s.charAt(i) <='9'){
                count++;
            }
        }
        if(count==s.length()){
            return false;
        }
        return true;
    }
    
    static boolean process(String s) {
        if(blankSatement(s)){
            return false;
        }
        if(comment(s)){
            System.out.println("It is a comment");
            return false;
        }
        StringTokenizer st=new StringTokenizer(s);
        boolean flag=false;
        while(st.hasMoreTokens()){
            //System.out.println(st.nextToken());
            String t1=st.nextToken();
            flag=false;
            if(operators(t1) || keywords(t1) || identifiers(t1) || separators(t1)){
                flag=true;
            }
        }
        return flag;
    }
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        //System.out.println(identifiers(str));
        if(process(str)){
            System.out.println("VAlid syntax");
        }else{
            System.out.println("Invalid syntax");
        }
        s.close();
    }
}
