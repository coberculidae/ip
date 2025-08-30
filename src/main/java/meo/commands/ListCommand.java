package meo.commands;

import meo.FileHandler;
import meo.MeoException;
import meo.TextList;
import meo.Ui;

public class ListCommand extends Command{

    public ListCommand() {
    }

    public void execute(Ui ui, TextList textList, FileHandler fileHandler) throws MeoException {
        textList.printList();
        ui.printDivider();
    }

}
