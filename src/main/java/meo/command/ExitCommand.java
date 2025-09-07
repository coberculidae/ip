package meo.command;

import meo.FileHandler;
import meo.MeoException;
import meo.data.TextList;
import meo.ui.Ui;

public class ExitCommand extends Command {

    public ExitCommand() {
    }

    @Override
    public boolean isExit() {
        return true;
    }

    @Override
    public void execute(Ui ui, TextList textList, FileHandler fileHandler) throws MeoException {
        textList.saveList();
        ui.showExitMessage();
    }
}
