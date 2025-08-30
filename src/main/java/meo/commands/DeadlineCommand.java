package meo.commands;

import meo.FileHandler;
import meo.MeoException;
import meo.TextList;
import meo.Ui;
import meo.tasks.Deadline;
import meo.tasks.Task;

public class DeadlineCommand extends Command {

    public DeadlineCommand(String commandContent, String[] tags) {
        super(commandContent, tags);
    }

    @Override
    public void execute(Ui ui, TextList textList, FileHandler fileHandler) throws MeoException {
        Task newTask = new Deadline(commandContent, tags[0]);
        textList.add(newTask);
        ui.showAddedTask(newTask.toString());
    }
}
