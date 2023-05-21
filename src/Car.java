import java.util.Scanner;

public class Car extends Showroom implements utility {
	
	String Car_Name;
	String Car_model;
	int year;
	String color;
	
	
	@Override
	public void getdetails() {
		System.out.println("Car name is:"+ Car_Name);
		System.out.println("The model of the car is:"+Car_model);
		System.out.println("Manufacturing year"+ year);
		System.out.println("Color_of_color"+color);
		System.out.println("Enter Showroom Name: "+Showroom_name);
		
	}
	
	@Override
	public void setdetails() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Car name is:");
		Car_Name=sc.nextLine();
		System.out.println("The model of the car is:");
		Car_model=sc.nextLine();
		System.out.println("Manufacturing year");
		year=sc.nextInt();
		System.out.println("Color_of_color");
		color=sc.nextLine();
		System.out.println("Enter Showroom Name:");
		Showroom_name=sc.nextLine();
		
		
		
		
		
	}
	
	
	
	

}
