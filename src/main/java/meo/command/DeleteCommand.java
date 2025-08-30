package meo.command;

import meo.FileHandler;
import meo.MeoException;
import meo.data.TextList;
import meo.ui.Ui;

public class DeleteCommand extends Command {

    public DeleteCommand(String commandContent) {
        super(commandContent, null);
    }

    public void execute(Ui ui, TextList textList, FileHandler fileHandler) throws MeoException {
        int index = Integer.parseInt(commandContent);
        textList.deleteTask(index - 1);
    }
}
