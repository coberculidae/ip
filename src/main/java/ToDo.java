public class ToDo extends Task {
    public ToDo(String text) {
        super(text);
    }

    @Override
    public String toString() {
        String mark = isDone ? "X" : " ";
        return "[T][" + mark + "] " + description;
    }
}
