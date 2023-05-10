package day3.inheritance;

class Dog extends Animal{

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("Woof!");
	}
	public static void main(String args[])
	{
		Dog dog=new Dog();
		dog.speak();
	}

}
