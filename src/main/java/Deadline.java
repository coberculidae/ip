public class Deadline extends Task{
    String deadline;

    public Deadline(String text, String deadline) {
        super(text);
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        String mark = isDone ? "X" : " ";
        return "[D][" + mark + "] " + description + " (by: " + this.deadline + ")";
    }
}
