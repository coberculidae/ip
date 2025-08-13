

public class TextList {
    Task[] list = new Task[100];
    
    public void add(int index, Task task) {
        list[index] = task;
    }

    public void printList() {
        int index = 0;
        while (list[index] != null) {
            System.out.println(index + 1 + ". " + list[index].toString());
            index++;
        }
    }

    public void markTask(int index) {
        list[index].isMarked();
    }

    public void unmarkTask(int index) {
        list[index].isUnmarked();
    }

    public void printTask(int index) {
        System.out.println(list[index]);
    }
}
