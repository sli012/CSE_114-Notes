import java.util.Scanner;

public class WK3_SelectionNotes {

	public static void main(String[] args) {
	
		System.out.println("Choose an option: ");
		System.out.println("A: Burger");
		System.out.println("B: Fries");
		System.out.println("C: Fruit");
		Scanner input = new Scanner(System.in);
		char ch = input.nextLine().charAt(0);
		
		 //FOR BREAKS
		switch(ch) {
		case 'a':
		case 'A': System.out.println("Burgers");
				//break; // this break helps us exit when we want to exit the code. 
		case 'b':
		case 'B': System.out.println("Fries");
				break;
		case 'c':
		case 'C': System.out.println("Fruit");
				break;
				
		default: System.out.println("Not available");
		}
		System.out.println("Bye");
	
		//Code outputs your choice only
	
		/*
		if(ch == 'a' || ch == 'A')
			System.out.println("Burgers");
		else if(ch == 'b' || ch == 'B');
			System.out.println("Fries");
		else
			System.out.println("Not available");
		*/
	
	int i = 10 - 5 - 4 - 1; //((10-5)-4)-1
	System.out.println(i);
	
	
	int j = 10-(5-(4-1));
	System.out.println(j);
		
	int x = 5;
	int y = 8;
	int z = 11;
	x -=y += z; //x-=(y+=z)
	System.out.print(x +" "+ y+""+ z);
		
	}
}
