package problems.merge_sorted_array;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int k = nums1.length - 1;
        int i = m - 1;
        int j = n - 1;

        while (k >= 0 && i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i -= 1;
            } else {
                nums1[k] = nums2[j];
                j -= 1;
            }
            k -= 1;
        }

        while (i >= 0 && k >= 0) {
            nums1[k--] = nums1[i--];
        }

        while (j >= 0 && k >= 0) {
            nums1[k--] = nums2[j--];
        }

    }
}
