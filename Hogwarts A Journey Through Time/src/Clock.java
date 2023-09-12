


public class Clock extends ConcreteSubject implements Runnable {

	int minutes;
	int done = 0;
	Thread t;
	
	Clock() {
		t = new Thread(this);
	}

	public void run() {

		while (done==0) {
			
			try {
				Thread.sleep(60*100);
				minutes++;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			String origin = "\u23F0";
			String topic = "timing update";
			int payload =  minutes;
			
			
			Message m = new Message(origin, topic, payload); 
			publishMessage(m);

		}
	}
	
	

}
