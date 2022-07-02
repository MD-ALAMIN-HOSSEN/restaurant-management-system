import java.util.*;  
public class order{

	private static food[] foodMeanu = new food[100];// food meanu storing array
	private static double [] orderList = new double[100];//  orrder id holding array
	public  static  double[] quantityOfEachFood=new double[100]; // order quantity holding array
	public  static  double[] totallPriceOfeachFoodItem=new double[100];// holding the total valu of each food total array
	private static int count = 0;// counting the food enterd in meanu
	private static int countorderList=0;// counting the the number of food item ordered
	private static int countFoodQuantity = 0;// counting the quantity of each food ordered
	private static int counttotallPriceOfeachFoodItem = 0;// counting the the number of totall valu for each food is calulated and stored
	
	

	static void addFood(food f){// adding food to meanu meathod	
		foodMeanu[count] = f;
		count++;	
	}
	
	static void removeproduct(int info){ // remove food from the meanu methode
		int decision = searchproduct(info);
		if(decision >= 0){
			foodMeanu[decision] = null;
			System.out.println("Food Deleted\n");
			showAll();
		}
	}
	
	static int searchproduct(int info){// searcing food by its id methode
		boolean found = false;
		for(int index=0; index < count; index++){
			int value = foodMeanu[index].getId();
			if(info == value){
				found = true;
				System.out.println("Food Found");
				foodMeanu[index].showDetails();
				return index;
			}
		}
		
		if(!found)
			System.out.println("Food Not Found");

		return -1;
	}
	
	 static void billOrder(){// bill prosesing main methode
		System.out.println("Bill Generation[Press appropirate keys for different option]");
		showAllMeanueFoodName();
		setorderList();
		calculatetotallbill();
		
	}
	
	
	static void showAllMeanueFoodName(){// show all meanu food to the user to select meathod
		for(int index=0; index < count; index++){
			if(foodMeanu[index] != null){
				int i=0;
				i=index+1;
				System.out.println(i+"."+foodMeanu[index].getName());
				//foodMeanu[index].getName();
					
			}			
		}
		System.out.println("0 to make the bill");
	}
	
	static int k=1;		
	static void setorderList(){ // setting orderlist array with the food id
		System.out.println("p"+k+ ":");
		k++;
		Scanner sc= new Scanner(System.in);
		int or= sc.nextInt();
		
		switch(or){
			case 1:
				orderList[countorderList]=or;
				countorderList++;
				setquantityOfEachFood();
				break;
				
			case 2:
				orderList[countorderList]=or;
				countorderList++;
				setquantityOfEachFood();
				break;

            case 3:			
								
				orderList[countorderList]=or;
				countorderList++;
				setquantityOfEachFood();
				break;
			case 4:	
				orderList[countorderList]=or;
				countorderList++;
				setquantityOfEachFood();
				break;
			case 5:
				orderList[countorderList]=or;
				countorderList++;
				setquantityOfEachFood();
				
				break;
			case 6:	
				orderList[countorderList]=or;
				countorderList++;
				setquantityOfEachFood();
				
				break;
			case 7:					
				orderList[countorderList]=or;
				countorderList++;
				setquantityOfEachFood();
				
				break;
			case 8:		
				orderList[countorderList]=or;
				countorderList++;
				setquantityOfEachFood();
				
				break;
			case 9:	
				orderList[countorderList]=or;
				countorderList++;
				setquantityOfEachFood();
				
				break;
			case 10:			
				orderList[countorderList]=or;
				countorderList++;
				setquantityOfEachFood();
				
				break;
            case 0:			
				System.out.println();
				System.out.print("Total Bill");
				System.out.println(" ");
				
				break;
			default: System.out.println("Incorrect input!!! there is no food of this id!!!! Please re-enter choice of food from our menu");
			setorderList();
				
	}
	}
	
	
	static void setquantityOfEachFood(){// taking the quantity input of each food and setting the quantityofeach food array
		System.out.println("quantity :");
		Scanner sc= new Scanner(System.in);
		int quantity= sc.nextInt();
		if (quantity>0){
			quantityOfEachFood[countFoodQuantity]=quantity;
				countFoodQuantity++;
				//quantity=-1;
		}

		setorderList();
	}
	
	
	static void showAll(){// print all details of all food
		for(int index=0; index < count; index++){
			if(foodMeanu[index] != null){	
			foodMeanu[index].showDetails();
				
			}			
		}
	}
	
	
	static void calculatetotallbill(){// calculating the totall price of each food and adding them in toallpriceofeachfood array //suming the stored totall prices  using totalpriceofeachfood 
		double totallbill;
		settotallPriceOfeachFoodItem();
	    totallbill=calculateTotallOfAllFoodOnOrderList();
		System.out.println("totall bill is ="+totallbill);
		counttotallPriceOfeachFoodItem = 0;
	    countFoodQuantity=0;
	    countorderList = 0;
		start();// starting the appliaction from taking input		
	}
	
