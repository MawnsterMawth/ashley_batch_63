
public class StackBasic {
	int numbers[];
	public StackBasic() {
		numbers = new int[10];
	}
	
	public void popIt() {
		if(numbers[0] == 0) {
			System.out.println("Stack is empty. Can't pop");
		}
		else {
			for(int i = numbers.length-1; i > 0; i--) {
				if(numbers[i] != 0) {
					numbers[i] = 0;
					break;
				}
			}
		}
	}
	
	public void pushIt(int newNum) {
		if(numbers[numbers.length-1] == 0) {
			for(int i = 0; i < numbers.length; i++) {
				if(numbers[i] == 0) {
					numbers[i] = newNum;
					break;
				}
			}
		}
		else {
			System.out.println("Stack is full. Can't push");
		}
	}
	
	public static void main(String arg[]) {
		StackBasic stack = new StackBasic();
		stack.pushIt(8);
		stack.pushIt(3);
		stack.pushIt(6);
		stack.pushIt(8);
		stack.pushIt(3);
		stack.pushIt(6);
		stack.pushIt(8);
		stack.pushIt(3);
		stack.pushIt(6);
		stack.pushIt(8);
		stack.pushIt(3);
		for(int i = 0; i < stack.numbers.length; i++)
			System.out.print(stack.numbers[i] + " ");
		System.out.println();
		stack.popIt();
		for(int i = 0; i < stack.numbers.length; i++)
			System.out.print(stack.numbers[i] + " ");
		System.out.println();
		stack.popIt();
		stack.popIt();
		for(int i = 0; i < stack.numbers.length; i++)
			System.out.print(stack.numbers[i] + " ");
		stack.popIt();
		stack.popIt();
		stack.popIt();
		stack.popIt();
		stack.popIt();
		stack.popIt();
		stack.popIt();
		stack.popIt();
		stack.popIt();
	}
}
