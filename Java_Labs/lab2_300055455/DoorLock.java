public class DoorLock {

    // Constant.
    public static final int MAX_NUMBER_OF_ATTEMPTS = 3;

    // Instance variables.
    private Combination combination;
    private boolean open;
    private boolean activated;
    private int numberOfAttempts;

    // Constructor.
    public DoorLock( Combination comb ) {
        combination = comb; 
        activated = true;
        numberOfAttempts = 0;
        open = false;
    }

    // Access methods.

    public boolean isOpen() {
        return open;
    }

    public boolean isActivated() {
        return activated;
    }

    // Notice that numberOfAttempts is compared to
    // MAX_NUMBER_OF_ATTEMPTS only when its value has been
    // incremented, Also, numberOfAttempts should be set to zero when
    // activated is false.  Problems related to the combined action of
    // these two variables have caused problems for some students.

    public boolean open( Combination combination ) {

        if(this.activated){
            if(this.combination.equals(combination)){

            this.open = true;
            this.numberOfAttempts=0;
            return true;

        }else{
            this.open = false;
            this.numberOfAttempts++;
            if(this.numberOfAttempts==MAX_NUMBER_OF_ATTEMPTS){
                this.activated=false;
                this.numberOfAttempts=0;

            }
        }
        }

        return false;


        
    }

    public void activate( Combination c ) {
        if(combination.equals(c)){
            this.activated=true;
        }
    }

}