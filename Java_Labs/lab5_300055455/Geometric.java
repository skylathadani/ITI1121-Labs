public class Geometric extends AbstractSeries {

    // instance variables
    private int cTerm;
    private double curSum;

    public Geometric(){
    	this.cTerm = -1;
    	this.curSum = 0;
    }
    
    public double next() {

    	this.cTerm++;
    	this.curSum += (1/(Math.pow(2,(double) this.cTerm)));

    	return this.curSum;



        // implement the method



    }
}