import java.util.Scanner;

class Fraction{
    private int numerator;
    private int denominator;

    public Fraction(){
        denominator = 1;
    }

    public Fraction(int numerator){
        this.numerator = numerator;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public Fraction add(Fraction f){
        this.numerator=this.numerator*f.getDenominator();
        f.numerator=f.numerator*this.getDenominator();
        this.denominator=this.denominator*f.getDenominator();
        this.numerator=this.numerator+f.numerator;

        return this;
    }

    public Fraction subtract(Fraction f){
        //TODO
        this.numerator=this.numerator*f.getDenominator();
        f.numerator=f.numerator*this.getDenominator();
        this.denominator=this.denominator*f.getDenominator();
        this.numerator=this.numerator-f.numerator;

        return this;
    }

    public Fraction divide(Fraction f){
        //TODO
        this.numerator=+f.numerator;
        this.denominator=this.denominator*f.getDenominator();
        return this;
    }

    public Fraction simplify(){
        //TODO

        for (int i = denominator; i > 1; i--) {

            if(numerator%i==0&&denominator%i==0){
                this.numerator=this.numerator/i;
                this.denominator=this.denominator/i;
                //break;
            }
            //break;

        }

        return this;
    }

    public Fraction multiply(Fraction f){
        this.numerator=this.numerator*f.getNumerator();
        this.denominator=this.denominator*f.denominator;
        return this;
    }

    void print(){
        System.out.println(this.numerator + "/" + this.denominator);
    }
}

public class Main {
    public static void main(String[] args) {
        Fraction f = new Fraction(3,9 ).simplify();
        f.print();

    }
}