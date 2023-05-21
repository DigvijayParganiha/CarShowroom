
import java.util.Scanner;

public class Showroom implements utility {
	
	String Showroom_name;
	String Address;
	int No_of_Employee;
	int total_cars=0;
	String Manager_name;
	int car_stock;
	
	@Override
	public void getdetails() {
		System.out.println("Enter Showroom Name: "+Showroom_name);
		System.out.println("Showroom Address: "+Address);
		System.out.println("Number of Employees:  "+ No_of_Employee);
		System.out.println("Total Number of Cars: "+total_cars);
		System.out.println("Manager Name: "+Manager_name);
		System.out.println("CArs in stock: "+car_stock);
		

		
		
		
	}

	@Override
	public void setdetails() {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("======================================== Enter SHowroom Details====================");
		System.out.println();
		System.out.println("Enter Showroom Name:");
		Showroom_name=sc.nextLine();
		System.out.println("Showroom Address: ");
		Address=sc.nextLine();
		System.out.println("Number of Employees:  ");
		No_of_Employee=sc.nextInt();
		System.out.println("Total Number of Cars: ");
		total_cars=sc.nextInt();
		System.out.println("Manager Name: ");
		Manager_name=sc.nextLine();

		
		
	}
	

}
