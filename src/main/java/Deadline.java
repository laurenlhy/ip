import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Creates a Deadline task with a date.
 */
public class Deadline extends Task {

    protected LocalDate by;

    public Deadline(String description, LocalDate by) {
        super(description);
        this.by = by;
    }

    @Override
    public String saveTask() {
        return "D" + super.saveTask() + " |" + by + "\n";
    }

    @Override
    public String toString() {
        return "[D]" + super.toString() + " (by: " +
                by.format(DateTimeFormatter.ofPattern("MMM d yyyy")) + ")";
    }
}
