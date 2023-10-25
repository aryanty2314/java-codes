import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class circumference
{
    public static double cfc(int x)
    {
        double circum = 2*3.14*x;
        System.out.println(circum);
    return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the radius of circle ");
        int x = sc.nextInt();
        cfc(x);
    }
}
