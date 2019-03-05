public class Rational {

    private int numerator;
    private int denominator;

    // constructors

    public Rational(int numerator) {
      this.numerator = numerator;
      this.denominator = 1;

	     
         
    }

    public Rational(int numerator, int denominator) {
	     if (denominator < 0) {
      denominator = -1 * denominator;
      numerator = -1 * numerator;
      }
    this.numerator = numerator;
    this.denominator = denominator;
    reduce();
    }
    

    // getters

    public int getNumerator() {
	     return numerator;
    }

    public int getDenominator() {
	     return denominator;
    }

    // instance methods

    public Rational plus(Rational other) {
	     Rational s = new Rational((this.numerator*other.denominator)+(other.numerator*this.denominator),other.denominator*this.denominator);
         
         return s;
    }

    public static Rational plus(Rational a, Rational b) {
    	

         return a.plus(b);
    }

    // Transforms this number into its reduced form

    private void reduce() {

      if(numerator == 0){
        denominator = 1;
      }else{
        int g = gcd(Math.abs(this.numerator),this.denominator);
        this.numerator = this.numerator/g;
        this.denominator = this.denominator/g;
      }





      
    }

    // Euclid's algorithm for calculating the greatest common divisor
    private int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
    	while (a != b)
    	    if (a > b)
    		     a = a - b;
    	    else
    		     b = b - a;
    	return a;
    }

    public int compareTo(Rational other) {
      float s = this.numerator/this.denominator;

      float a = other.numerator/other.denominator;

      if(s == a){
        return 0;
      }else if (s < a){
        return -1;

      }else{
        return 1;
      }
    }

    public boolean equals(Rational other) {
      return(this.numerator == other.numerator && this.denominator == other.denominator);
    }

    public String toString() {
    	String result;
    	if (denominator == 1) {
    	    result = Integer.toString(numerator);
    	} else {
    	    result = this.numerator + "/" + this.denominator;
    	}
    	return result;
    }
/*
public static void main(String[] args) {
        Rational s = new Rational(1,2);
        Rational b = new Rational(2);

        System.out.println(s);
        System.out.println(b);

        Rational w = s.plus(b);
        System.out.println(w);

        Rational k = new Rational(1,3);

        Rational l = new Rational(3);

        Rational e = s.plus(k,l);

        System.out.println(e);

        Rational v = new Rational(18,4);

        v.reduce();

        System.out.println(v);

        Rational f = new Rational(9,2);

        boolean y = f.equals(e);

        System.out.println(y);

        int r = f.compareTo(w);

        System.out.println(r);


    }
    */

}