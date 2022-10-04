import java.util.Comparator;
import java.util.List;

public class Context {
    private Comparator<Pair> pair;

    public void setPair(Comparator<Pair> pair) {
        this.pair = pair;
    }

    public void sort (List<Pair> pairs) {
        pairs.sort(pair);
    }
}
