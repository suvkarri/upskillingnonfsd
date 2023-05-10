package day5.multithrows;

import java.io.IOException;

class Test1
{
	void m1() throws IOException{
		throw new IOException("device error");
	}
	void n1() throws IOException{
		m1();
	}
	void p()
	{
		try {
			n1();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	{
		
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test1 t1=new Test1();
t1.p();
	}

}
