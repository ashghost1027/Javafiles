public class DigiMath {
    public static double digiMath(double a, double b) {
        if (a < 10 && b < 10)
            return a == b ? 1 : 0;
        else {
            if (a % 10 == b % 10)
                return 1 + digiMath(Math.floor(a / 10), Math.floor(b / 10));
            else
                return digiMath(Math.floor(a / 10), Math.floor(b / 10));
        }
    }

    public static void main(String[] args) {
        double pairs = digiMath(821357, 12357);
        System.out.println(pairs);
    }
}
