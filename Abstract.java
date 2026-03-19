abstract class Shape{
	abstract void area();
}

class Circle extends Shape{
	double radius;
		
		Circle(double r){
			radius = r;
		}
		void area(){
			double result = 3.14 * radius * radius;
			System.out.println("Area of Circle :"+result);
		}
}

class Abstract{
	public static void main(String []args){
		Circle c1 = new Circle(5);
			c1.area();
	}
}