import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");

        logger.log("Просим пользователя ввести входные данные для списка");
        int n = UserInputHelper.getInt("Введите размер списка: ");
        int m = UserInputHelper.getInt("Введите верхнюю границу для значений: ");

        logger.log("Создаём и наполняем список");
        List<Integer> randomList = generateRandomList(n, m);
        System.out.println("Вот случайный список: " + randomList);

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        int f = UserInputHelper.getInt("Введите порог для фильтра: ");

        Filter filter = new Filter(f);
        List<Integer> filteredList = filter.filterOut(randomList);

        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + filteredList);

        logger.log("Завершаем программу");
    }

    private static List<Integer> generateRandomList(int size, int maxValue) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(maxValue + 1));
        }
        return list;
    }
}