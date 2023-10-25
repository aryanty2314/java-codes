import java.util.Scanner;

public class salaryManagement
{
    public static int hra(int x)
    {
        double hra = (0.3*x);
        System.out.println("your hra is :- "+hra);
        return x;
    }
    public static int ta()
    {
        int ta =2000;
        return ta;
    }
    public static int da(int x)
    {
        double da = 0.2*x;
        System.out.println("your da is :- "+da);
       return x;
    }

    public static int tax(int x)
    {
        double tax =0;
      if(x>0&&x<=10000)
      {
           tax = 0.1*x;
      }
      else if (x>10000&&x<=25000) {
          tax = 0.2*x;
      }
      else if (x>25000&&x<=50000) {
          tax =0.3*x;
      }
      else
      {
          tax = 0.4*x;
      }
        System.out.println(" your tax is :- "+tax);
      return x;
    }
    public static int gross(int x)
    {
        double gross = da(x) + hra(x) + ta();
        System.out.println("YOUR GROSS SALARY IS :- "+gross);
        return x;
    }
 public  static int netSalary(int x)
 {
     double netSalary = gross(x)-tax(x);
     System.out.println("YOUR NET SALARY IS :- "+netSalary);
     return x;
 }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter your salary ");
        int x= sc.nextInt();
        gross(x);
        netSalary(x);
    }
}
