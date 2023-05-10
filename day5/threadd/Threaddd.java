package day5.threadd;

class Threaddd extends Thread {

	public void run()
	{
		System.out.println("Welcome");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Threaddd td=new Threaddd();
td.start();
	}

}
