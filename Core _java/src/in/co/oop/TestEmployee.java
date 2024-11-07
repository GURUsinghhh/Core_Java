package in.co.oop;


public class TestEmployee {
public static void main(String[] args) {
	Employee e = new Employee();
	e.setName("aman");
	e.setId("12345");
	e.setSallary(1000000);
	System.out.println(e.getName());
	System.out.println(e.getId());
	System.out.println(e.getSallary());
}
}
