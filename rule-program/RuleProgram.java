

import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class RuleProgram implements Observer {

    private Program program;
    private Rules businessRules;
    private ReferenceData referenceData;

    public RuleProgram(Program program, Rules businessRules, ReferenceData referenceData) {
            this.program = program;
            this.businessRules = businessRules;
            this.referenceData = referenceData;
            program.addObserver(this);
            referenceData.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {

        if (program.equals(o)) {

            Change change = businessRules.computeChange();

            // FIXME We are risking an infinite loop here...
            change.apply(program);


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
