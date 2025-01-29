import java.util.*;
class practical2{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Num a : ");
		int a = sc.nextInt();	
		
		System.out.println("Enter Num b : ");
		int b = sc.nextInt();		
		
		System.out.println("Enter Num c : ");
		int c = sc.nextInt();

		if(a>b && a>c){
			System.out.println("a is Maximum");	
		}
		else if(b>c){
			System.out.println("b is Maximum");
		}
		else{
			System.out.println("c is Maximum");
		}
		sc.close();
	}
}