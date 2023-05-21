import java.util.*;
import java.lang.*;





interface utility{
	
	public void getdetails();
	
	public void setdetails();
}  

public class Main {
	
	
	static void main_menu() {
		System.out.println("============================Welcome to the Showroom============================");
		System.out.println();
		System.out.println("===============================Ehter your Choice===============================");
		System.out.println("1.Add Showroom 2. Add Employees 3. Add Cars");
		System.out.println("4.Get Showroom 5.Get Employees 6.Get Cars");
		System.out.println();
		System.out.println("================================Enter 0 to exit===================================");
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Showroom showroom[]=new Showroom[5];
		Employee employee[]=new Employee[5];
		Car car[]=new Car[5];
		 int car_counter=0;
		 int showroom_counter=0;
		 int employee_counter=0;
		 int choice=100;
		 
		 
		 while(choice!=0) {
			 main_menu();
			 choice=sc.nextInt();
			 
			 
			 while(choice!=9 && choice!=0) {
				 switch(choice) {
				 case 1:
					 showroom[showroom_counter]=new Showroom();
					 showroom[showroom_counter].setdetails();
					 showroom_counter++;
					 System.out.println();
					 System.out.println("1.Add new showroom");
					 System.out.println("9.go back to main menu");
					 choice=sc.nextInt();
					 break;
				 case 2:
					 employee[employee_counter]=new Employee();
					 employee[employee_counter].setdetails();
					 employee_counter++;
					 System.out.println();
					 System.out.println("1.Add new employee");
					 System.out.println("9.go back to main menu");
					 choice=sc.nextInt();
					 break;
				 case 3:
					 car[car_counter]=new Car();
					 car[car_counter].setdetails();
					 car_counter++;
					 System.out.println();
					 System.out.println("1.Add new employee");
					 System.out.println("9.go back to main menu");
					 choice=sc.nextInt();
				 case 4:
					 for (int i=0; i<showroom_counter;i++) {
						 showroom[i].getdetails();
						 System.out.println();
						 System.out.println();
						 
					 }
					 System.out.println();
					 System.out.println("4.Get Showroom");
					 System.out.println("9.go back to main menu");
					 choice=sc.nextInt();
					 break;
				 case 6:
					 for (int i=0; i<car_counter;i++) {
						 car[i].getdetails();
						 System.out.println();
						 System.out.println();
						 
					 }
					 System.out.println();
					 System.out.println("4.Get Showroom");
					 System.out.println("9.go back to main menu");
					 choice=sc.nextInt();
					 break;
				 case 5:
					 for (int i=0; i<employee_counter;i++) {
						 employee[i].getdetails();
						 System.out.println();
						 System.out.println();
						 
					 }
					 System.out.println();
					 System.out.println("4.Get Showroom");
					 System.out.println("9.go back to main menu");
					 choice=sc.nextInt();
					 break;
				default:
					System.out.println("Enter valid choice");
					break;
				
				
				 }
			 }
		 }
		
		
		

	}

}
