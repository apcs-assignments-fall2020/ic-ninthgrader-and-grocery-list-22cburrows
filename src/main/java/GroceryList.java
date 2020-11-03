import java.util.Arrays;  
public class GroceryList {

    private String[] arr;

    public GroceryList() {
        // our grocery list will have a max size of 10
        this.arr = new String[10];
    }

    public void add(final String item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = item;
                break;
            }
        }
    }

    public void remove(final String item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                for (int j = i; j < (arr.length -   (arr.length - i)); j++) {
                    arr[j] = arr[j +1];
                    break;
                }
            }
        }
    }

    public String toString() {
        String str = "Grocery List: " + Arrays.toString(arr);
        return str;
    }
}   