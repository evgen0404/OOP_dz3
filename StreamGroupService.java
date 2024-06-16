import java.util.Collections;
import java.util.List;

public class StreamGroupService {
    public void sortStreamGroups(List<StreamGroup> streamGroups) {
        Collections.sort(streamGroups, new StreamGroupComparator());
    }
}