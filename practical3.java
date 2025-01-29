import java.util.Scanner;
class practical3{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number : ");
		int a = sc.nextInt();
		int remainder;
		while(a%10 != 0){
			remainder = a%10;
			System.out.print(remainder);
			a = a/10; 
		}
		sc.close();
	}
}