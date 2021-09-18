class Solution {
    public int[] twoSum(int[] nums, int target) {
     /*   int l=nums.length;
        int arr2[]=new int[2];
        int temp;
        for(int i=0;i<l;i++)
        {
            temp=nums[i];
            arr2[0]=i;
            for(int j=i+1;j<l;j++)
            {
                if((temp+nums[j])==target)
                {
                    arr2[1]=j;
                    return arr2;
                }
                
            }
        }
        return arr2;*/ //brute force
        Map<Integer, Integer> map= new HashMap<>();
        int arr2[]=new int[2];
        int l= nums.length;
        for(int i=0;i<l;i++)
        {
            int curr=nums[i];
            int temp=target-curr;
            arr2[0]=i;
            if(map.containsKey(temp))
            {
              arr2[1]= map.get(temp); 
                return arr2;
            }
            else
            {
                map.put(curr,i);
            }
               
        }
        return arr2;
        
    }
}
