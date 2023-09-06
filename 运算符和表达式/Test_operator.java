import java.util.Scanner;

public class Test_operator {
	public static void main(String[] args) {
		int a,b;
		Scanner input = new Scanner(System.in);
		
		System.out.print("input a number: ");
		a = input.nextInt();
		System.out.print("input another number: ");
		b = input.nextInt();
			  
			 
	
		
		  System.out.printf("a+b = %d\n",a+b); 
		  System.out.printf("a-b = %d\n",a-b);
		  System.out.printf("a*b = %d\n",a*b); 
		  System.out.printf("a/b = %d\n",a/b);
		  System.out.printf("a%%b = %d\n",a%b);

	}
}

