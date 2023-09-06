import java.util.Scanner;

public class Test_if {
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		int age;
		System.out.print("请输入你的年龄: ");
		age = input.nextInt();
		
		if(age < 18 && age > 0) {
			System.out.println("你还是个小朋友");
		}else if(age >= 18) {
			System.out.println("你已经成年了");
		}else {
			System.out.println("年龄输入有误");
		}
	}
}

