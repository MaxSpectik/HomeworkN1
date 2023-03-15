import java.util.Scanner;

public class yrt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String str = sc.nextLine();
        char [] chars = new char[str.length()];
        for (int i = 0; i< str.length(); i++) {
            chars[i] = str.charAt(i);
            System.out.print(chars[i]);
        }
        System.out.println();
        for (int i = 0; i < str.length(); i++) {
            if ((i+1) % 2 == 0)  {
                chars [i] = Character.toUpperCase(chars[i]);
            }
            System.out.print(chars[i]);
        }
    }
}





