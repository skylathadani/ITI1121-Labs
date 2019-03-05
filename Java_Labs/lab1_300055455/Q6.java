import java.util.Scanner;
import java.util.Arrays;
public class Q6{
	public static void main(String[] args) {

		double[] grades = new double[10];
		//populate the array with grades

		for(int i=0;i<grades.length;i++){
			System.out.print("Enter a number ");

			Scanner sc = new Scanner(System.in);

			grades[i] = sc.nextDouble();


		}
		//use methods

		double ave = calculateAverage(grades);

		double med = calculateMedian(grades);

		int failed = calculateNumberFailed(grades);

		int passed = calculateNumberPassed(grades);

		//print out the statements

		System.out.println("The average of the grades is " + ave);
		System.out.println("The median of the grades is " +med);
		System.out.println("The number of failing students is "+(failed));
		System.out.println("The number of passing students is "+(passed));
		
	}

	public static double calculateAverage(double[] notes){

		int ave = 0;
//get the sum of all the grades
		for(int i = 0; i<notes.length;i++){
			ave += notes[i];
		}

		ave = ave/notes.length;

		return ave;

	}

	public static double calculateMedian(double[] notes){
//sort the list
		Arrays.sort(notes);
//get the middle element
		if(notes.length%2==0){
			return((notes[notes.length/2]+notes[notes.length/2+1])/2);
		}else{
			return(notes[notes.length/2]);
		}
	}

	public static int calculateNumberFailed(double[] notes){

		int num=0;
//count how many students failed
		for(int i=0;i<notes.length;i++){
			if (notes[i]<50){
				num+=1;

			}

			
		}

		return num;

	}

	public static int calculateNumberPassed(double[] notes){

		int num = 0;

		//count how many grades are 50+

		for(int i=0;i<notes.length;i++){
			if(notes[i]>=50){
				num+=1;
			}

			
		}
		return num;

	}
}