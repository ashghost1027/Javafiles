import java.util.Random;

public class CaptchaGenerator {
    public String getLetters(int reqd){
        Random random = new Random();
        String letters = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890";
        String captchaLetters = "";
        for (int i = 0 ; i < reqd; i++){
            captchaLetters += letters.charAt(random.nextInt(62));
        }
        return captchaLetters;
    }

    public static void main(String[] args){
        CaptchaGenerator captcha = new CaptchaGenerator();
        int length = new Random().nextInt(7-4)+4;
        String finalCaptcha = captcha.getLetters(length);
        System.out.println(finalCaptcha);
        
    }
}
