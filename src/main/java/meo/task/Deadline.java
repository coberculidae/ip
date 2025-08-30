package meo.task;

import meo.TimeParser;

public class Deadline extends Task{
    protected String deadline;

    public Deadline(String text, String deadline) {
        super(text);
        if (TimeParser.parseTime(deadline).equals("NA")) {
            this.deadline = deadline;
        } else {
            this.deadline = TimeParser.parseTime(deadline);
        }
    }

    public String getDeadline() {
        return deadline;
    }

    @Override
    public String toString() {
        String mark = isDone ? "X" : " ";
        return "[D][" + mark + "] " + description + " | by: " + this.deadline;
    }
}
