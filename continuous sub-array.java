class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        ArrayList<Integer> indexvalue = new ArrayList<Integer>();
        int st=0,sum=0;
       for(int i=0;i<n;i++)
       {
           sum+=arr[i];
           
           while(sum>s)
           {
               sum-=arr[st];
               st++;
           }
           
           if(sum==s && sum!=0)
           {
              indexvalue.add(st+1);
              indexvalue.add(i+1);
               
               return indexvalue;
           }
       }
       
      indexvalue.add(-1);
       return indexvalue;
    }
}