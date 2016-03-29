package LastThread;

public class NumberDemo {
	public static void main(String[] args) {
		Number n = new Number();
		NumberAdd na = new NumberAdd(n);
		NumberMinus mm = new NumberMinus(n);
		Thread st1 = new Thread(na);
		Thread st2 = new Thread(mm);
		st1.start();
		st2.start();
	}
}
