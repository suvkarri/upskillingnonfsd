package day5.multithread;

class MultiThreadingDemo extends Thread{
	public void run()
	{
	System.out.println("Thread:"+Thread.currentThread().getId()+" is running");
	}
}
public class MultiThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

for(int i=1;i<8;i++)
{
	MultiThreadingDemo mtd=new MultiThreadingDemo();
	mtd.start();
	MultiThreadingDemo mtd1=new MultiThreadingDemo();
	mtd1.start();
}
	}
 
}
