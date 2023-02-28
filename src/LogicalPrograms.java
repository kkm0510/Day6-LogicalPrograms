import java.util.Scanner;

public class LogicalPrograms {

    static Scanner sc = new Scanner(System.in);

    public void fibonacci() {
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int i = 0;
        int j = 1;
        System.out.print(i + " " + j + " ");
        for (int k = 3; k <= n; k++) {
            j = j + i;
            i = j - i;
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public void perfectNumber() {
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                sum += i;
        }
        if (sum == n)
            System.out.println("It is a perfect number");
        else
            System.out.println("Not a perfect number");
    }

    public void primeNumber() {
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("Not a prime number");
                return;
            }
        }
        System.out.println("Is a prime number");
    }

    public void reverseNumber() {
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        int revNum = 0;
        while (num != 0) {
            int last = num % 10;
            revNum = revNum * 10 + last;
            num = num / 10;
        }
        System.out.println("Reverse of number = " + revNum);
    }

    public static void main(String[] args) {
        LogicalPrograms logic = new LogicalPrograms();
        System.out.println("Enter Choice : ");
        System.out.print("1)Fibonacci Series  2)Perfect Number 3)Prime Number 4)Reverse a num : ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> logic.fibonacci();
            case 2 -> logic.perfectNumber();
            case 3 -> logic.primeNumber();
            case 4 -> logic.reverseNumber();
        }
    }
}
