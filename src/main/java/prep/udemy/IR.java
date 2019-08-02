package main.java.prep.udemy;

/**
 * @author sharifahmed
 * @since 1/1/19
 */
public class IR {

    public static void main(String[] args) {
        // NOTE: The following input values will be used for testing your solution.
        int[] array1 = {1, 2, 3, 4, 5, 6, 7};

        int[] array2a = {4, 5, 6, 7, 8, 1, 2, 3};
        // isRotation(array1, array2a) should return false.
        int[] array2b = {4, 5, 6, 7, 1, 2, 3};
        // isRotation(array1, array2b) should return true.
        int[] array2c = {4, 5, 6, 9, 1, 2, 3};
        // isRotation(array1, array2c) should return false.
        int[] array2d = {4, 6, 5, 7, 1, 2, 3};
        // isRotation(array1, array2d) should return false.
        int[] array2e = {4, 5, 6, 7, 0, 2, 3};
        // isRotation(array1, array2e) should return false.
        int[] array2f = {1, 2, 3, 4, 5, 6, 7};
        // isRotation(array1, array2f) should return true.

        System.out.println(isRotation(array1, array2a));
        System.out.println(isRotation(array1, array2b));
        System.out.println(isRotation(array1, array2c));
        System.out.println(isRotation(array1, array2d));
        System.out.println(isRotation(array1, array2e));
        System.out.println(isRotation(array1, array2f));
    }

    // Implement your solution below.
    public static Boolean isRotation(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        int found = 0;

        for (int anArray1 : array1) {
            for (int anArray2 : array2) {
                if (anArray1 == anArray2) {
                    found++;
                    break;
                }
            }
        }

        return found == array1.length;
    }
}
