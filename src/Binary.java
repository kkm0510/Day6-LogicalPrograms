import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        StringBuilder str = Util.toBinary(n);
        System.out.println(str);
        str.reverse();
        int i = 2;
        boolean checked = false;
        while (!checked) {
            if (str.length() <= i) {
                while (str.length() < i) {
                    str.append(0);
                }
                checked = true;
            }
            i *= 2;
        }
        str.reverse();
        String temp1 = str.substring(0, str.length() / 2);
        String temp2 = str.substring(str.length() / 2);
        String s = temp2 + temp1;
        System.out.println(s);
        int num = 0;
        i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '1') {
                num += (int) (Math.pow(2, s.length() - i - 1));
            }
            i++;
        }
        System.out.println("Ans = " + num);
    }
}
