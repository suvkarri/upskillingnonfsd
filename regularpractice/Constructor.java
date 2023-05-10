package regularpractice;

class Constructor {
	private String name;
	private int age;
	public Constructor()
	{
		age=21;
		name="Priya";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static void main(String args[])
	{
		Constructor cn=new Constructor();
		System.out.println(cn.getName()+  " : " + cn.getAge());
	}
}
