class Person{
	String name;
	int age;
	
	person(String name, int age){
		System.out.println("Name = "+ name + "  Age = "+ age);
	}
}
class HighSchoolApplication2{
	public static void main(String agrs[])
	{
		Person p = new Person("Shrushti", 24);
		//p.name="Shrushti";
		//p.age=25;
		//p.personInfo();
	}
}