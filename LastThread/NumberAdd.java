package LastThread;

public class NumberAdd implements Runnable {
	Number n = new Number();

	public NumberAdd(Number n) {
		this.n = n;
	}

	public void run() {
		while (true) {
			synchronized (n) {

				if (n.flag) {
					try {
						n.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				n.num++;
				System.out.println(n.num);
				n.flag = true;
				n.notifyAll();

			}
		}
	}

}
