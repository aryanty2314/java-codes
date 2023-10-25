import java.util.Scanner;

public class ctof {
    static int celsiustofahrenheit( double celsius)
    {
        double f = (9/5*celsius)+32;
        System.out.println("temprature in fahrenhiet is "+f);
        return (int) celsius;
    }
    static int fahrenheittocelsius( double fahrenheit)
    {
        double c = (fahrenheit-32)*(5/9);
        System.out.println(" temprature in celsius is "+c);
        return (int) fahrenheit;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println(" enter the temprature ");
        double temp = sc.nextDouble();
        celsiustofahrenheit(temp);
        fahrenheittocelsius(temp);
    }
}
