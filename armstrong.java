import java.util.Scanner;

public class armstrong
{
    int length(int num)
    {

        int count =0;
        while (num!=0)
        {

            num=num/10;
            count=count+1;
        }
        return count;

    }
    void power(int base,int exp)
    {

    }
    void isarmstrong(int num)
    {

        int number=num;
        int length = length(number);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter any number ");
        int num = sc.nextInt();

    }

}


