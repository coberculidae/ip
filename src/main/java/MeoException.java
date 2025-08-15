public class MeoException extends Exception{
    static String taskMissing = "Meow, please insert your task.";
    static String deadlineTime = "Meow, please include your deadline with /by.";
    static String eventTime = "Meow, please include your from and to timing with /from and /to.";
    static String taskNotExist = "Meow, this task doesn't exist :<.";
    static String commandUnknown = "Meow, I don't understand that... ";

    public MeoException(String errorMessage) {
        super(errorMessage);
    }

}
