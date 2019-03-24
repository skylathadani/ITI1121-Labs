public class Cashier {

    // Constant

    private static final String nl = System.getProperty( "line.separator" );

    // Instance variables

    private Queue<Customer> queue;
    private Customer currentCustomer;

    private int totalCustomerWaitTime;
    private int customersServed;
    private int totalItemsServed;

    // constructor

    public Cashier(){
        queue = new ArrayQueue <Customer> ();

        currentCustomer = null;

        totalCustomerWaitTime = 0;
        //totalItemsServed = 0;

        customersServed = 0;

        totalItemsServed = 0;




    }

    public void addCustomer( Customer c ) {
        queue.enqueue(c);
    }

    public int getQueueSize() {
        return queue.size();
    }

    public void serveCustomers( int currentTime ){
      

      if(currentCustomer == null && getQueueSize() != 0){
        currentCustomer = queue.dequeue();
        totalCustomerWaitTime = totalCustomerWaitTime + currentTime;

      }

      if(currentCustomer != null && currentCustomer.getNumberOfItems() > 0){

        currentCustomer.serve();

      }else if(currentCustomer != null && currentCustomer.getNumberOfItems() == 0){
        totalItemsServed = totalItemsServed + currentCustomer.getNumberOfServedItems();
        customersServed++;
        currentCustomer = null;

      }



      


    }

    public int getTotalCustomerWaitTime(){
        return totalCustomerWaitTime;
    }

    public int getTotalItemsServed(){
        return totalItemsServed;
    }

    public int getTotalCustomersServed(){
        return customersServed;
    }
   
    public String toString() {

        StringBuffer results = new StringBuffer();

        results.append( "The total number of customers served is " );
        results.append( customersServed );
        results.append( nl );

        results.append( "The average number of items per customer was " );
        results.append( totalItemsServed / customersServed );
        results.append( nl );

        results.append( "The average waiting time (in seconds) was " );
        results.append( totalCustomerWaitTime / customersServed );
        results.append( nl );

        return results.toString();
    }
}