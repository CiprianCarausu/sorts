import sorts.BubbleSort;

public class sortingTest {
    public static void main(String[] args) {
        int array[] = {8, 5, 3, 2, 9, 10, 132, 2134, 53241, 212341};
        BubbleSort sortMethod = new BubbleSort();
        sortMethod.BubbleSort(array);
    }
}
