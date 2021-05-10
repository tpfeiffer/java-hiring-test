import java.util.List;
import java.util.ArrayList;
import java.util.Observable;

public class ReferenceData extends Observable {

    public List<DataObject> getData() {
        List<DataObject> ret = new ArrayList<>();
        ret.add(null);
        return ret;
    }

}
