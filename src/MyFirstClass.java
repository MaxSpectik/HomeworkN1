import java.util.Scanner;
public class MyFirstClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String str = sc.nextLine();
        char[] chars = str.toCharArray();
        System.out.println(chars);
        System.out.println("Result array of chars: ");
        for (int i = 0; i < chars.length; i++) {
            if ((i + 1) % 2 == 0) {
                chars[i] = Character.toUpperCase(chars[i]);
                System.out.print(chars[i]);
            }
        }
    }
}