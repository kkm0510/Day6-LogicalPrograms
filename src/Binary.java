import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        String s = Util.toBinary(n);
        System.out.println(s);
        String temp1 = s.substring(0, s.length() / 2);
        String temp2 = s.substring(s.length() / 2);
        s = temp2 + temp1;
        System.out.println(s);
        int num = 0;
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '1') {
                num += (int) (Math.pow(2, s.length() - i - 1));
            }
            i++;
        }
        System.out.println(num);
    }
}
