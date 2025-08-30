package meo.commands;

import meo.FileHandler;
import meo.MeoException;
import meo.TextList;
import meo.Ui;

public class Command {
    protected String commandContent;
    protected String[] tags;

    public Command(String commandContent, String[] tags) {
        this.commandContent = commandContent;
        this.tags = tags;
    }

    public Command() {
    }

    public boolean isExit() {
        return false;
    }

    public void execute(Ui ui, TextList textList, FileHandler fileHandler) throws MeoException {

    }
}
