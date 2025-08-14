public class Task {
    String description;
    boolean isDone;

    public Task(String text) {
        description = text;
        isDone = false;
    }

    public void isMarked() {
        isDone = true;
    }

    public void isUnmarked() {
        isDone = false;
    }

    public boolean isTaskDone() {
        return isDone;
    }

    @Override
    public String toString() {
        String mark = isDone ? "X" : " ";
        return "[" + mark + "] " + description;
    }
}
