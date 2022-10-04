import java.util.Comparator;
import java.util.List;

public class Pair {
    private int zahl;
    private String text;

    public Pair(int zahl, String text) {
        this.zahl = zahl;
        this.text = text;
    }

    public int getZahl() {
        return zahl;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "zahl=" + zahl +
                ", text='" + text + '\'' +
                '}';
    }
}
