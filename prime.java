import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();
        int counter = 0;
        int flag;

        for (int num = 2;; num++) {
            flag = 0;
            for (int div = 2; div < num; div++) {
                if (num % div == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(num);
                counter++;
                if (counter == n) {
                    break;
                }
            }
        }
        sc.close();
    }
}
