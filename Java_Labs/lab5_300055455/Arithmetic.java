public class Arithmetic extends AbstractSeries {

    // instance variables

    private int cTerm;
    private double curSum;

    public Arithmetic(){
    	this.cTerm = 0;
    	this.curSum = 0;
    }

    public double next() {

        // implement the method
        this.cTerm++;
        this.curSum += this.cTerm;

        return this.curSum;


        
    }
}