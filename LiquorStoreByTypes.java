import java.util.Scanner;
class LiquorStoreByTypes {
	static Scanner sc=new Scanner(System.in);
	static String[] beers={"ABC", "heineken","tiger","Yoma" };
	static String[] wines={"apple", "grape","orange"};
	static String[] whiskies={"black lable", "grand royal","high class" };
	static String[] cockttails={"cindrella", "rainbow" };

	static int[] beersPrices={1300,1400,1500,1200};
	static int[] winesPrices={13000,14000,12000};
	static int[] whiskiesPrices={2300,3400,4500};
	static int[] cocktailsPrices={3500,4500};

	static int items,count,total,allTotal=0,i,Number=0;
	static	double tax,grandTotal;
	static int[] price=new int[10];
	static int[] totalArray=new int[10];
	static int[] countArray=new int[10];
	static String[] itemsName=new String[10];

	public static void main(String[] args) {
			String answer;
			System.out.println("Hello, dear customer!\nWhich one do you want?\n");

		do{
			System.out.println("1.beer\n2.wine\n3.whisky\n4.cocktail");
			int types=sc.nextInt();
			chooseItems(types);
			System.out.print("How much do you want?\t");
			count=sc.nextInt();
			switch(types){
			case 1: beerPrices(count,Number);break;
			case 2: winePrices(count,Number);break;
			case 3: whiskyPrices(count,Number);break;
			case 4: cocktailPrices(count,Number);break;
			default: System.out.println("no!");
			}
			Number++;
			allTotal+=total; 
			System.out.println("Need some more!");
			answer=sc.next();
		}while(answer.equals("Yes"));
			System.out.println("====================\n");
			System.out.println("Dear, Customer! This is your voucher.\nPlease check it before outside!\n");
			System.out.println("No.\tItem's name\tPrice\tCount\tTotal");
			System.out.println("===\t===========\t=====\t=====\t=====");
			for(i=0; i<Number; i++)display();
			System.out.println("All Total is \t\t\t:"+allTotal+"ks");
			tax=allTotal*0.05;
			System.out.println("Tax is\t\t\t\t:"+tax+"ks");
			grandTotal= allTotal+tax;
			System.out.println("Grand Total is\t\t\t:"+grandTotal+"ks");
			System.out.println("Thanks for your purchasing!");
	}

	public static void chooseItems(int Type){
			switch(Type){
			case 1: System.out.println("1."+beers[0]+":"+beersPrices[0]+"\n2."+beers[1]+":"+beersPrices[1]+
					"\n3."+beers[2]+":"+beersPrices[2]+"\n4."+beers[3]+":"+beersPrices[3]);
					items=sc.nextInt();	break;
			case 2: System.out.println("1."+wines[0]+":"+winesPrices[0]+"\n2."+wines[1]+":"+winesPrices[1]+
					"\n3."+wines[2]+":"+winesPrices[2]);
					items=sc.nextInt();	break;
			case 3: System.out.println("1."+whiskies[0]+":"+whiskiesPrices[0]+"\n2."+whiskies[1]+":"+whiskiesPrices[1]+
					"\n3."+whiskies[2]+":"+whiskiesPrices[2]);
					items=sc.nextInt();	break;
			case 4: System.out.println("1."+cockttails[0]+":"+cocktailsPrices[0]+"\n2."+cockttails[1]+":"+cocktailsPrices[1]);
					items=sc.nextInt();	break;
			default: System.out.println("No product!");
			}
	}	
	public static void beerPrices(int Count, int number){
			switch(items){
			case 1: itemsName[number]=beers[0];price[number]=beersPrices[0];total=Count*beersPrices[0];break;
			case 2: itemsName[number]=beers[1];price[number]=beersPrices[1];total=Count*beersPrices[1];break;
			case 3: itemsName[number]=beers[2];price[number]=beersPrices[2];total=Count*beersPrices[2];break;
			case 4: itemsName[number]=beers[3];price[number]=beersPrices[3];total=Count*beersPrices[3];
			}
			countArray[number]=Count;
			totalArray[number]=total;
			System.out.println(total);
	}
	public static void winePrices(int Count, int number){
			switch(items){
			case 1: itemsName[number]=wines[0];price[number]=winesPrices[0];total=Count*winesPrices[0];break;
			case 2: itemsName[number]=wines[1];price[number]=winesPrices[1];total=Count*winesPrices[1];break;
			case 3: itemsName[number]=wines[2];price[number]=winesPrices[2];total=Count*winesPrices[2];
			}
			countArray[number]=Count;
			totalArray[number]=total;
			System.out.println(total);
	}
	public static void whiskyPrices(int Count, int number){
			switch(items){
			case 1: itemsName[number]=whiskies[0];price[number]=whiskiesPrices[0];total=Count*whiskiesPrices[0];break;
			case 2: itemsName[number]=whiskies[1];price[number]=whiskiesPrices[1];total=Count*whiskiesPrices[1];break;
			case 3: itemsName[number]=whiskies[2];price[number]=whiskiesPrices[2];total=Count*whiskiesPrices[2];
			}
			countArray[number]=Count;
			totalArray[number]=total;
			System.out.println(total);
	}
	public static void cocktailPrices(int Count, int number){
			switch(items){
			case 1: itemsName[number]=cockttails[0];price[number]=cocktailsPrices[0];total=Count*cocktailsPrices[0];break;
			case 2: itemsName[number]=cockttails[1];price[number]=cocktailsPrices[1];total=Count*cocktailsPrices[1];
			}
			countArray[number]=Count;
			totalArray[number]=total;
			System.out.println(total);
	}
	public static void display(){
			System.out.println(i+1+".\t"+itemsName[i]+"\t"+price[i]+"\t"+countArray[i]+"\t"+totalArray[i]+"ks");
	}
}