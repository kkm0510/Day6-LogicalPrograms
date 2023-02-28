import java.util.Scanner;

public class Util {

    static Scanner sc = new Scanner(System.in);
    public static int dayOfWeek(int m, int d, int y) {
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;
        return d0;
    }

    public static void operateDayOfWeek() {
        System.out.print("Enter month : ");
        int m = sc.nextInt();
        System.out.print("Enter day : ");
        int d = sc.nextInt();
        System.out.print("Enter year : ");
        int y = sc.nextInt();
        int dayOfWeek = dayOfWeek(m, d, y);
        System.out.println("Day of the week = " + dayOfWeek);
    }

    public static void temperatureConversion(double temp, int choice) {
        if (choice == 1) {
            System.out.println((temp * 9.0 / 5) + 32);
        }
        System.out.println((temp - 32) * 5.0 / 9);
    }

    public static void operateTempConversion() {
        System.out.print("Enter choice : 1) Celsius to Fahrenheit  2) Fahrenheit to Celsius : ");
        int choice = sc.nextInt();
        System.out.println("Enter temperature : ");
        double temp = sc.nextDouble();
        temperatureConversion(temp, choice);
    }

    public static void main(String[] args) {
        System.out.println("Enter Choice : ");
        System.out.println("1)Day of week  2)temperature conversion : ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> operateDayOfWeek();
            case 2 -> operateTempConversion();
        }
    }
}
