import java.util.ArrayList;

public class TextList {
    ArrayList<Task> taskList = new ArrayList<Task>(); 

    public void add(int index, Task task) {
        taskList.add(task);
    }

    public void printList() {
        int index = 0;
        while (taskList.get(index) != null) {
            System.out.println(index + 1 + ". " + taskList.get(index).toString());
            index++;
        }
    }

    public void markTask(int index) throws MeoException{
        Task task = taskList.size() == 0 ? null : taskList.get(index);
        if (task != null) {
            task.isMarked();
        } else {
            throw new MeoException(MeoException.taskNotExist);
        }
    }

    public void unmarkTask(int index) throws MeoException {
        Task task = taskList.size() == 0 ? null : taskList.get(index);
        if (task != null) {
            task.isUnmarked();
        } else {
            throw new MeoException(MeoException.taskNotExist);
        }
    }

    public void printTask(int index) {
        System.out.println(taskList.get(index));
    }
}
