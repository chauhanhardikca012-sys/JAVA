class Animal{
	void eat(){
		System.out.println("Eating Method");
	}
}
class Dog extends Animal{
	void bark(){
		System.out.println("Barking Method");
	}
}

class SingleInherit{
	public static void main(String []args){
	Dog d1 = new Dog();
		d1.bark();
		d1.eat();
	}
}