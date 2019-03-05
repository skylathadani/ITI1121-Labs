public class Q3_SquareArray{
	public static int [] createArray(int size){
		// create an array
		int [] anArray;
		anArray = new int[size];
//multiply elements in an array
		for (int i = 0; i < anArray.length;i++){
			anArray[i] = i*i;
		}
		return anArray;
	}
	public static void main(String[] args) {
		//create the array
		int [] a = createArray(13);
		//print out the values in the array
		for(int i=0;i<a.length;i++){
			System.out.println("The square of " + i + " is: " + a[i]);
		}

	}
}