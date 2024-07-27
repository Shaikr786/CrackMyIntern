
class Solution {
    static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arr , int n) {
        // code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[n];
        List<Integer> currentPermutation = new ArrayList<>();
        Integer[] arrArray = arr.toArray(new Integer[0]);
        Arrays.sort(arrArray); // Sort to handle duplicates
        backtrack(arrArray, used, currentPermutation, result);
        return result;
    }

    private static void backtrack(Integer[] arr, boolean[] used, List<Integer> currentPermutation, ArrayList<ArrayList<Integer>> result) {
        if (currentPermutation.size() == arr.length) {
            result.add(new ArrayList<>(currentPermutation));
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (used[i] || (i > 0 && arr[i].equals(arr[i - 1]) && !used[i - 1])) {
                continue;
            }
            used[i] = true;
            currentPermutation.add(arr[i]);
            backtrack(arr, used, currentPermutation, result);
            currentPermutation.remove(currentPermutation.size() - 1);
            used[i] = false;
        }
    }

};