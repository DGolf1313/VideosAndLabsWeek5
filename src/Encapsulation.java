
public class Encapsulation {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setFirstName("Sa");
		System.out.println(student.getFirstName());
		student.setPhoneNumber("123");
		student.introduce();
		
		
		/*
		 * Access Modifiers;
		 * public		accessible everywhere
		 * private		Only accessible within the class itself
		 * protected	accessible in the class, other classes in the same package, and all subclasses
		 * No Modifier	same as protected, except not accessible in a subclass in a different package
		 */
		
		Rectangle rec = new Rectangle(10.3, 15.5);
		rec.setLength(12.2);
		rec.setWidth(13.32);
		System.out.println(rec.getArea());
	}

}
