import java.util.Arrays;

public class ParallelArrayRangeSortingDemo {
    public static void main(String[] args) {
        int arr[] = new int[] { 5, 2, 8, 1, 9, 3 };
        System.out.println("Before Sorting");
        for (int i : arr) {
            System.out.println(i);
        }

        Arrays.parallelSort(arr, 1, 4);
        System.out.println("After Sorting");
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
