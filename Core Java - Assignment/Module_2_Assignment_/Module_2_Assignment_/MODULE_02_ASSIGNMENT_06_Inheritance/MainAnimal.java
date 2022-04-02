//Inheritance


class Animal{


	void eat(){
		System.out.println("Eat Method of Animal class");
	}
	
	void sleep(){
		System.out.println("sleep Method of Animal class \n");
	
	}
}

class Bird extends Animal{

	void eat(){
		System.out.println("eat Method of Bird class");
	}
	
	void sleep(){
		System.out.println("sleep Method of Bird class");
	}
	
	void fly(){
		System.out.println("fly Method of Bird class \n");
	}
	
}

class MainAnimal{

	public static void main(String args[])
	{
		Animal a = new Animal();
		a.eat();
		a.sleep();
		
		Bird b = new Bird();
		b.eat();
		b.sleep();
		b.fly();
		
	}
}