package project;

public class LongSubSequence 
{
	static int lis(int nums[],int n )
	{
		int omax= 0;
        int[] dp = new int[nums.length];
        for(int i=0; i<dp.length; i++)
        {
            int max= 0;
            for(int j=0; j<i; j++)
            {
                if(nums[j]<nums[i])
                {
                    if(dp[j]>max)
                    {
                        max = dp[j];
                    }
                }
            }
            dp[i] = max + 1;
            if(dp[i]>omax){
                omax = dp[i];
            }
        }
        return omax;
	}
	public static void main(String[] args)
	{
		int arr[]={5,8,7,1,9,10};
		int n=arr.length;
		System.out.println(lis(arr,n));
	}

}
