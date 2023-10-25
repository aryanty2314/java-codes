import java.util.Scanner;

public class sumodd
{
    public static int oddAverage(int x)
    {
        int sum =0;
        for (int i=1;i<=x;i++ )
        {
            if(i%2!=0)
            {
                sum+=i;
            }
        }
        System.out.println(sum);
            return x;
        }

   public static void main(String[] args)
   {
       Scanner sc = new Scanner(System.in);
       System.out.println(" enter the value of n ");
       int x = sc.nextInt();
       oddAverage(x);

    }
}







