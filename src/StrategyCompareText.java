import java.util.Comparator;
import java.util.List;

public class StrategyCompareText implements Comparator<Pair> {


    //1) Aufsteigen nach Zahl
    //2) Absteigend nach Text


    public void sort(List<Pair> pairs) {

    }

    @Override
    public int compare(Pair o1, Pair o2) {
        return o2.getText().compareTo(o1.getText());
    }
}
