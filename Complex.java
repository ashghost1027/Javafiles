public class Complex {
    private double real;
    private double imaginary;

    public Complex() {
        this.real = 0;
        this.imaginary = -1;
    }

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public String toString() {
        return real + "+ i" + imaginary;
    }

    public Complex addition(double real, double imaginary) {
        double reals = real + this.real;
        double imaginarys = imaginary + this.imaginary;
        Complex complex = new Complex(reals, imaginarys);
        return complex;
    }

    public Complex subtraction(double real, double imaginary) {
        double reals = this.real - real;
        double imaginarys = this.imaginary - imaginary;
        Complex complex = new Complex(reals, imaginarys);
        return complex;
    }

    public Complex multiplication(double real, double imaginary) {
        double ac = real * this.real;
        double adi = this.real * imaginary;
        double cbi = real * this.imaginary;
        double dibi = imaginary * this.imaginary;
        double reals = ac - dibi;
        double imaginarys = adi + cbi;
        Complex complex = new Complex(reals, imaginarys);
        return complex;
    }

    public Complex division(double real, double imaginary) {
        double realPart = real * this.real + this.imaginary * imaginary / Math.pow(real, 2) + Math.pow(real, 2);
        double imaginaryPart = this.imaginary * real - this.real * imaginary / Math.pow(imaginary, 2)
                + Math.pow(imaginary, 2);
        Complex complex = new Complex(realPart, imaginaryPart);
        return complex;

    }
    double getReal(){
        return this.real;
    }
    double getImaginary(){
        return this.imaginary;
    }
    void setReal(double real){
        this.real = real;
    }
    void setImaginary(double imaginary){
        this.imaginary = imaginary;
    }

    public static void main(String[] args) {
        Complex calc = new Complex(3, -4);
        String toPrint = calc.toString();
        System.out.println(toPrint);
        System.out.println(calc.subtraction(4, 7));
        System.out.println(calc.multiplication(2, 3));
        System.out.println(calc.division(2, 2));
    }
}
