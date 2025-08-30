package meo.commands;

import meo.FileHandler;
import meo.TextList;
import meo.Ui;
import meo.tasks.Event;
import meo.tasks.Task;

public class EventCommand extends Command {

    public EventCommand(String commandContent, String[] tags) {
        super(commandContent, tags);
    }

    @Override
    public void execute(Ui ui, TextList textList, FileHandler fileHandler) {
        Task newTask = new Event(commandContent, tags[0], tags[1]);
        textList.add(newTask);
        ui.showAddedTask(newTask.toString());
    }
}
