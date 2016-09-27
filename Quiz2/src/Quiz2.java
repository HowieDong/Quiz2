import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args){
		Scanner a = new Scanner(System.in);
		System.out.println("What is the tuition of the first year:");
		double firstYear = a.nextDouble();
		System.out.println("What is the percentage increased First year:");
		double percent = a.nextDouble();
		double total = firstYear;
		
		for (int year = 1; year < 4; year++){
			total += firstYear * (1 + percent / 100);
			firstYear = firstYear * (1 + percent / 100);
		}

		System.out.printf("The total cost to complete a degree is:%.2f \n",total);
	}
}
