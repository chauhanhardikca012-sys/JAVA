class Animal{
	void sound(){
		System.out.println("Animal is Sound");
	}
}

class Dog extends Animal{
	void sound(){
		System.out.println("Dog  is Barking");
	}
}

class MethodOverriding{
	public static void main(String []args){
		Animal a1 = new Dog();
		Animal a2 = new Animal();
		a1.sound();
		a2.sound();
	}
}