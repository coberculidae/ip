package meo.commands;

import meo.FileHandler;
import meo.MeoException;
import meo.TextList;
import meo.ToDo;
import meo.Ui;
import meo.Task;

public class TodoCommand extends Command {

    public TodoCommand(String commandContent) {
        super(commandContent, null);
    }

    @Override
    public void execute(Ui ui, TextList textList, FileHandler fileHandler) throws MeoException {
        String taskDesc = commandContent;
        if (taskDesc.isEmpty())
            throw new MeoException(MeoException.taskMissing);
        Task newTask = new ToDo(taskDesc);
        textList.add(newTask);
        ui.showAddedTask(newTask.toString());
    }
}
