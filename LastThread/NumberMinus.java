package LastThread;

public class NumberMinus implements Runnable {
	Number n = new Number();

	public NumberMinus(Number n) {
		this.n = n;
	}

	public void run() {
		while (true) {
			synchronized (n) {

				if (!n.flag) {
					try {
						n.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				n.num--;
				System.out.println(n.num);
				n.flag = false;
				n.notifyAll();

			}
		}
	}

}
