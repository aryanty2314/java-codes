import java.util.Scanner;

public class fibonacci
{
    public static void fib(int x)
    {
    int a=0;
    int b=1;

    for (int i=0;i<x;i++)
    {
        if (i==0)
        {
            System.out.print(""+a+b);
        }
            int c = a + b;
            System.out.print(""+c);
            a = b;
            b = c;


    }
    return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter any number ");
        int n = sc.nextInt();
       fib(n);
    }
}
