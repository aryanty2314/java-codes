import java.util.Scanner;

public class factorial
{
 public static void factorial(int x)
{
if (x<0)
{
    System.out.println("INVALID");
    return;
}
        int fact = 1;
        for (int i = 1; i <=x; i++) {
            fact = fact * i;
        }
    System.out.println(fact);
    return ;
}

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the value whose factorial you want to print ");
        int x= sc.nextInt();
       factorial(x);

    }
}
