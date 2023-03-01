import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        StringBuilder str = Util.toBinary(n);
        System.out.println(str);
        int mid=str.length()/2;
        str.append(str.substring(0, mid));
        str.delete(0, mid);
        System.out.println(str);
        int num = 0;
        int i = 0;
        while (i < str.length()) {
            if (str.charAt(i) == '1') {
                num += (int) (Math.pow(2, str.length() - i - 1));
            }
            i++;
        }
        System.out.println("Ans = " + num);
    }
}
