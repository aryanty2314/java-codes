import java.util.Scanner;

public class utol
{
    static void upper(String var)
    {
        int value = 32 +var.charAt(0);
        String x = Character.toString(value);
        System.out.println(x);
    }
    static void lower(String var)
    {
        int value = var.charAt(0)-32;
        String x = Character.toString(value);
        System.out.println(x);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println(" enter the character");
        String var = sc.next();
        if(var.charAt(0)>=65&&var.charAt(0)<97)
        {
            upper(var);
        }
        else {
       lower(var);
        }
    }
}
