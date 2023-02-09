import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		int num;
		int wanted;
		int count;
		int array[];
				
		num = sc.nextInt();
		array = new int[num];
		
		for(int i=0; i<num; i++) {
			array[i] = sc.nextInt();
		}
		
		wanted = sc.nextInt();
		count = 0;
		
		for(int i=0; i<num; i++) {
			if(wanted == array[i])
				count++;
		}
		
		System.out.println(count);
		
		
	}
}
