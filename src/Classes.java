
public class Classes {

	public static void main(String[] args) {
		
		/*
		 * we've used pre-made java classes before, String StringBUilder
		 */
		
		StringBuilder name = new StringBuilder();
		StringBuilder name2 = new StringBuilder();
		
		Student student1 = new Student();
		student1.setFirstName("tom"); 
		student1.setLastName("Smith");
		student1.setGradeLevel(12);
		student1.setPhoneNumber("555-555-5454");
		
		student1.introduce();
		
		Student student2 = new Student("Bill", "Brown");
		student2.introduce();
		
		Student student3 = new Student("Frieda", "Granger", "343-343-4433", 12);
		student3.introduce();
				
		
		
	}

}
