import java.util.Scanner;

public class simple_interest
{
    static void interest(int p,int r,int t)
    {
        double si = ((p*r*t)/100);
        System.out.println(" your simple interest is :- "+si);
        return ;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the principle :- ");
        int p= sc.nextInt();
        System.out.println(" enter the rate of interest :- ");
        int r= sc.nextInt();
        System.out.println(" enter the time duration :- ");
        int t= sc.nextInt();

        interest(p,r,t);
    }
}
