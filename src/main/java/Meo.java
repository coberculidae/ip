import java.util.Scanner;

public class Meo {
    public static void main(String[] args) {
        String divider = "ฅ^•ﻌ•^ฅ ฅ^•ﻌ•^ฅ ฅ^•ﻌ•^ฅ ฅ^•ﻌ•^ฅ";
        Scanner myObj = new Scanner(System.in);
        String echo = "";
        TextList textList = new TextList();
        int index = 0;
        String cat = "      ⢀⣿⡀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⢀⣾⣿⡇⠀⠀⠀⠀⠀⢀⣼⡇\n" +
                "⠀⠀⠀⠀⠀⣸⣿⣿⡇⠀⠀⠀⠀⣴⣿⣿⠃\n" +
                "⠀⠀⠀⠀⢠⣿⣿⣿⣇⠀⠀⢀⣾⣿⣿⣿⠀\n" +
                "⠀⠀⠀⣴⣿⣿⣿⣿⣿⣿⣷⣿⣿⣿⣿⡟⠀\n" +
                "⠀⠀⢰⡿⠉⠀⡜⣿⣿⣿⡿⠿⢿⣿⣿⠃⠀\n" +
                "⠒⠒⠸⣿⣄⡘⣃⣿⣿⡟⢰⠃⠀⢹⣿⡇⠀\n" +
                "⠚⠉⠀⠈⠻⣿⣿⣿⣿⣿⣮⣤⣤⣿⡟⠁⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠈⠙⠛⠛⠛⠛⠛⠁⠀⠒⠤\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠑⠀⠀";
        System.out.println("Hewwo from Meo\n" + cat);
        System.out.println("Meow, what would you like to do?");
        System.out.println(divider);

        while (!echo.equals("bye")) { // check whether the last message was "bye"
            try {
                echo = myObj.nextLine();
                if (echo.equals("bye")) {
                    System.out.println("Bye, it's my nap time. /ᐠ - ˕-マ｡˚ z Z ");
                } else {
                    if (echo.equals("list")) {
                        textList.printList();
                        System.out.println(divider);
                    } else {
                        if (echo.startsWith("mark")) {
                            int i = Integer.parseInt(echo.substring(4).trim());
                            textList.markTask(i - 1);
                            System.out.println("Good job~ Your task is done!");
                            textList.printTask(i - 1);
                            System.out.println(divider);
                        } else {
                            if (echo.startsWith("unmark")) {
                                int i = Integer.parseInt(echo.substring(6).trim());
                                textList.unmarkTask(i - 1);
                                System.out.println("This task is marked as not done yet...");
                                textList.printTask(i - 1);
                                System.out.println(divider);
                            } else {
                                if (echo.startsWith("todo")) {
                                    String taskDesc = echo.substring(4).trim();
                                    if (taskDesc.isEmpty())
                                        throw new MeoException(MeoException.taskMissing);
                                    Task newTask = new ToDo(taskDesc);
                                    textList.add(index, newTask);
                                    index++;
                                    System.out.println(newTask.toString());
                                    System.out.println(divider);
                                } else {
                                    if (echo.startsWith("deadline")) {
                                        int commandIndex = echo.indexOf("/by");
                                        if (commandIndex >= 0) {
                                            String taskDesc = echo.substring(8, commandIndex - 1).trim();
                                            String taskDeadline = echo.substring(commandIndex + 3).trim();
                                            if (taskDesc.isEmpty())
                                                throw new MeoException(MeoException.taskMissing);
                                            Task newTask = new Deadline(taskDesc, taskDeadline);
                                            textList.add(index, newTask);
                                            index++;
                                            System.out.println(newTask.toString());
                                            System.out.println(divider);
                                        } else 
                                            throw new MeoException(MeoException.deadlineTime);
                                    } else {
                                        if (echo.startsWith("event")) {
                                            int fromIndex = echo.indexOf("/from");
                                            int toIndex = echo.indexOf("/to");
                                            if (fromIndex >= 0 && toIndex >= 0) {
                                                String taskDesc = echo.substring(5, fromIndex - 1).trim();
                                                if (taskDesc.isEmpty())
                                                    throw new MeoException(MeoException.taskMissing);
                                                String taskFrom = echo.substring(fromIndex + 5, toIndex - 1).trim();
                                                String taskTo = echo.substring(toIndex + 3).trim();
                                                Task newTask = new Event(taskDesc, taskFrom, taskTo);
                                                textList.add(index, newTask);
                                                index++;
                                                System.out.println(newTask.toString());
                                                System.out.println(divider);
                                            } else 
                                                throw new MeoException(MeoException.eventTime);
                                        }
                                    }
                                }

                            }
                        }
                    }
                }
            } catch (MeoException e) {
                System.out.println(e.getMessage());
                System.out.println(divider);
            }
        }
    }
}
