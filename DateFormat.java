import java.util.Scanner;

public class DateFormat {
    static boolean isValid(int date, int month, int year) {
        if (year >= 1900 && year <= 2023) {
            if (month >= 1 && month <= 12) {
                if (date >= 1 && date <= 31) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean leapYear( int date , int month , int year){
        if( isValid(date, month, year)){
            if( year %4==0 && year%400==0 || year%100!=0){
                if( month==2 && date >=1 && date <=29){
                    return true;
                }else if( month <8 && month!=2 && (month%2!=0) && date >=1 && date <=31){
                    return true;
                }else if ( month >=9 && (month%2==0) && date >=1 && date <=31){
                    return true;
                }else if( month <8 && month!=2 && (month%2==0) && date >=1 && date <=30){
                    return true;
                }else if( month >=9 && (month%2!=0) && date >=1 && date <=30){
                    return true;
                }else if( month==8 && date >=1 && date <=31){
                    return true;
                }
            }
        }
        return false;
    }

    static boolean notLeapYear( int date ,int month , int year){
        if(isValid(date, month, year)){
            if( month==2 && date >=1 && date <=29){
                return true;
            }else if( month <8 && month!=2 && (month%2!=0) && date >=1 && date <=31){
                return true;
            }else if ( month >=9 && (month%2==0) && date >=1 && date <=31){
                return true;
            }else if ( month <8 && month!=2 && (month%2==0) && date >=1 && date <=30 ){
                return true;
            }else if( month >=9 && (month%2!=0) && date >=1 && date <=30 ){
                return true;
            }
        }
        return false;
    }
    
    static boolean validFormat( int year, int month , int date){
        if( isValid(date, month, year)){
            if(leapYear(date, month, year)){
                return true;
            }else{
                if(notLeapYear(date, month, year)){
                    return true;
                }
            }
        }
        return false;
    }

    static boolean validTime( int hour , int minute, int seconds){
        if ( hour >=0 && hour <= 23){
            if( minute >=0 && minute <=59){
                if( seconds >= 0 && seconds <= 59){
                    return true;
                }
            }
        }
        return false;
    }
    
    static void process( String s){
        String d ="";
        String m ="";
        String y ="";
        String h ="";
        String min ="";
        String secs ="";
        String temp ="";
        String [] a=new String[6];
        int k=0;
        for( int i=0;i<s.length();i++){
            if( s.charAt(i) >='0' && s.charAt(i) <='9'){
                temp=temp+s.charAt(i);
            }else{
                a[k]=temp;
                temp="";
                k++;
            }
        }
        a[k]=temp;
        // for(int i=0;i<3;i++){
        //     System.out.println(a[i]);
        // }
        d=a[0];
        m=a[1];
        y=a[2];
        h=a[3];
        min=a[4];
        secs=a[5];
        int date =Integer.parseInt(d);
        int month =Integer.parseInt(m);
        int year =Integer.parseInt(y);
        int hour =Integer.parseInt(h);
        int minute =Integer.parseInt(min);
        int seconds =Integer.parseInt(secs);
        // System.out.println(date); 
        // System.out.println(year); 
        // System.out.println(month); 
        if(validFormat(year, month, date) && validTime(hour, minute, seconds)){
            System.out.println("Yes, it is valid");
        }else{
            System.out.println("Not valid");
        }
    }
    public static void main(String[] abi) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println("Enter date and time:");
        process(str);

        s.close();
    }
}
