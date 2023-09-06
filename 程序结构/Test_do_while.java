public class Test_do_while {
	public static void main(String[] args) {
		int i,sum;
		i = 0;
		sum = 0;
		do {
			
			sum += i;
			i++;
		}while(i <= 100);
		
		System.out.println(sum);
	}

}

