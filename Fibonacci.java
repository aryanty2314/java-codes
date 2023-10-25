import java.util.Scanner;

public class Fibonacci
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter how many times you want to print fibonacci series");
        int a=0;
        int b=1;
        int c;
        int n= sc.nextInt();
        System.out.println(a+""+b);
        for (int i=0;i<n;i++)
        {
            c=a+b;
            System.out.print(""+c);
           a=b;
           b=c;

        }
    }
}
