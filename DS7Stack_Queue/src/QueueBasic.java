
public class QueueBasic {
	int numbers[];
	public QueueBasic() {
		numbers = new int[10];
	}
	
	public void popIt() {
		if(numbers[0] == 0) {
			System.out.println("Queue is empty. Can't pop");
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
			for(int i = numbers.length-1; i > 0; i--) {
				numbers[i] = numbers[i-1];
			}
			numbers[0] = newNum;
		}
		else {
			System.out.println("Queue is full. Can't push");
		}
	}
	
	public static void main(String arg[]) {
		QueueBasic queue = new QueueBasic();
		queue.pushIt(8);
		queue.pushIt(3);
		queue.pushIt(6);
		queue.pushIt(8);
		queue.pushIt(3);
		queue.pushIt(6);
		queue.pushIt(8);
		queue.pushIt(3);
		queue.pushIt(6);
		queue.pushIt(8);
		queue.pushIt(3);
		for(int i = 0; i < queue.numbers.length; i++)
			System.out.print(queue.numbers[i] + " ");
		System.out.println();
		queue.popIt();
		for(int i = 0; i < queue.numbers.length; i++)
			System.out.print(queue.numbers[i] + " ");
		System.out.println();
		queue.popIt();
		queue.popIt();
		for(int i = 0; i < queue.numbers.length; i++)
			System.out.print(queue.numbers[i] + " ");
		queue.popIt();
		queue.popIt();
		queue.popIt();
		queue.popIt();
		queue.popIt();
		queue.popIt();
		queue.popIt();
		queue.popIt();
		queue.popIt();
	}
}
