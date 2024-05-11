public class Main {
	public static void main(String[] args) {
		Invoice[] invoices = {
			new Invoice("Monitor", 1, 1000000),
			new Invoice("Mouse", 2, 200000),
			new Invoice("Keyboard", 1, 500000)
		};

		Employee employee = new Employee(12345, "Azriel Maulani", 5000000, invoices);

		System.out.println(employee);
	}
}
