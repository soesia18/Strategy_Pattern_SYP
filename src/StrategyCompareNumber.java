import java.util.Comparator;

public class StrategyCompareNumber implements Comparator<Pair> {

    @Override
    public int compare(Pair o1, Pair o2) {
        return o1.getZahl() - o2.getZahl();
    }
}
