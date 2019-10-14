package prep.leetcode;

import java.util.Arrays;

/**
 * @author sharifahmed
 * @since 2019-10-12
 */
public class SearchinRotatedSortedArray {

    public static void main(String[] args) {
        System.out.println(search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
        System.out.println(search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3));
        System.out.println(search(new int[]{1, 3}, 3));
        System.out.println(search(new int[]{3, 1}, 1));
    }

    public static int search(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }
        if (nums.length == 1) {
            return nums[0] == target ? 0 : -1;
        }

        int pivot = findPivot(nums);
        int index = findIndex(nums, target, pivot);

        return index < 0 ? -1 : index;
    }

    private static int findPivot(int[] nums) {
        int low = 0, high = nums.length - 1;
        int pivot = -1;

        while (low < high) {
            int mid = (low + high) / 2;

            if (mid < high && nums[mid] > nums[mid + 1]) {
                pivot = mid;
                break;
            } else if (mid > low && nums[mid - 1] > nums[mid]) {
                pivot = mid - 1;
                break;
            } else if (nums[low] >= nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return pivot;
    }

    private static int findIndex(int[] nums, int target, int pivot) {
        int index;

        if (pivot == -1) {
            index = Arrays.binarySearch(nums, target);
        } else if (nums[pivot] == target) {
            index = pivot;
        } else if (target >= nums[0]) {
            index = Arrays.binarySearch(nums, 0, pivot, target);
        } else {
            index = Arrays.binarySearch(nums, pivot + 1, nums.length, target);
        }

        return index;
    }
}