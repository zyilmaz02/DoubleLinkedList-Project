import java.util.Scanner;

public class TestingClass {

	public static void main(String[] args) {
		DoubleLinkedList DL = new DoubleLinkedList();
		
	System.out.println("please enter the number of Car to append :");
	int n = Integer.parseInt(new Scanner(System.in).nextLine());
	for (int i = 0; i<n; i++) {
		Car Cr= new Car();
		DL.appendtohead(Cr);
	}
	System.out.println("please choose from following oparation ");
	System.out.println("for appending to head press 1 , " +"\n"+ "for appeding tail press 2," + "\n" + "for removing from head press 3," + "\n"+ "for removing from tail 4"+"\n"
	+"for search press 5" + "\n"+ "for deletion press 6");
	int s = Integer.parseInt(new Scanner(System.in).nextLine());
	while(s==1 || s==2 || s== 3 || s==4 || s==5 || s== 6){
		if (s==1) {
			Car cr = new Car();
			DL.appendtohead(cr);
			System.out.print("\n");
		};
		if(s == 2) {
			Car cr= new Car();
			DL.appendtotail(cr);
			System.out.print("\n");
		};
		if(s == 3){
			Node x=DL.removefromhead();
			System.out.println("removed node is ");
			System.out.printf("Make = %s "+"\n"+ "Model= %s"+"\n"+" year= %d" + "\n"+"Mileage=%d"+ "\n"+"Price=%f"+"\n", x.item.Make,x.item.Model,x.item.Year,x.item.mileage,x.item.price);
			System.out.print("\n");
		};
		if( s == 4) {
			Node x=DL.RemoveFromTail();
			System.out.println("removed node is ");
			System.out.printf("Make = %s "+"\n"+ "Model= %s"+"\n"+" year= %d" + "\n"+"Mileage=%d"+ "\n"+"Price=%f"+"\n", x.item.Make,x.item.Model,x.item.Year,x.item.mileage,x.item.price);
			System.out.print("\n");
		};
		if(s == 5) {
			System.out.println("please enter Car maker :");
			String make=new Scanner(System.in).nextLine();
			System.out.println("plase enter model:");
			String model=new Scanner(System.in).nextLine();
			System.out.println("enter the year of the car :");
			int year=Integer.parseInt(new Scanner(System.in).nextLine());
			Node find = DL.search(year, model, make);
			if(find == null) {
				System.out.println("there is no such car");
			}
			else {
				System.out.printf("Make = %s "+"\n"+ "Model= %s"+"\n"+"year= %d" + "\n"+"Mileage=%d"+ "\n"+"Price=%2f"+"\n", find.item.Make,find.item.Model,find.item.Year,find.item.mileage,find.item.price);
			}
			System.out.print("\n");
		};
		if(s == 6) {
			System.out.println("please enter Car maker :");
			String make=new Scanner(System.in).nextLine();
			System.out.println("plase enter model:");
			String model=new Scanner(System.in).nextLine();
			System.out.println("enter the year of the car :");
			int year=Integer.parseInt(new Scanner(System.in).nextLine());
		    DL.delete(year, model, make);
		    System.out.print("\n");
		};
		System.out.println("please choose from following oparation ");
		System.out.println("for appending to head press 1 , " +"\n"+ "for appeding tail press 2," + "\n" + "for removing from head press 3," + "\n"+ "for removing from tail 4"+"\n"
		+"for search press 5" + "\n"+ "for deletion press 6");
	    s = Integer.parseInt(new Scanner(System.in).nextLine());
		
	};
	
	
	
	}

}
