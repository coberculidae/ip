package meo.ui;

import java.util.Scanner;

public class Ui {
    private final Scanner in = new Scanner(System.in);

    private static final String DIVIDER = "ฅ^•ﻌ•^ฅ ฅ^•ﻌ•^ฅ ฅ^•ﻌ•^ฅ ฅ^•ﻌ•^ฅ";
    private static final String HELLO_MESSAGE = "Hewwo from Meo";
    private static final String EXIT_MESSAGE = "Bye, it's my nap time. /ᐠ - ˕-マ｡˚ z Z ";
    private static final String COMPLETE_MESSAGE = "Good job~ Your task is done!";
    private static final String INCOMPLETE_MESSAGE = "This task is marked as not done yet...";
    private static final String DELETE_MESSAGE = "I have eaten your task.";
    private static final String ERROR_MESSAGE = "An error was caught.";
    private static final String FIND_RESULT_MESSAGE = "Here's what I found!";
    private static final String COMMAND_PROMPT = "Meow, what would you like to do?";
    private static final String LOGO = "      ⢀⣿⡀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⢀⣾⣿⡇⠀⠀⠀⠀⠀⢀⣼⡇\n" +
                "⠀⠀⠀⠀⠀⣸⣿⣿⡇⠀⠀⠀⠀⣴⣿⣿⠃\n" +
                "⠀⠀⠀⠀⢠⣿⣿⣿⣇⠀⠀⢀⣾⣿⣿⣿⠀\n" +
                "⠀⠀⠀⣴⣿⣿⣿⣿⣿⣿⣷⣿⣿⣿⣿⡟⠀\n" +
                "⠀⠀⢰⡿⠉⠀⡜⣿⣿⣿⡿⠿⢿⣿⣿⠃⠀\n" +
                "⠒⠒⠸⣿⣄⡘⣃⣿⣿⡟⢰⠃⠀⢹⣿⡇⠀\n" +
                "⠚⠉⠀⠈⠻⣿⣿⣿⣿⣿⣮⣤⣤⣿⡟⠁⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠈⠙⠛⠛⠛⠛⠛⠁⠀⠒⠤\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠑⠀⠀";

    public void showWelcomeMessage() {
        printMessage(HELLO_MESSAGE, LOGO);
    }

    public void showCommandPrompt() {
        printMessage(System.lineSeparator(), COMMAND_PROMPT, DIVIDER);
    }

    public void showAddedTask(String taskAdded) {
        printMessage(System.lineSeparator(), "Added:", taskAdded);
    }

    public void showExitMessage() {
        printMessage(System.lineSeparator(), EXIT_MESSAGE);
    }

    public void showCompletedMessage(String taskDone) {
        printMessage(System.lineSeparator(), COMPLETE_MESSAGE, taskDone);
    }

    public void showIncompletedMessage(String taskUndone) {
        printMessage(System.lineSeparator(), INCOMPLETE_MESSAGE, taskUndone);
    }

    public void showDeletedMessage() {
        printMessage(System.lineSeparator(), DELETE_MESSAGE);
    }

    public void showErrorMessage() {
        printMessage(System.lineSeparator(), ERROR_MESSAGE);
    }

    public void showFindResultMessage() {
        printMessage(System.lineSeparator(), FIND_RESULT_MESSAGE);
    }

    public void printDivider() {
        System.out.println(DIVIDER);
    }

    public void printMessage(String... messages) {
        for (String m : messages) {
            System.out.println(m);
        }
    }
    /** 
     * Prompts for the command, reads the command entered by user
     * @return command entered by user
     */
    public String getUserCommand() {
        showCommandPrompt();
        String input = in.nextLine();
        return input;
    }
}
