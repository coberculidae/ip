package meo;

import meo.command.Command;
import meo.command.CommandParser;

public class Meo {
    private TextList textList = new TextList();
    private FileHandler fileHandler;
    private Ui ui = new Ui();


    public void run() {
        ui.showWelcomeMessage();
        if (FileHandler.getList() != null) {
            textList = FileHandler.getList();
        };
        runCommandParseUntilExit();
    }

    /** Runs the command parser on user's input until input is "exit" */
    private void runCommandParseUntilExit() {
        Command command = new Command();
        do {
            try {
                String commandText = ui.getUserCommand();
                command = new CommandParser().parser(commandText);
                command.execute(ui, textList, fileHandler);
            } catch (MeoException e) {
                e.printStackTrace();
            }
        } while (!command.isExit());
    }
    public static void main(String[] args) {
        new Meo().run();
    }
}
