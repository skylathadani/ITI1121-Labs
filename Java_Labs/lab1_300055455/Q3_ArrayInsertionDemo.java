public class Q3_ArrayInsertionDemo{
	public static int[] insertIntoArray(int[] beforeArray,int indexToInsert, int numToInsert){
        // Your code here

        int [] newArray;
        //create a new array
        newArray = new int[beforeArray.length+1];

        //how many elements need to be in array

        newArray[indexToInsert] = numToInsert;
        //put element into array

        int[] a1 = new int[indexToInsert];
        //created two more arrays to hold the parts of the old array before an after the insertion point

        int[] a2 = new int[beforeArray.length-indexToInsert];
        //populating new arrays
        for(int i = 0; i < a1.length; i++){
            a1[i] = beforeArray[i];
        }

        for(int i = 0; i <a2.length;i++){
            a2[i] = beforeArray[i+indexToInsert];
        }
        //populating the final array

        for(int i = 0; i<a1.length;i++){
            newArray[i] = a1[i];
        }

        for(int i = 0;i<a2.length;i++){
            newArray[indexToInsert+i+1] = a2[i];
        }

        return newArray;

    }

	public static void main(String[] args) {
        //declaring a new array
		int [] a = new int[]{1,5,4,7,9,6};
		System.out.println("Array before insertion: ");
        //printing the values from the array without the insert
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);

		}

		int newNum = 15;

		int newPos = 3;

        //create the new array

		int [] b = insertIntoArray(a,newPos,newNum);

		System.out.println("Array after insertion of "+ newNum+ " at position " + newPos);
//print the new array
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);

		}
	}
}