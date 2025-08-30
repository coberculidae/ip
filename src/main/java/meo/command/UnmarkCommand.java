package meo.command;

import meo.FileHandler;
import meo.MeoException;
import meo.data.TextList;
import meo.ui.Ui;

public class UnmarkCommand extends Command {

    public UnmarkCommand(String commandContent) {
        super(commandContent,null);
    }

    @Override
    public void execute(Ui ui, TextList textList, FileHandler fileHandler) throws MeoException {
        int index = Integer.parseInt(commandContent);
        textList.unmarkTask(index - 1);
        ui.showIncompletedMessage(textList.printTask(index - 1));
    }
}
