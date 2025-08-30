package meo.commands;

import meo.FileHandler;
import meo.MeoException;
import meo.TextList;
import meo.Ui;

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
