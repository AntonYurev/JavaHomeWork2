import java.util.ArrayList;
import java.util.List;

public class Tree {
    private List<Chel> document;
    int id = 1;

    public Tree() {
        document = new ArrayList<>();
        id = 1;
    }

    public void newTree() {
        document.add(new Chel());
        id += 1;
    }
}
