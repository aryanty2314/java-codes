import java.util.Scanner;

public class palindrome
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter any number ");
        int n=sc.nextInt();
        int r=n;
        int rev =1;
        while (n!=0)
        {
            int x = n%100;
                rev = rev*10+x;
                n = n/10;
        }
        if (rev==r)
        {
            System.out.println("PALINDROME ");
        }
        else
        {
            System.out.println("NOT A PALINDROME");
        }

    }
}
