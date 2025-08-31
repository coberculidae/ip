package meo.data;
import java.util.ArrayList;

import meo.FileHandler;
import meo.MeoException;
import meo.task.Task;

public class TextList {
    ArrayList<Task> taskList = new ArrayList<Task>(); 

    public TextList(){

    };

    public TextList(ArrayList<Task> list) {
        taskList = list;
    }

    public void add(Task task) {
        taskList.add(task);
    }

    public void printList() {
        int index = 0;
        while (index < taskList.size()) {
            System.out.println(index + 1 + ". " + taskList.get(index).toString());
            index++;
        }
    }

    public void saveList() {
        FileHandler.writeFile(taskList);
    }

    public int getSize() {
        return taskList.size();
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

    public void deleteTask(int index) throws MeoException{
        Task task = taskList.size() == 0 ? null : taskList.get(index);
        if (task != null) {
            taskList.remove(index);
        } else {
            throw new MeoException(MeoException.taskNotExist);
        }
    }

    public String printTask(int index) {
        return taskList.get(index).toString();
    }
}
