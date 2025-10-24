import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 7};
        int[] nums2 = {2, 4, 6, 8, 10};

        int[] mergedArray = mergeArrays(nums1, nums2);

        System.out.println("Merged Sorted Array: " + Arrays.toString(mergedArray));
    }

    // Method to merge two sorted arrays
    public static int[] mergeArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] result = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (nums1[i] <= nums2[j]) {
                result[k++] = nums1[i++];
            } else {
                result[k++] = nums2[j++];
            }
        }

        while (i < n1) {
            result[k++] = nums1[i++];
        }

        while (j < n2) {
            result[k++] = nums2[j++];
        }

        return result;
    }
}
