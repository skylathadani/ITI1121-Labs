public class Combination {

    // Instance variables.
    int num1;
    int num2; 
    int num3;

    // Constructor
    public Combination( int first, int second, int third ) {
        num1 = first;
        num2 = second;
        num3 = third;
    }

    // An instance method that compares this object
    // to other.
    // Always check that other is not null, i)
    // an error would occur if you tried to
    // access other.first if other was null, ii)
    // null is a valid argument, the method should
    // simply return false.

    public boolean equals( Combination other ) {
        if (other == null){
            return false;
        }
        if(other.num1 != this.num1 || other.num2 != this.num2 || other.num3 != this.num3){
            return false;
        }
        return true;
    }

    // Returns a String representation of this Combination.

    public String toString() {
        String s = "";

        s = s + Integer.toString(this.num1)+":"+Integer.toString(this.num2)+":"+Integer.toString(this.num3);
        return s;
    }


    /*public static void main(String[] args) {
        Combination c1,c2,c3;

        c1 = new Combination(1,2,3);
        c2 = new Combination(1,2,3);
        c3 = new Combination(3,2,1);

        Boolean r = c1.equals(c2);

        System.out.println(r);

        System.out.println(c1);
    }*/

}