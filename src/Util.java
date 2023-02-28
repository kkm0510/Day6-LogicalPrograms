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

    public static void monthlyPayment() {
        System.out.print("Enter principal amount : ");
        int P = sc.nextInt();
        System.out.print("Enter no of years : ");
        int Y = sc.nextInt();
        System.out.print("Enter rate : ");
        float R = sc.nextFloat();
        int n = 12 * Y;
        float r = R / (12 * 100);
        float payment = (float) ((P * r) / (1 - Math.pow(1 + r, -n)));
        System.out.println("Monthly Payment = " + payment);
    }

    public static void sqrt() {
        System.out.println("Enter a non negative number c : ");
        int c = sc.nextInt();
        double t = c;
        double epsilon = 1e-15;
        while (Math.abs(t - c / t) > epsilon * t) {
            t = (c / t + t) / 2.0;
        }
        System.out.println("Ans = " + t);
    }

    public static StringBuilder toBinary(int num) {
        StringBuilder s=new StringBuilder();
        while(num!=0){
            s.append(num%2);
            num=num/2;
        }
        while(s.length()<8){
            s.append(0);
        }
        return s.reverse();
    }

    public static void main(String[] args) {
        System.out.println("Enter Choice : ");
        System.out.print("1)Day of week  2)temperature conversion 3)Monthly payment 4)Square root 5)to binary : ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> operateDayOfWeek();
            case 2 -> operateTempConversion();
            case 3 -> monthlyPayment();
            case 4 -> sqrt();
            case 5 -> {
                System.out.print("Enter a number : ");
                StringBuilder s = toBinary(sc.nextInt());
                System.out.println("Binary = " + s);
            }
        }
    }
}
