public class Q2{
	public static void main(String[] args){
		//go through all the numbers from 1-30
		for (int i = 1; i < 31; i++){
			//conditions if the number divisible by certain other numbers
			if (i%15==0){
				System.out.println(i+" FizzBuzz");
			}else if (i%3==0) {
				System.out.println(i+" Fizz");
			}else if (i%5==0) {
				System.out.println(i+" Buzz");
			}
		}
	}
}