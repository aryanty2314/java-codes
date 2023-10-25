import java.util.Scanner;

public class name
{
public static void myNAME(String name)
{
    System.out.println(name);
    return ;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter your name ");
        String name = sc.next();
        myNAME(name);

    }
}
