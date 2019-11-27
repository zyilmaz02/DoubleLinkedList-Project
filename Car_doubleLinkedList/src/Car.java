import java.util.Scanner;

public class Car {
	public String Make;
	public String Model;
	public int Year;
	public int mileage;
	public float price;
	
	 Car(){
		 System.out.println("please enter the Make:");
		 this.Make = new Scanner(System.in).nextLine();
		 System.out.println("please enter the Model:");
		 this.Model=new Scanner(System.in).nextLine();
		 System.out.println("Enter the Year:  ");
		 this.Year=Integer.parseInt(new Scanner(System.in).nextLine());
		 System.out.println("Enter the mileage: ");
		 this.mileage=Integer.parseInt(new Scanner(System.in).nextLine());
		 System.out.println("Enter the Price : ");
		 this.price=Float.parseFloat(new Scanner(System.in).nextLine()); 
	 }


}
