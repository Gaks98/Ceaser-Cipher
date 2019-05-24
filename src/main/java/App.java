import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word for encryption ");
        String word = input.nextLine();
        System.out.println("Enter shift");
        int numberShift = input.nextInt();
        Caesar cipher = new Caesar(word,numberShift);
        String encryption = Caesar.encrypt(cipher);
        System.out.println("Encryption: " + encryption);
        Caesar decryption = new Caesar(encryption,numberShift);

        String decrypted = Caesar.decrypt(decryption);
        System.out.println("Decryption: " + decrypted);


    }
}