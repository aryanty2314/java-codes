import java.util.Scanner;

public class leapyr
{
    static int leapyr(int yr)
    {
        if((yr%4==0&&yr%100!=0)||(yr%400==0))
        {
            System.out.println(yr+"is leap year ");
        }
        else {
            System.out.println(" not a leap year");
        }
        return yr;
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println(" enter the year ");
        int year = sc.nextInt();
        leapyr(year);
    }
}

