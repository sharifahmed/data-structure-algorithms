package code.search;

/**
 * @author sharifahmed
 * @since 4/24/18
 *
 * BinarySearch
 */
public class Problem1 {

    private static int binarySearch(int[] values, int value) {
        int low = 0, high = values.length - 1, mid;

        while(low <= high) {
            mid = low + ((high - low) / 2); //always positive

            if (values[mid] < value) {
                low = mid + 1;

            } else if (values[mid] == value) {
                return mid;

            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] values = new int[]{-1,0,1,4,7}; //need to be sorted
        System.out.println(binarySearch(values, 7));
    }
}
