package regularpractice;

class Mobile {
    String brand;
    int price;
	static String name;
	public void show()
	{
		System.out.println(brand + " "+ price +" " +name);
	}
}
public class StaticVariable{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Mobile s1=new Mobile();
s1.brand="apple";
s1.price=50000;
Mobile.name="smartphone";

Mobile s2=new Mobile();
s2.brand="iphone";
s2.price=75000;
Mobile.name="smartphone";

//Mobile.name="phone";
s1.show();
s2.show();
	}

}
