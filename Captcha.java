import java.util.Random;
import java.util.Scanner;

public class Captcha {

    static String captchaValid() {
        String alphaNumeric = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
                "abcdefghijklmnopqrstuvwxyz" +
                "0123456789";
        Random rand = new Random();
        String resCaptcha = "";
        for (int i = 1; i <= 6; i++) {
            int index = rand.nextInt(0, alphaNumeric.length() - 1);
            resCaptcha = resCaptcha + alphaNumeric.charAt(index);
        }
        return resCaptcha;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String captcha;
        String checkers;
        // if (){
        //     
        // }else{
        //     System.out.println("Try again");
        // }
        do{
            checkers=captchaValid();
            System.out.println(checkers);
            System.out.println("Enter the above captcha to sign in");
            captcha = s.next();
        }while(!checkers.equals(captcha));
        System.out.println("Successfully signed in");
        s.close();
    }
}
