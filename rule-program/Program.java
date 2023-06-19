import java.util.Observable;

public class Program extends Observable {
    private boolean isValid = false;
    
    public void setValid(boolean isValid) {
        this.isValid = isValid;
    }
    
    public void setIsValid(boolean isValid) {
        
        this.isValid = isValid;
        setChanged();
        notifyObservers();
    }
    
    public boolean isValid() {
        return isValid;
    }
}
