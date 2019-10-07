package findMedianSortedArrays;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i1=0,i2=0;
        int j1=nums1.length-1,j2=nums2.length-1;

        if (nums1.length>1 && nums1[0]>nums1[1]) {
            for (int i=0;i<nums1.length/2;i++) {
                int tmp=nums1[i];
                nums1[i]=nums1[nums1.length-i-1];
                nums1[nums1.length-1-i]=tmp;
            }
        }

        if (nums2.length>1 && nums2[0]>nums2[1]) {
            for (int i=0;i<nums2.length/2;i++) {
                int tmp=nums2[i];
                nums2[i]=nums2[nums2.length-i-1];
                nums2[nums2.length-1-i]=tmp;
            }
        }

        int max=0,min=0;

        while (i1<=j1 && i2<=j2) {
            if (nums1[i1]<nums2[i2]) {
                min=nums1[i1];
                i1++;
            } else {
                min=nums2[i2];
                i2++;
            }

            if (nums1[j1]>nums2[j2]) {
                max=nums1[j1];
                j1--;
            } else {
                max=nums2[j2];
                j2--;
            }
        }

        while (i1<=j1) {
            min=nums1[i1];
            i1++;

            max=nums1[j1];
            j1--;
        }

        while (i2<=j2) {
            min=nums2[i2];
            i2++;

            max=nums2[j2];
            j2--;
        }

        return (max+min)/2.0;
    }
}
