class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        
        int i = 0;
        int j = 0;
        
        while(i<n && nums[i]<0)
        {
            i++;
        }
        
        j = i;
        i = i-1;
        
        int ans[] = new int[n];
        
        int k = 0;
        
        while(k<n)
        {
            if(i>=0 && j<n)
            {
                if(Math.pow(nums[i],2)>Math.pow(nums[j],2))
                {
                    ans[k++] = nums[j] * nums[j];
                    j++;
                }
                else if(Math.pow(nums[i],2)<Math.pow(nums[j],2))
                {
                    ans[k++] = nums[i] * nums[i];
                    i--;
                }
                else{
                    ans[k++] = nums[j] * nums[j];
                    ans[k++] = nums[j] * nums[j];
                    j++;
                    i--;
                }
            }
            else if(i>=0)
            {
                ans[k++] = nums[i] * nums[i];
                i--;
            }
            else if(j<n)
            {
                ans[k++] = nums[j] * nums[j];
                j++;
            }
        }
        
        return ans;
    }
}
