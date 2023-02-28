import java.util.Scanner;

public class LogicalPrograms {

    static Scanner sc=new Scanner(System.in);

    public void fibonacci() {
        System.out.println("Enter number : ");
        int n=sc.nextInt();
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

    public static void main(String[] args) {
        LogicalPrograms logic = new LogicalPrograms();
        logic.fibonacci();
    }
}
