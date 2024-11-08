import java.util.ArrayList;
import java.util.List;

public class Filter {
    private int threshold;

    public Filter(int threshold) {
        this.threshold = threshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        logger.log("Запускаем фильтрацию");

        for (int number : source) {
            if (number >= threshold) {
                logger.log("Элемент \"" + number + "\" проходит");
                result.add(number);
            } else {
                logger.log("Элемент \"" + number + "\" не проходит");
            }
        }
        logger.log("Прошло фильтр " + result.size() + " элемента(ов) из " + source.size());
        return result;
    }
}