	static void settotallPriceOfeachFoodItem(){//calculating the totall price of each food and adding them in toallpriceofeachfood array
		double totalPriceOfEachFood;
		for(int index=0;index<countorderList;index++){
		int e=-1;
		e=getingTheIndexNumberOfaFoodByItsId(index);
		System.out.print(" "+foodMeanu[e].getName()+"     "+quantityOfEachFood[index]+"x");/////////////////////////////////////////////////////////////
		System.out.print(foodMeanu[e].getPrice());/////////////////////////////////////////////////////////////////////////////////////
		totalPriceOfEachFood=foodMeanu[e].getPrice()*quantityOfEachFood[index];
	    System.out.println(" = "+totalPriceOfEachFood);
		totallPriceOfeachFoodItem[index]=totalPriceOfEachFood;
		counttotallPriceOfeachFoodItem++;
		
		}
	}
	
	static double calculateTotallOfAllFoodOnOrderList(){
		double totall=0;
		for(int index=0;index<counttotallPriceOfeachFoodItem;index++){
		totall = totall + totallPriceOfeachFoodItem[index];
		}
		return totall;
		
	}
	
	static int getingTheIndexNumberOfaFoodByItsId(int info){//geting The IndexNumber  Of a Food By Its Id  methode
		int y=-1;
		double x=orderList[info];
		for(int index=0; index < count; index++){
			int value = foodMeanu[index].getId();
			if(x == value){
				y= index;
			}
		}
		if(y==-1){
			System.out.println("The food item you are looking for does not exist");
			
		}
		return y;
	}	
	
	
	static void start(){// strting the program and thating fist options
		System.out.println();
		System.out.println("Welcome to Store");
		System.out.println("Options: Press appropirate keys for different option");
		System.out.println("1. Add Food");
	    System.out.println("2. Remove Food");
		System.out.println("3. Search Food");
		System.out.println("4. Billing");
		System.out.println("10. Exit");
		System.out.println("Enter value:");
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		
		switch(a){
			case 1:// adding food case
             System.out.println("Give Food an id number of Food:");
		     int id= sc.nextInt();
		     System.out.println("Give Food a Name of Food:");
		     String name= sc.next();
		     System.out.println("Give Food a price of Food:");
			 int price= sc.nextInt();
			 System.out.println("problem found");
			 showAll();			
			food f= new food( id,name,price );
			addFood(f);
			count++;
			showAll();
			
			start();
			break;
			case 2: // removing food case
			System.out.println("give the product id you waant to remove:");
			int b=sc.nextInt();
			removeproduct(b);
			start();
			break;
			case 3:
			System.out.println("give the product id you waant to Search:");
			int c=sc.nextInt();
			searchproduct(c);
		    start();
			break;
			case 4:// bill order prosesing case
			  billOrder();
			break;
			case 10: System.out.println("Application closed. Thank you.");//closing  appliication case
			System.exit(0);
			default: System.out.println("Incorrect input!!! Please re-enter choice from our menu");
			}
		
		}
	
	
 }
 