import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Caesar caesar = new Caesar();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word for encryption ");
        String word = input.nextLine();
        System.out.println("Enter shift");
        int numberShift = input.nextInt();
        String cipher = caesar.encrypt(word, numberShift);
        System.out.println(cipher);

        String decrypted = caesar.decrypt(cipher, numberShift);
        System.out.println(decrypted);


    }
}