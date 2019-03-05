public class Q3_ReverseSortDemo{
	public static void main(String[] args) {
		//create character array
		char[] unorderedLetters;
		unorderedLetters = new char[] {'b','m','z','a','u'};
		reverseSort(unorderedLetters);

		//print the array 
		
		for(int i = 0; i < unorderedLetters.length;i++){
			System.out.print(unorderedLetters[i]);
		}
	}

	//method that sorts a char array into its reverse alphabetical order

	public static void reverseSort(char[] values)
	{
		//your code here

		int i,j,argMax;

		char tmp;
//look for the biggest value
		for(i=0;i<values.length-1;i++){
			argMax = i;

			for(j = i+1;j<values.length;j++){
				if(values[j]>values[argMax]){
					argMax = j;
				}
			}
//swap values if there is a bigger value somewhere else
			tmp = values[argMax];
			values[argMax] = values[i];
			values[i] = tmp;
		}

		
	}
}