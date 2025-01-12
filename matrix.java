import java.util.*;

public class matrix {
    public static void main(String s[]) {
        Scanner sc = new Scanner(System.in);
        int i=0, j=0;
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int sum[][] = new int[3][3];
        
        System.out.println("Enter First Matrix : ");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print("Enter "+ i +","+ j +" Number :" );        
                 a[i][j]= sc.nextInt();
            }
        }
        System.out.println("\n");
        System.out.println("Enter Second Matrix : ");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print("Enter "+ i +","+ j +" Number :" );        
                 b[i][j]= sc.nextInt();
            }
        }
        System.out.println("\n\nSum of Matrix :");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}






// System.out.println("First matrix is : ");
//         for (i = 0; i < 3; i++) {
//             for(j=0;j<3;j++){
//                 System.out.print(a[i][j]);
//             }
//             System.out.println("\n");
//         }
//         System.out.println("First matrix is : ");
//         for (i = 0; i < 3; i++) {
//             for(j=0;j<3;j++){
//                 System.out.print(a[i][j]);
//             }
//             System.out.println("\n");
//         }
