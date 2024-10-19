import java.util.Scanner;
class LiquorStore {
	static Scanner sc=new Scanner(System.in);
	static int types,items,count,total;

	static String[][] namesOfItems={{"ABC","tiger","heineken","Yoma"},
		{"high class","Grand Royal","black label"},{"Apple","Grape","Orange"},{"cindrella","guava drink"}};
	static int[][] prices={{1200,1300,1400,1500},
		{13000,15000,17000},{20000,25000,18000},{11000,12000}};

	public static void main(String[] args) {
		System.out.print("Enter customer name:\t");
		String customer=sc.nextLine();

		System.out.println("Choose a type!\n1.beer\n2.whiskey\n3.wine\n4.Mocktail");
		types=sc.nextInt();
		ShowItems(types,items,count, total);
		System.out.print("How much do you want?\t");
		count=sc.nextInt();

		System.out.println(total);//total==0answer?


	}

	public static void ShowItems(int Type,int Items,int Count,int Total){
		switch(Type){
		case 1: System.out.println("Choose one item!\n1."+namesOfItems[0][0]+"\t"+prices[0][0]+"\n2."+namesOfItems[0][1]+"\t"
				+prices[0][1]+"\n3."+namesOfItems[0][2]+"\t"+prices[0][2]+"\n4."+namesOfItems[0][3]+"\t"+prices[0][3]);
				Items=sc.nextInt();
				switch(Items){
				case 1: Total=Count*prices[0][0];break;
				case 2: Total=Count*prices[0][1];break;
				case 3: Total=Count*prices[0][2];break;
				case 4: Total=Count*prices[0][3];break;
				default: System.out.println("Nah!");
				};
				break;
		case 2:System.out.println("Choose one item!\n1."+namesOfItems[1][0]+"\t"+prices[1][0]+"\n2."+namesOfItems[1][1]+"\t"
			  +prices[1][1]+"\n3."+namesOfItems[1][2]+"\t"+prices[1][2]);
				Items=sc.nextInt();
				switch(Items){
				case 1:Total=Count*prices[1][0];break;
				case 2:Total=Count*prices[1][1];break;
				case 3:Total=Count*prices[1][2];break;
				default: System.out.println("Nah!");
				};
				break;
		case 3:System.out.println("Choose one item!\n1."+namesOfItems[2][0]+"\t"+prices[2][0]+"\n2."+namesOfItems[2][1]+"\t"
				+prices[2][1]+"\n3."+namesOfItems[2][2]+"\t"+prices[2][2]);
				Items=sc.nextInt();
				switch(Items){
				case 1:Total=Count*prices[2][0];break;
				case 2:Total=Count*prices[2][1];break;
				case 3:Total=Count*prices[2][2];break;
				default: System.out.println("Nah!");
				};
				break;
		case 4:System.out.println("Choose one item!\n1."+namesOfItems[3][0]+"\t"+prices[3][0]+"\n2."+namesOfItems[3][1]+"\t"+prices[3][1]);
				Items=sc.nextInt();
				switch(Items){
				case 1: Total=Count*prices[3][0];break;
				case 2: Total=Count*prices[3][1];break;
				default: System.out.println("Nah!");
				break;
				}
		default:System.out.println("There is no in my store. Please choose again!");
		}
		System.out.println("\t");

	}

 
	}
