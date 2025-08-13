

public class TextList {
    String[] list = new String[100];
    
    public void add(int index, String text) {
        list[index] = text;
        System.out.println("added " + list[index]);
    }

    public void printList() {
        int index = 0;
        while (list[index] != null) {
            System.out.println(index + 1 + ". " + list[index]);
            index++;
        }
    }
}
