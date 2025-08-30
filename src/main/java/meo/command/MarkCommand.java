package meo.command;

import meo.FileHandler;
import meo.MeoException;
import meo.TextList;
import meo.Ui;

public class MarkCommand extends Command {

    public MarkCommand(String commandContent) {
        super(commandContent,null);
    }

    @Override
    public void execute(Ui ui, TextList textList, FileHandler fileHandler) throws MeoException {
        int index = Integer.parseInt(commandContent);
        textList.markTask(index - 1);
        ui.showCompletedMessage(textList.printTask(index - 1));
    }
}
