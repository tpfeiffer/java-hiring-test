import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class RuleProgram implements Observer {

    private Program program;
    private ReferenceData referenceData;

    public RuleProgram(Program program, ReferenceData referenceData) {
            this.program = program;
            this.referenceData = referenceData;
            program.addObserver(this);
            referenceData.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {

        if (program.equals(o)) {

            Change change = BusinessRules.computeChange();

            // FIXME We are risking an infinite loop here...
            program.applyChange(change);


        } else if (o instanceof ReferenceData) {

            ReferenceData r = (ReferenceData) o;

            List<DataObject> dataObjects = r.getData();

            for (DataObject dataObject : dataObjects) {
                // FIXME Nullpointer!!!
                dataObject.insert();
            }
        }
    }
    
}
