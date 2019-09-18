package TwoSum;

public class Main {
    public static void main(String[] args) {
        Solution solution=new Solution();
        int[] nums={2,7,11,15};
        int target=9;

        int[] ans=solution.twoSum(nums,target);
        for (int i=0;i<ans.length;i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
