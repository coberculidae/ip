package meo;

import java.util.Scanner;

public class Ui {
    private final Scanner in = new Scanner(System.in);

    private static final String DIVIDER = "ฅ^•ﻌ•^ฅ ฅ^•ﻌ•^ฅ ฅ^•ﻌ•^ฅ ฅ^•ﻌ•^ฅ";
    private static final String HELLO_MESSAGE = "Hewwo from Meo";
    private static final String EXIT_MESSAGE = "Bye, it's my nap time. /ᐠ - ˕-マ｡˚ z Z ";
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
        printMessage(COMMAND_PROMPT, DIVIDER);
    }

    public void showAddedTask(String taskAdded) {
        printMessage("/n", taskAdded, DIVIDER);
    }

    public void showExitMessage() {
        printMessage(EXIT_MESSAGE);
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
