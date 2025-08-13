import java.util.Scanner;

public class Meo {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String echo = "";
        TextList textList = new TextList();
        int index = 0;
        String cat = 
                "      ⢀⣿⡀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
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
        System.out.println("ฅ^•ﻌ•^ฅ ฅ^•ﻌ•^ฅ ฅ^•ﻌ•^ฅ ฅ^•ﻌ•^ฅ");

        while (!echo.equals("bye")) { //check whether the last message was "bye"
            echo = myObj.nextLine();
            if (echo.equals("bye")) {
                System.out.println("Bye, it's my nap time. /ᐠ - ˕-マ｡˚ z Z ");
            } else {
                if (echo.equals("list")) {
                    textList.printList();
                    System.out.println("ฅ^•ﻌ•^ฅ ฅ^•ﻌ•^ฅ ฅ^•ﻌ•^ฅ ฅ^•ﻌ•^ฅ");
                }
                else {
                    if (echo.startsWith("mark")){
                        int i = Integer.parseInt(echo.substring(4).trim());
                        textList.markTask(i - 1);
                        System.out.println("Good job~ Your task is done!");
                        textList.printTask(i - 1);
                        System.out.println("ฅ^•ﻌ•^ฅ ฅ^•ﻌ•^ฅ ฅ^•ﻌ•^ฅ ฅ^•ﻌ•^ฅ");
                    } else {
                        if (echo.startsWith("unmark")) {
                            int i = Integer.parseInt(echo.substring(6).trim());
                            textList.unmarkTask(i - 1);
                            System.out.println("This task is marked as not done yet...");
                            textList.printTask(i - 1);
                            System.out.println("ฅ^•ﻌ•^ฅ ฅ^•ﻌ•^ฅ ฅ^•ﻌ•^ฅ ฅ^•ﻌ•^ฅ");
                        } else {
                            Task newTask = new Task(echo);
                            textList.add(index, newTask);
                            index++;
                            System.out.println("added " + echo);
                            System.out.println("ฅ^•ﻌ•^ฅ ฅ^•ﻌ•^ฅ ฅ^•ﻌ•^ฅ ฅ^•ﻌ•^ฅ");
                        }
                    }
                }
            }
        }   
    }
}
