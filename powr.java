import java.util.Scanner;

public class powr
{
    public static void power(double a,double b)
    {
        double pow =Math.pow(a,b);
        System.out.println(pow);
        return ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the numbers ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        power(a,b);
    }
}
