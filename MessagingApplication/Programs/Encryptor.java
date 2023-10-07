package MessagingApplication.Programs;



public class Encryptor {
    
    private String password;
    private final String key = "`(owWQhhp,\\TSVv!DYn,;thxQap'A9?Xk~dIr\"`7&)^3#R:+$lPZz%Nmyc_U|}286{MHGjJ-i[OLu0wg=.CWe*Bf(<]1osFbK@4qE/>5";
    private String asciiValues = "";
    private String encryptedPassword = "";

    public Encryptor(String password){
        this.password = password;
    }

    void encryptPassword(){
        for (int i = 0; i < password.length(); i++){
            encryptedPassword += key.charAt(asciiValues.indexOf(password.charAt(i)));
        }
    }

    public String getEncryptedPassword(){
        encryptPassword();
        return encryptedPassword;
    }

    public void setAscii(){
        for (int i = 33; i < 127; i++) {
            asciiValues += Character.toString(i);
        }
    }
}
