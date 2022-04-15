package RandomCoffee;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PairGenerator {

    // Random — класс в Java, отвечающих за генерацию случайных элементов.
    private static final Random rnd = new Random();

    /**
     * Разбивает список незнакомцев по парам.
     */

    // Укажите правильный тип, возвращаемый этой функцией. Вам нужно преобразовать список незнакомцев в 
    // набор пар, т.е. в список, состоящий из других списков.
    public ArrayList<List<Stranger>> splitByPairs(List<Stranger> strangers) {

        // Укажите тип ещё раз.
        ArrayList<List<Stranger>> pairs = new ArrayList<>();
        while (!strangers.isEmpty()) {

            List<Stranger> pair = getRandomPair(strangers);
            // Добавьте новый элемент в набор пар.
            pairs.add(pair);
            strangers.removeAll(pair);

        }

        return pairs;
    }

    /**
     * Возвращает одну пару и удаляет её из списка strangers
     */
    private List<Stranger> getRandomPair(List<Stranger> strangers) {

        // Ищем двух незнакомцев
        int p1Index = rnd.nextInt(strangers.size());
        int p2Index = rnd.nextInt(strangers.size());
        while (p2Index == p1Index) {
            p2Index = rnd.nextInt(strangers.size());
        }

        Stranger strangerOne = strangers.get(p1Index);
        Stranger strangerTwo = strangers.get(p2Index);

        List<Stranger> list=new ArrayList();
        list.add(strangerOne);
        list.add(strangerTwo);


        return list;

    }
}