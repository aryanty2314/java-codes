import java.util.Scanner;

public class add
{
public static int sUM(int a, int b)
{
    int sum=a+b;
    return sum;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" enter the value of two numbers");
             int x= sc.nextInt();
             int y = sc.nextInt();
             //int sum=sUM(x,y);
        System.out.println("SUM OF TWO NUMBER IS "+sUM(x,y));
}

}
