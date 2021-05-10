import java.util.Observable;
import java.util.Observer;

public class Program extends Observable {
    private boolean isTuesday = false;

    public void setIsTuesday(boolean isTuesday) {
        isTuesday = isTuesday;
        setChanged();
        notifyObservers();
    }
}
