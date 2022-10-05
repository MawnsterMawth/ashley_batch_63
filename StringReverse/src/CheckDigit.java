import java.util.Scanner;
public class CheckDigit {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String[] splitted = input.split("\\.?[\\d]");
		if(splitted.length == 0)
			System.out.println("Is a number");
		else
			System.out.println("Is not a number");
	}
}
