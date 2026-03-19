interface Shape{
	void area();
}

class Circle implements Shape{
		double radius;
			Circle(double r){
				radius = r;
			}
			public void area(){
				double result = 3.14 * radius * radius;
				System.out.println("Area of Circle :"+result);
			}
}

class Rectangle implements Shape{
	double length,width;
		Rectangle(double l,double w){
			length = l;
			width = w;
		}
		public void area(){
			double result = length * width;
			System.out.println("Area of Rectangle :"+result);
		}
}

class ShapeInterface{
	public static void main(String []args){
			Shape s1 = new Circle(5);
			Shape s2 = new Rectangle(7,9);
			
				s1.area();
				s2.area();
	}
}