public abstract class AbstractSeries implements Series {

    public double[] take(int k) {

        double [] r = new double[k];

        for(int i =0; i < k ; i++){
        	r[i] = next();
        }


        return r;
        
    }

    public double next(){
    	return 0;
    }

}