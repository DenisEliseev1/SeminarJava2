import java.util.Arrays;

/**
 * 2.Реализуйте алгоритм сортировки пузырьком числового массива, 
 * результат после каждой итерации запишите в лог-файл. * 
 */

public class java_sem2_task2 {
    public static void main(String[] args) {
        int [] array = new int[] {5, 4, 3, 2, 0, 3, 56, 8};
        System.out.println(Arrays.toString(bubleSort(array)));
    }
    public static int[] bubleSort (int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j]>arr[j+1]) {
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
        
}

