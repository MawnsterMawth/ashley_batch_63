import java.util.Scanner;
public class ReverseWords {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		String[] splitted = input.split("\s");
		for(int i = splitted.length - 1; i >=0; i--) {
			System.out.print(splitted[i]+" ");
		}
	}
}
