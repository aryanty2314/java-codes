import java.util.Scanner;

public class area_perimeter
{

     static int area(int r)
    {
        float pi = 3.14f;
        double area = pi*r*r;
        System.out.println(" area is :- "+area);
        return r;
    }
    static int perimeter(int r)
    {
        float pi = 3.14f;
        double perimeter = 2*pi*r;
        System.out.println(" perimeter is :- "+perimeter);
        return r;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the radius ");
        int r = sc.nextInt();
        area(r);
        perimeter(r);
    }
}
