import java.util.Scanner;
class Hotel {
	static Scanner sc=new Scanner(System.in);
	static String roomStringType;
	static int grandTotal,price;
	// static objects can be used by every static methods and classes!

	static int[] prices= {100,80,60}; 
	//for changes from database!
	//usages of array *to connect from domain to sever:

	public static void main(String[] args) {
//	Scanner sc=ner Scanner(System.in);
	System.out.print("Enter customer name: \t");
	String customerName=sc.nextLine();
	System.out.print("\n");

	System.out.println("1: Sea View-"+prices[0]);
	System.out.println("2: Second Sea View-"+prices[1]);
	System.out.println("3: Garden View-"+prices[2]);
	System.out.print("Choose room type[1,2,3]:\t");
	int roomType=sc.nextInt();	
	System.out.print("Enter number of rooms:\t");
	int roomCount=sc.nextInt();
	System.out.println();

/*	switch(roomType){
	case 1: System.out.println("Daily charge:\t"+(prices[0]*roomCount));break;
	case 2: System.out.println("Daily charge:\t"+(prices[1]*roomCount));break;
	case 3: System.out.println("Daily charge:\t"+(prices[2]*roomCount));break;
	default: System.out.println("Check above info: ");
	}
*/
	process(roomType, roomCount);
	display(customerName, roomCount);
//	System.out.println("Detail:\t"+process(roomType, roomCount));
	
	}
	public static void process(int roomtype, int roomcount){
		if(roomtype==1){
			grandTotal= prices[0]*roomcount;
			roomStringType="Sea View";
			price=prices[0];
		}
		else if(roomtype==2){
			grandTotal= prices[1]*roomcount;
			roomStringType="Second Sea View";
			price=prices[1];
		}
		else {
			grandTotal= prices[2]*roomcount;
			roomStringType="Garden View";
			price=prices[2];
		}
	}

	public static void display(String customername, int roomcount){
		System.out.println("\nNgapali Vacation");
		System.out.println("================");
		System.out.println("Customer name is :\t"+customername);
		System.out.println("Room Type :\t"+roomStringType);
		System.out.println("Room price :\t"+price);
		System.out.println("Number of rooms :\t"+roomcount);
		System.out.println("Grand Total :\t"+grandTotal);
		System.out.println("Thank you for using our rooms.");
	}

}