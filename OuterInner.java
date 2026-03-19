class Outer{
	void showOuter(){
		System.out.println("Outer Class Called");
	}
	
		class Inner{
			void showInner(){
				System.out.println("Inner Class Called");
			}
		}
}

class OuterInner{
	public static void main(String []args){
		Outer ot = new Outer();
		ot.showOuter();
		
		Outer.Inner in = ot.new Inner();
		in.showInner();
	}
}