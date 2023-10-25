import java.util.Scanner;

public class prime
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter any number ");
        int flag = 1;
        int n = sc.nextInt();
        for (int i=2;i<=n/2;i++)
        {
          if(n%i==0)
          {
              flag=0;
              break;
          }
        }
        if (flag==0)

        {
            System.out.println("NOT PRIME :"+n);
        }
        else
        {
            System.out.println("PRIME :"+n);
        }
    }
}
