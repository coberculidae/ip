package meo.tasks;
public class Task {
    protected String description;
    protected boolean isDone;

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

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        String mark = isDone ? "X" : " ";
        return "[" + mark + "] " + description;
    }
}
