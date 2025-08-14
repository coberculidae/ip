public class Event extends Task{
    String from;
    String to;

    public Event(String text, String from, String to) {
        super(text);
        this.from = from;
        this.to = to;
    }

    @Override
    public String toString() {
        String mark = isDone ? "X" : " ";
        return "[E][" + mark + "] " + description + " from: " + from + " to: " + to;
    }
}
