import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Pair pair1 = new Pair(1, "Eins");
        Pair pair2 = new Pair(8, "Acht");
        Pair pair3 = new Pair(5, "Fünf");

        //List<Pair> pairList = List.of(pair1, pair2, pair3);

        List<Pair> pairList = new ArrayList<>();
        pairList.add(pair1);
        pairList.add(pair2);
        pairList.add(pair3);


        Context context = new Context();

        StrategyCompareText strategyCompareText = new StrategyCompareText();
        StrategyCompareNumber strategyCompareNumber = new StrategyCompareNumber();

        System.out.println("Aufsteigend nach zahl");

        context.setPair(strategyCompareNumber);
        context.sort(pairList);
        pairList.forEach(System.out::println);


        System.out.println("--------------------------------");
        System.out.println("Absteigend nach text");

        context.setPair(strategyCompareText);
        context.sort(pairList);
        pairList.forEach(System.out::println);

    }
}