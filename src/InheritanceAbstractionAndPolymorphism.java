
public class InheritanceAbstractionAndPolymorphism {

	public static void main(String[] args) {
		
		Employee salary = new SalariedEmployee("Tom", "Sawyer", 2500.00);
		Employee hourly = new HourlyEmployee("Gene", "Harris", 16.00, 75.5);
		Employee manager = new Manager("Faith", "Bennet", 4500.00, 6.5);
		
		System.out.println(salary.calculatePay());
		System.out.println(hourly.calculatePay());
		System.out.println(manager.calculatePay());
	}

}
