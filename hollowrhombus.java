import java.util.Scanner;

public class hollowrhombus
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the size of rhombus ");
        int n = sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j < i; j++) {

                    System.out.print(" ");

            }
            for (int z=1;z<=n;z++)
            {
                if(i==1||i==n||z==1||z==n) {
                    System.out.print("*");

                }else
                {
                    System.out.print(" ");
            }
            }
            System.out.println();
        }
    }
}
