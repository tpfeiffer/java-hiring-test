import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class RuleProgram implements Observer {
    
    private Program       program;
    private ReferenceData referenceData;
    
    public RuleProgram(Program program, ReferenceData referenceData) {
        this.program = program;
        this.referenceData = referenceData;
        this.program.addObserver(this);
        referenceData.addObserver(this);
    }
    
    @Override
    public void update(Observable o, Object arg) {
        
        if(program.equals(o)) {
            
            // FIXME We are risking an infinite loop here...
            program.setIsValid(true);
            
        }
        else if(o instanceof ReferenceData) {
            
            ReferenceData r = (ReferenceData) o;
            
            List<DataObject> dataObjects = r.getData();
            
            if(dataObjects != null) {
                for(DataObject dataObject : dataObjects) {
                    // FIXME Nullpointer!!!
                    dataObject.insert();
                }
            }
        }
    }
    
    public static void main(String[] args) {
        
        Program program = new Program();
        ReferenceData referenceData = new ReferenceData();
        RuleProgram ruleProgram = new RuleProgram(program, referenceData);
        referenceData.setIsValid(true);
        program.setIsValid(false);
        
    }
    
}
