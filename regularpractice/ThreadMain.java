package regularpractice;
class A extends Thread{
	public void run()
	{
		for(int i=0;i<=50;i++)
		{
			System.out.println("Hi");
			//after printing hi the thread will go to the waiting stage
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class B extends Thread{
	public void run()
	{
		for(int i=0;i<=50;i++)
		{
			System.out.println("Hello");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class ThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A obj=new A();
B obj1=new B();


//obj1.setPriority(Thread.MAX_PRIORITY);

//System.out.println(obj.getPriority());                  
//System.out.println(obj1.getPriority());
obj.start();


obj1.start();

	}

}
