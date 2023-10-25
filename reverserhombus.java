import java.util.Scanner;

public class reverserhombus
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the size of rhombus ");
        int n = sc.nextInt();
        for (int i = n; i >=0; i--) {
            for (int j = i; j >0; j--)
            {
                System.out.print(" ");
            }
            for (int z=1;z<=n;z++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
