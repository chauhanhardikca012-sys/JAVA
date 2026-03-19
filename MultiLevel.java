class Animal{
	void show1(){
		System.out.println("This is Animal Method");
	}
}

class Mammal extends Animal{
	void show2(){
		System.out.println("This is Mammal From Animal");
	}
}

class Dog  extends Mammal{
	void show3(){
		System.out.println("This is Dog From Mammal");
	}
}
class MultiLevel{
	public static void main(String []args){
		Dog d1 = new Dog();
			d1.show3();
			d1.show2();
			d1.show1();
			
	}
}