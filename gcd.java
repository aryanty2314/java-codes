import java.util.Scanner;

public class gcd
{
    public static void Gcd(int x,int y)
    {
        int gcd = 0;
        for (int i=1;i<=x&&i<=y;i++)
        {
            if (x%i==0&&y%i==0)
            {
                gcd=i;
            }
        }
        System.out.println(" GCD :- "+gcd);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two number whose gcd you want to find ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Gcd(a,b);
    }
}
