import java.util.Scanner;
public class Q4_VotingRights{
	public static void main(String[] args) {
		System.out.print("How old are you? ");
		Scanner sc = new Scanner(System.in);

		int age = sc.nextInt();

		if (age >= 18){
			System.out.println("You have the right to vote!");
		}else{
			int diff = 18-age;
			System.out.println("You will be allowed to vote in " + diff + " years.");
		}
	}

}