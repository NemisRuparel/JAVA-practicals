import java.util.Scanner;
class UserInput{
	public static void main(String s[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value : ");
		int num = sc.nextInt();		
		int i;

		System.out.println("You Entered  : "+ num);

		for(i=0;i<=num;i++)
		{
			System.out.println(i);
		}
		sc.close();
	}
}		