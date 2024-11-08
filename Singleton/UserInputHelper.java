import java.util.Scanner;

public class UserInputHelper {
    private static final Scanner scanner = new Scanner(System.in);

    public static int getInt(String prompt) {
        Logger logger = Logger.getInstance();
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                logger.log("Некорректный ввод: \"" + input + "\". Попробуйте снова.");
            }
        }
    }
}