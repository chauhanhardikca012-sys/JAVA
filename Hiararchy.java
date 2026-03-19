class Animal{
	void eat(){
		System.out.println("Animal parent");
	}
}

class Dog extends Animal{
	void bark(){
		System.out.println("Bark From From Animal");
	}
}

class Cat extends Animal{
	void meow(){
		System.out.println("Meow Forom Animal");
	}
}

class Hiararchy{
	public static void main(String []args){
		Cat c1 = new Cat();
		Dog d1 = new Dog();
		
			c1.eat();
			c1.meow();
			
			d1.eat();
			d1.bark();
	}
}