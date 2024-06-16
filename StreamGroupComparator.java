import java.util.Comparator;

public class StreamGroupComparator implements Comparator<StreamGroup> {
    @Override
    public int compare(StreamGroup streamGroup1, StreamGroup streamGroup2) {
        return Integer.compare(streamGroup1.getGroups().size(), streamGroup2.getGroups().size());
    }
}