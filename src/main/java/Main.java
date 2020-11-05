import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] arr2 = {8, 2, 5, 1, 3, 9, 6, 8};
        int[] arr3 = {1, 4, 1, 4, 1, 4};
        int[] arr4 = {2, 3, 5};

//        System.out.print(Arrays.toString(checkArray(arr1)));
//        System.out.print(Arrays.toString(checkArray(arr2)));
//        System.out.print(Arrays.toString(checkArray(arr3)));
//        System.out.print(Arrays.toString(checkArray(arr4)));

    }

    public static int[] checkArray(int[] arr) {
        int x = 0;
        int[] result = null;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                x = arr[i];
                result = new int[arr.length - i - 1];
                for (int j = i + 1, k = 0; j < arr.length; j++, k++) {
                    if (arr[j] == 4) continue;
                    result[k] = arr[j];
                }
            }
        }
        try {
            x = 1 / x;
        } catch (ArithmeticException e) {
            throw new RuntimeException();
        }
        return result;
    }


    public boolean checkArray2(Integer[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(arr));
        if (arrayList.contains(1) & arrayList.contains(4)) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i) != 1 & arrayList.get(i) != 4) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
