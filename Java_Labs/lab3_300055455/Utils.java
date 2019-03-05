import java.util.Arrays;

/**
* this class represents an array
* it replaces elements in an array with other elements
* @author Skyla Thadani
*/
public class Utils {

    /**
     * Returns a copy of the array 'in' where each word occurring in the array
     * 'what' has been replaced by the word occurring in the same position
     * in the array 'with'.
     *
     * @param in an array of Strings;
     * @param what an array of words to be replaced;
     * @param with an array of replacement words;
     * @return a new array idententical to 'in' except that all the occurrences of words
     * found in 'what' have been replaced by the corresponding word from 'with'.
     */

    public static String[] findAndReplace( String[] in, String[] what, String[] with ) {

        String[] out = null; // The new array to be returned
          boolean valid = true; // True if the pre-conditions are satistified

        // Testing pre-conditions

          /**
          * this block of code tests if the method can run as intended
          * formal parameters cannot be null
          * for all three arrays, none of the elements can be null
          * the query and replacement arrays must be of the same length
          */

        if ( in == null || what == null || with == null ) {
            valid = false;
        } else {
          int y = 0;
           for(int i = 0; i < in.length;i++){
            if(in[i] == null){
              y++;
            }
           }
           for(int i = 0; i < what.length;i++){
            if(what[i] == null){
              y++;
            }
           }
           for(int i = 0; i < with.length;i++){
            if(with[i] == null){
              y++;
            }
           }
           if(y > 0){
            valid = false;
           }

           if(what.length != with.length){
            valid = false;
           } 
        }

        /**
          * this block of code replaces the intended elements in the array
          * it first finds the elements that need to be replaced
          * then it switches the elements and returns a new array
          */


        if ( valid ) {
            out = new String[ in.length ];
            out = in.clone();
            for ( int i=0; i<in.length; i++ ) {
                for(int j = 0; j < what.length; j++){
                if(what[j].equals(out[i])){
                  out[i] = with[j];
                }
              }
            }
        }
        // Returning a reference to the newly created array that
        // contains the same entries as 'in' except that all the
        // occurrences of words from 'what' have been replaced by
        // their corresponding occurrence from 'with'.

        return out;
    }

}