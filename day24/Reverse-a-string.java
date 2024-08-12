class Solution {

  public static String stringReverse(char[] arr) {
    // Write your code here.
    int start = 0;
    int end = arr.length -1;

    while(start < end)
    {
      char temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
    return new String(arr);

  }
}