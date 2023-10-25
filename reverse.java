import java.util.Scanner;

public class reverse
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter any number ");
        int x = sc.nextInt();
        int rev=0;
        while (x!=0)
        {
           int n=x%10;
           rev=rev*10+n;
           x=x/10;
        }
        System.out.println(" reverse number : "+rev);
    }
}
