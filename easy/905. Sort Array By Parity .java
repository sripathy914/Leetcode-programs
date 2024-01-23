class Solution
{
    public int[] sortArrayByParity(int[] nums)
    {
        int arr1[]=new int[nums.length];
        int arr2[]=new int[nums.length];
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                arr1[k]=nums[i];
                k++;
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2!=0)
            {
                arr1[k]=nums[i];
                k++;
            }
        }
        return arr1;
    }
}
