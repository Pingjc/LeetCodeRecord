#include <stdio.h>
#include <malloc.h>

double findMedianSortedArrays(int* nums1, int nums1Size, int* nums2, int nums2Size){
	int i1=0,i2=0;
    int j1=nums1Size-1,j2=nums2Size-1;
    int i;

    if (nums1Size>1 && nums1[0]>nums1[1]) {
        for (i=0;i<nums1Size/2;i++) {
            int tmp=nums1[i];
            nums1[i]=nums1[nums1Size-i-1];
            nums1[nums1Size-1-i]=tmp;
        }
    }

    if (nums2Size>1 && nums2[0]>nums2[1]) {
        for (i=0;i<nums2Size/2;i++) {
            int tmp=nums2[i];
            nums2[i]=nums2[nums2Size-i-1];
            nums2[nums2Size-1-i]=tmp;
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

int main() {
	int num1[]={1,3};
	int num2[]={2};
	
	printf("%f",findMedianSortedArrays(num1,2,num2,1));
}
