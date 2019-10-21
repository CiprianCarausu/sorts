package sorts;

public class BubbleSort{

    public void BubbleSort(int number[]) {
        int temp;
        boolean fixed = false;
        while (fixed == false) {
            fixed = true;

            for (int i = 0; i < number.length - 1; i++) {
                if (number[i] > number[i + 1]) {
                    temp = number[i + 1];
                    number[i + 1] = number[i];
                    number[i] = temp;
                    fixed = false;
                }
            }
        }
        String sep = "";
        for (int i = 0; i < number.length; i++) {
            System.out.print(sep + number[i]);
            sep = ",";
        }
    }
}