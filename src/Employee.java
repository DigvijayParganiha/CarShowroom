import java.util.Scanner;
import java.util.UUID;



public class Employee extends Showroom implements utility {

	String emp_id;
	 String emp_name;
	 String emp_dept;
	 int emp_age;
	 
	 
	 public void getdetails() {
		 	System.out.println("Employee ID is"+emp_id);
		 	System.out.println("Employee Name"+ emp_name);
			System.out.println("Employee Department is: "+emp_dept);
			System.out.println("Employee age: "+ emp_age);
			System.out.println("Showroom Address: "+Address);
	 }
	 
	 
	 public void setdetails() {
		 	Scanner sc=new Scanner(System.in);
		 	UUID uuid=UUID.randomUUID();
		 	
		 	System.out.println("Employee ID is: +");
		 	emp_id=String.valueOf(uuid);
			System.out.println("Employee Name:");
			emp_name=sc.nextLine();
			System.out.println("Employee Department is: ");
			emp_dept=sc.nextLine();
			System.out.println("Employee age: ");
			emp_age=sc.nextInt();
			System.out.println("Enter Showroom Name:");
			Showroom_name=sc.nextLine();
			car_stock++;
	 }
	 
}
