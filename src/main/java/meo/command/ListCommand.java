package meo.command;

import meo.FileHandler;
import meo.MeoException;
import meo.data.TextList;
import meo.ui.Ui;

public class ListCommand extends Command{

    public ListCommand() {
    }

    public void execute(Ui ui, TextList textList, FileHandler fileHandler) throws MeoException {
        textList.printList();
        ui.printDivider();
    }

}
