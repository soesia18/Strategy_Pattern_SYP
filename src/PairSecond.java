import java.util.Comparator;
import java.util.List;

public class PairSecond implements Comparator<Pair> {

    @Override
    public int compare(Pair o1, Pair o2) {
        return o1.getZahl() - o2.getZahl();
    }
}
