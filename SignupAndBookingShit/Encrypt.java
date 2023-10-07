package SignupAndBookingShit;

import java.util.*;

public class Encrypt {
    private String key;
    private String allAsciiChars = "";
    private int passwordLength;
    private String password;

    private int asciiValues = 127 - 32;
    private ArrayList<String> arrayOfLetters = new ArrayList<String>(asciiValues);

    public Encrypt(String password) {
        passwordLength = password.length();
        this.password = password;
        setKey();
    }

    public Encrypt(String password, String key) {
        this.key = key;
        this.password = password;
        this.passwordLength = password.length();
        setAscii();
    }

    public void setAscii() {
        for (int i = 32; i < 127; i++) {
            allAsciiChars += Character.toString(i);
        }
    }

    public void setKey() {

        for (int i = 32; i < 127; i++) {
            arrayOfLetters.add(Character.toString(i));
            allAsciiChars += (Character.toString(i));
        }

        Collections.shuffle(arrayOfLetters);
        for (String i : arrayOfLetters) {
            this.key += i;
        }
    }

    public String getEncryption() {
        String encryptedPassword = "";

        for (int i = 0; i < passwordLength; i++) {
            for (int j = 0; j < allAsciiChars.length(); j++) {
                if (password.charAt(i) == allAsciiChars.charAt(j))
                    encryptedPassword += key.charAt(j);

            }
        }
        return encryptedPassword;
    }

    public String decrypt(String stringToBeDecrypted) {
        String decryptedPassword = "";
        for (int i = 0; i < stringToBeDecrypted.length(); i++) {
            for (int j = 0; j < allAsciiChars.length(); j++) {
                if (stringToBeDecrypted.charAt(i) == key.charAt(j)) {
                    decryptedPassword += allAsciiChars.charAt(j);
                }
            }
        }
        return decryptedPassword;
    }

    public String getKey() {
        return key;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        Encrypt encrypt = new Encrypt(password);
        System.out.println(encrypt.getEncryption());
        
    }
}
