import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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


    /*
        Given :- coupon numbers, How many? -> N coupon numbers
        Find? -> count of random numbers generated to get one distinct coupon number
    */

    //this func will generate numbers between 0 and (n+1)
    //ex -> n=15, the input might have all elements from 0 to 14
    //so the function will generate numbers from 0 to 15(14+1)
    public static int generateRandomNumber(int n) {
        return (int) ((Math.random() * 100) % (n + 1));
    }

    //return true if randomNum is not distinct, else return false if randomNum is distinct
    public static boolean processDistinctNumbers(Set<Integer> set, int randomNum) {
        System.out.println("Random number = " + randomNum);
        if (set.contains(randomNum))
            return true;
        set.add(randomNum);
        System.out.println("New coupon number : " + randomNum);
        return false;
    }

    public static void takeInput(Set<Integer> set, int n) {
        System.out.print("Enter numbers : ");
        int i = 0;
        while (i < n) {
            set.add(sc.nextInt());
            i++;
        }
    }

    public void couponNumber() {
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        takeInput(set, n);
        int count = 1;
        while (processDistinctNumbers(set, generateRandomNumber(4))) {
            count++;
        }
        System.out.println("Total random numbers needed to have all distinct numbers : " + count);
    }

    public void stopWatch() {
        int mins = 0;
        while ((int) (Math.random() * 10 % 5) != 0) {
            mins++;
        }
        System.out.println("Time elapsed = " + mins + " minutes");
    }


    public static void main(String[] args) {
        LogicalPrograms logic = new LogicalPrograms();
        System.out.println("Enter Choice : ");
        System.out.print("1)Fibonacci Series  2)Perfect Number 3)Prime Number 4)Reverse a num 5)Coupon Numbers 6)Stopwatch: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> logic.fibonacci();
            case 2 -> logic.perfectNumber();
            case 3 -> logic.primeNumber();
            case 4 -> logic.reverseNumber();
            case 5 -> logic.couponNumber();
            case 6 -> logic.stopWatch();
        }
    }
}
