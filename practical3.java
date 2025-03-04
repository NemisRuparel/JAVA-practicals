import java.util.Scanner;
class practical3{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int reverse = 0;

		System.out.println("Enter Number : ");
		int a = sc.nextInt();
		while(a>0){
			reverse = (a%10);
			a = a/10; 
			System.out.print(reverse);
		}
		sc.close();
	}
}