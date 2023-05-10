package regularpractice;
class Student{
	int rollNo;
	String name;
	float marks;
}
public class ArrayOfObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s1=new Student();
s1.rollNo=11;
s1.name="Surya";
s1.marks=88;
Student s2=new Student();
s2.rollNo=12;
s2.name="Ravi";
s2.marks=94;
Student s3=new Student();
s3.rollNo=13;
s3.name="Ram";
s3.marks=99;

Student students[]= new Student[3];
students[0]=s1;
students[1]=s2;
students[2]=s3;

for(int i=0;i<students.length;i++) {
	System.out.println(students[i].name + " " +students[i].marks);
}

//for each LOOP

//for(Student stud:students)
//{
//	System.out.println(stud.name + " " + stud.marks);
//}
	}

}
