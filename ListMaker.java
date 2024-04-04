import java.util.ArrayList;

public class Lab_11_Listmaker {
    public static void main(String[] args) {
        ArrayList<String> myArrList = new ArrayList<>();
    }
}
public static void addItem(ArrayList<String> list, String item) {
    list.add(item);
}
public static void deleteItem(ArrayList<String> list, int index) {
    if (index >= 0 && index < list.size()) {
        list.remove(index);
    } else {
        System.out.println("Invalid index.");
    }
}
public static void printList(ArrayList<String> list) {
    for (int i = 0; i < list.size(); i++) {
        System.out.println((i + 1) + ". " + list.get(i));
    }
}
public static boolean confirmQuit() {
    return SafeInput.getYNConfirm("Are you sure you want to quit?");
}
