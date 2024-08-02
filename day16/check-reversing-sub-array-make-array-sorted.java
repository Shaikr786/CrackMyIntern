public class Solution {

    public static boolean srotedArray(int[] arr ,int n)
    {
        int x = -1;
        int y = -1;

        for(int i = 0 ; i < n -1 ; i++)
        {
            if(arr[i] > arr[i +1])
            {
                if(x == -1)
                {
                    x = i;
                }
                y = i +1;
            }
        }

        if(x != -1)
        {
            reverseArray(arr ,x ,y);
            for(int i = 0 ; i < n -1 ; i++)
            {
                if(arr[i] > arr[i +1])
                {
                    return false;
                }
            }
        }
        return true;
    }

    private static void reverseArray(int[] arr ,int x ,int y)
    {
        while ( x <= y)
        {
            int temp = arr[x];
            arr[x] = arr[y];
            arr[y] = arr[x];
            x ++;
            y --;
        }
    }
}