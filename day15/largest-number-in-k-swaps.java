
class Solution
{
    
    private static String maxNum;
    //Function to find the largest number after k swaps.
    public static String findMaximumNum(String str, int k)
        {
            //code here.
            maxNum = str;
            findMax(str.toCharArray() ,k);
            return maxNum;
        }
        
        private static void findMax(char[] str ,int k)
        {
            if(k == 0)
            {
                return;
            }
            
            for(int i = 0 ; i < str.length ; i++)
            {
                for(int j = i+1 ; j < str.length ; j++)
                {
                    if(str[i] < str[j])
                    {
                        swap(str ,i ,j);
                        String newStr = new String(str);
                        if(newStr.compareTo(maxNum) > 0)
                        {
                            maxNum = newStr;
                        }
                        findMax(str ,k-1);
                        swap(str ,i ,j);
                    }
                }
            }
        }
        
        private static void swap(char[] str ,int i ,int j)
        {
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
        }
}