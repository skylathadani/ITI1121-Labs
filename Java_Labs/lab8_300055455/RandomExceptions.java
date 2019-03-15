import java.io.IOException;

public class RandomExceptions {

   public static void main(String args[]) {

      int exceptionNumber = randomNumber();

      try{
	        throwException(exceptionNumber);
      }
      
      catch(ArrayIndexOutOfBoundsException e){
         System.out.println("The exception type is: ArrayIndexOutOfBoundsException"  + ", the exceptionNumber is: " + exceptionNumber);
      }
      catch(IOException e){
         System.out.println("The exception type is: IOException" + ", the exceptionNumber is: " + exceptionNumber);
      }
      catch(IllegalArgumentException e){
         System.out.println("The exception type is: IllegalArgumentException" + ", the exceptionNumber is: " + exceptionNumber);
      }
      catch(NullPointerException e){
         System.out.println("The exception type is: NullPointerException"  + ", the exceptionNumber is: " + exceptionNumber);
      }
      catch(Exception e){
         System.out.println("The exception type is: Exception" + ", the exceptionNumber is: " + exceptionNumber);
      }
      
   }

   public static int randomNumber() {
      return (int)(Math.random()*5) + 1;
   }

   public static void throwException(int exceptionNumber) throws Exception, IOException{
      if(exceptionNumber==1){
	       throw new Exception();
      }
      if(exceptionNumber==2){
	       throw new ArrayIndexOutOfBoundsException();
      }
      if(exceptionNumber==3){
	       throw new IOException();
      }
      if(exceptionNumber==4){
	       throw new IllegalArgumentException();
      }
      if(exceptionNumber==5){
	       throw new NullPointerException();
      }
   }
}