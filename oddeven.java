import java.util.Scanner;

public class oddeven
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter any number ");
        int n = sc.nextInt();
        for (int i=0 ;i<n;i++)
        {
            if (i%2==0)
            {
                System.out.println(" EVEN :"+i);
            }
            else
            {
                System.out.println(" ODD : "+i);
            }
        }
    }
}
