#include <stdio.h>
#include <malloc.h>
/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* nums, int numsSize, int target, int* returnSize){
	int* ans=(int*)malloc(sizeof(int*)*2);
	int i,j;
	for (i=0;i<numsSize;i++) {
		for (j=i+1;j<numsSize;j++) {
			if (nums[i]+nums[j]==target) {
				ans[0]=i;
				ans[1]=j;
				*returnSize=2;
				
				return ans;
			} 
		}
	}
	return NULL;
	
}

int main() {
	int* nums=malloc(sizeof(int)*4);
	nums[0]=2;
	nums[1]=7;
	nums[2]=11;
	nums[3]=15;
	int target=9;
	int numsSize=4;
	int* returnSize=malloc(sizeof(int));
	
	int* ans=twoSum(nums,numsSize,target,returnSize);
	
	printf("ans=[%d, %d]\n",ans[0],ans[1]);
	
	free(nums);
	free(ans);
} 
