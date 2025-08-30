package meo.command;

import meo.FileHandler;
import meo.MeoException;
import meo.data.TextList;
import meo.task.Task;
import meo.task.ToDo;
import meo.ui.Ui;

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
