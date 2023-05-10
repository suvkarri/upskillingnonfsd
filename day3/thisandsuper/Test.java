package day3.thisandsuper;
class Sample{
	String s="Parent";
}
class Sample2 extends Sample{
	String s="child";
	public void m1()
	{
		System.out.println(s);
		System.out.println(this.s);
		System.out.println(super.s);
	}
}
public class Test{
	public static void main(String args[])
	{
		Sample2 obj=new Sample2();
		obj.m1();
	}
}


