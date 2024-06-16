import java.util.Iterator;
import java.util.List;

public class StreamGroup implements Iterable<StudentGroup> {
    private String name;
    private List<StudentGroup> groups;

    public StreamGroup(String name, List<StudentGroup> groups) {
        this.name = name;
        this.groups = groups;
    }

    public List<StudentGroup> getGroups() {
        return groups;
    }

    public String getName() {
        return name;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return groups.iterator();
    }

    @Override
    public String toString() {
        return  name + "  Групп: " + groups.size();
    }
}