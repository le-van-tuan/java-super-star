package vn.sps.algorithms;

public class Application {
    public static void main(String[] args) {
        int[] integers = new int[]{5, 2, 2, 1, 7};
        Sort.ascBubbleSort(integers);
        Sort.display(integers);
        System.out.println("Descending...");
        Sort.descBubbleSort(integers);
        Sort.display(integers);

        int[] myInts = {5, 9, 4, 6, 5, 3};
    }
}
