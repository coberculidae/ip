package meo.commands;

import meo.Event;
import meo.FileHandler;
import meo.Task;
import meo.TextList;
import meo.Ui;

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
