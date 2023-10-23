import java.util.Scanner;

public class Que1 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter any number");
			int num;
			num= sc.nextInt();
			
			
			for(int i=num;i<=num*10;i=i+num)
			{
				
				System.out.println(i);
	}

	}
}
