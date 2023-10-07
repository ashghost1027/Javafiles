public class MultipleChars {
    public static String returnStuff(String string){
        String repeatedLetters = ""; 
        for (int i = 0 ; i <string.length();i++){
            String ins = string.charAt(i)+"";
            if(i<string.length()-1 && ins.equals(string.charAt(i+1)+"")){
                repeatedLetters += string.charAt(i);
            }
            else if( i>0&&ins.equals(string.charAt(i-1)+"")){
                repeatedLetters+=string.charAt(i-1);
            }
        }

        return repeatedLetters;
    }
    public static void countOdds(int integer){
        // int odd = 0;
        // int even = 0;
        // String num = String.valueOf(integer);
        // int len = num.length();
        
        
    }
    public static void main(String[] args) {
        String stuff = MultipleChars.returnStuff("abcdeeefggghi");
        System.out.println(stuff);
    }
}
