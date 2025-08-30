package meo.commands;

import meo.MeoException;
import meo.TextList;

public class CommandParser {
    /**
     * Parses user's input into command
     * 
     * @param command user input string
     * @return command to be executed
     * @throws MeoException
     */
    public Command parser(String command) throws MeoException {
        switch (command.substring(0, command.indexOf(" "))) {
            case "todo":
                return new TodoCommand(command.substring(4).trim());
            case "deadline":
                int commandIndex = command.indexOf("/by");
                String[] deadlineTags = new String[1];
                if (commandIndex >= 0) {
                    String taskDesc = command.substring(8, commandIndex - 1).trim();
                    deadlineTags[0] = command.substring(commandIndex + 3).trim();
                    if (taskDesc.isEmpty())
                        throw new MeoException(MeoException.taskMissing);
                    return new DeadlineCommand(taskDesc, deadlineTags);
                } else {
                    throw new MeoException(MeoException.deadlineTime);
                }
            case "event":
                int fromIndex = command.indexOf("/from");
                int toIndex = command.indexOf("/to");
                String[] eventTags = new String[2];
                if (fromIndex >= 0 && toIndex >= 0) {
                    String taskDesc = command.substring(5, fromIndex - 1).trim();
                    if (taskDesc.isEmpty())
                        throw new MeoException(MeoException.taskMissing);
                    eventTags[0] = command.substring(fromIndex + 5, toIndex - 1).trim();
                    eventTags[1] = command.substring(toIndex + 3).trim();
                    return new EventCommand(taskDesc, eventTags);
                } else
                    throw new MeoException(MeoException.eventTime);
            case "mark":
                return new Command();
            case "unmark":
                return new Command();
            case "list":
                return new Command();
            case "delete":
                return new Command();
        }

        return new Command();
    }

    public void execute(String command, String content, String[] tags) {

    }
}
