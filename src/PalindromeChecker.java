import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString, processedString = "";

        while (true) {
            System.out.print("Введите строку ");
            inputString = scanner.nextLine();

            for (int i = 0; i < inputString.length(); i++) {
                char c = inputString.charAt(i);
                if (Character.isLetter(c)) {
                    processedString += Character.toLowerCase(c);
                }
            }

            boolean isPalindrome = true;
            for (int i = 0; i < processedString.length() / 2; i++) {
                if (processedString.charAt(i) != processedString.charAt(processedString.length() - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }

            if (isPalindrome) {
                System.out.println("Строка является палиндромом.");
            } else {
                System.out.println("Строка не является палиндромом.");
                break;
            }
        }

        scanner.close();
    }
}