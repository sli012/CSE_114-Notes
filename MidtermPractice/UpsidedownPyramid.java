import java.util.Scanner;

public class UpsidedownPyramid {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		
		int row = input.nextInt();
		
		
		for(int i = 0; i <=row; i++)
		{
			
			for(int j = i; j > 0; j--)//space start at 0 increment by each row
			{
				System.out.print(" ");
			}
			for(int j = i+1; j <row ; j++) //left side starts at the row number +1 and 
			{								//continues until the number before row#
				System.out.print(j+ " "); 
			}
			for(int j = row; j >i; j-- ) //right side  starts at row num 
			{							//and decreases until j is greater than row num
				System.out.print(j+ " ");
			}
			System.out.println("");
		}
		
	

		
		// 1d 
		System.out.println('A'+1); //= char(2bytes) + int(4bytes) = int
		System.out.println((char)'A'+1);
		
		//1h modified to get last 2 digits
		System.out.println(2020%1000);
		//1 i
		System.out.println(13-2+25%5/8-3); //(13-2) + ((25%5) / 8) - 3
		System.out.println(2/8);
		
		double result = 4.64323423434324;
		System.out.printf("%.4f", result);
		
		//5 a
		int x = 1;
		System.out.println(!(x > 0) && (x > 0));
		
		//5b
		char ch = 'a';
		switch (Character.toUpperCase(ch)) {
		case 'A': System.out.print(ch); break;
		case 'B': System.out.print(ch); break;
		case 'C': System.out.print(ch); break;
		case 'D': System.out.print(ch); break;
		default: System.out.print(ch);
	
		}
		}

}
