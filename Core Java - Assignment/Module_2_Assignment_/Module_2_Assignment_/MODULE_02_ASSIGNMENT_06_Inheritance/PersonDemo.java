import java.util.Scanner;

class Person{

private int age;
private String name;

Scanner sc = new Scanner(System.in);
	Person(){
		System.out.println("Enter age and name");
		age = sc.nextInt();
		sc.nextLine();
		name=sc.nextLine();	
	}
	
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setAge(int age){
		this.age=age;
	}
}

class PersonDemo{
	public static void main(String args[])
	{
		Scanner sc1 = new Scanner(System.in);
		Person p = new Person();
		
		System.out.println(p.getName() + " "+ p.getAge());
		System.out.println("Enter age and name");
		
		int age = sc1.nextInt();
		sc1.nextLine();
		String name=sc1.nextLine();
		
		p.setName(name);
		p.setAge(age);
		
		System.out.println(p.getName() + " "+ p.getAge());
		
		
	
	}

}