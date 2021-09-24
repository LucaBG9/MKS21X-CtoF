import java.util.Scanner;
public class tester {
    public static void main(String[] args){
      System.out.println(CtoF);
    }
        public static void celsiusToFahrenheit(double F, double C) {
            Scanner in = new Scanner(System.in);

            System.out.println("Temperature in celcius? ");
            C = in.nextDouble();

            F = ((C * (9.0 / 5.0))+32);

            System.out.printf(" %.1f C = %.1f F", C, F);
        }

        public static void fahrenheitToCelsius(double F, double C) {

            Scanner in = new Scanner(System.in);

            System.out.println("Temperature in fahrenheit? ");
            F = in.nextDouble();

            C = ((F-32)*(5.0/9.0));

            System.out.printf(" %.1f F = %.1f C", F, C);
        }
    }
