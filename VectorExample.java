import java.util.Vector;

class VectorExample{
	public static void main(String []args){
		Vector <Integer> va = new Vector <> ();
		
		va.add(1);	
		va.add(2);
		va.add(3);
		va.add(4);
		
			System.out.println("Elements "+va);
			System.out.println("Size "+va.size());
			System.out.println("Capacity "+va.capacity());
			
		va.add(5);
		va.add(6);
		va.add(7);
		va.add(8);
		va.add(9);
		va.add(10);
		va.add(11);
			
			System.out.println("\nAfter Adding More Elements");
			System.out.println("Elements "+va);
			System.out.println("Size "+va.size());
			System.out.println("Capacity "+va.capacity());
				
		va.remove(2);
			System.out.println("\nAfter Removing Element");
			System.out.println("Elements "+va);
	}
}