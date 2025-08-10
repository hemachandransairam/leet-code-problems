class Solution {
    public void moveZeroes(int[] arr) {
        int arr2[] = new int[arr.length];
        int j =0;
        for(int i = 1;i<arr.length;i++){
            if(arr[j] == 0 && arr[i] != 0)
            {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
            else if(arr[j] != 0) j++;
        }
    }
}