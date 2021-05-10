import java.util.Calendar;

public class Change {

    public void apply(Program program) {
        if (Calendar.getInstance().get(Calendar.DAY_OF_WEEK) == Calendar.TUESDAY) {
            program.setIsTuesday(true);
        }
    }

}
