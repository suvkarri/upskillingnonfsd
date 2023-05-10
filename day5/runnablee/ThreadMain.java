package day5.runnablee;


class Sample implements Runnable {
	public void run() {
		for(int i=0;i<=5;i++)
		{
			System.out.println("Hi");
		
		}
	}
}

class Sample2 extends Thread{
	public void run() {
		for(int i=0;i<=5;i++)
		{
			System.out.println("DFGHJ");
			
		}
	}
}

public class ThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Sample2 s2=new Sample2();
s2.start();
Sample s=new Sample();
Thread t=new Thread(new Sample());

try {
	Thread.sleep(10);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
t.start();
	}

}


